package com.helpcenter.api.services.asset;

import com.helpcenter.api.services.utils.ApiProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RequestPredicates.path;
import static org.springframework.web.reactive.function.server.RouterFunctions.nest;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
@RequiredArgsConstructor
public class AssetRoute {

    private final ApiProperties apiProperties;

    @Bean
    public RouterFunction<ServerResponse> assetRoutes(AssetHandler handler) {
        return nest(path(apiProperties.getPathBase()).and(accept(MediaType.APPLICATION_JSON)),
                route()
                        .GET("", handler::retrieveAssets)
                        .POST("", handler::addAsset).build());
    }
}
