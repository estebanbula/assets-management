package com.helpcenter.config;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;
import reactor.rabbitmq.RabbitFlux;
import reactor.rabbitmq.Receiver;
import reactor.rabbitmq.ReceiverOptions;
import reactor.rabbitmq.Sender;
import reactor.rabbitmq.SenderOptions;

@Configuration
public class RabbitMqConfig {

    @Value("${adapters.rabbitmq.host}")
    private String rabbitHost;
    @Value("${adapters.rabbitmq.username}")
    private String rabbitUsername;
    @Value("${adapters.rabbitmq.password}")
    private String rabbitPwd;
    @Value("${adapters.rabbitmq.port}")
    private Integer rabbitPort;

    public static final String TOPIC_EXCHANGE = "assignees-topic-exchange";
    public static final String QUEUE_EVENTS_GENERAL = "assignees.events.general";
    public static final String ROUTING_KEY_EVENTS_GENERAL = "assignees.routing.key.events.#";

    @Bean
    @Primary
    public Mono<Connection> rabbitConnectionMono() {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.setHost(rabbitHost);
        connectionFactory.setPort(rabbitPort);
        connectionFactory.setUsername(rabbitUsername);
        connectionFactory.setVirtualHost("/");
        connectionFactory.setPassword(rabbitPwd);
        return Mono.fromCallable(() -> connectionFactory.newConnection("events-handler"));
    }

    @Bean
    public Sender sender(Mono<Connection> connectionMono) {
        return RabbitFlux.createSender(new SenderOptions()
                .connectionMono(connectionMono)
                .resourceManagementScheduler(Schedulers.boundedElastic()));
    }

    @Bean
    public Receiver receiver(Mono<Connection> connectionMono) {
        return RabbitFlux.createReceiver(new ReceiverOptions()
                .connectionMono(connectionMono));
    }
}
