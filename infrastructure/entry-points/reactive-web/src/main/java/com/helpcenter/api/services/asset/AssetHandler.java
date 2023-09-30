package com.helpcenter.api.services.asset;

import com.helpcenter.asset.model.Asset;
import com.helpcenter.asset.model.TechnologicalAsset;
import com.helpcenter.usecase.asset.AssetUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class AssetHandler {

    private final AssetUseCase assetUseCase;

    public Mono<ServerResponse> retrieveAssets(ServerRequest serverRequest) {
        return ServerResponse.ok().body(assetUseCase.retrieveAssets(), Asset.class);
    }

    public Mono<ServerResponse> addAsset(ServerRequest serverRequest) {
        return serverRequest.bodyToMono(TechnologicalAsset.class)
                .flatMap(assetUseCase::addAsset)
                .flatMap(ServerResponse.status(HttpStatus.CREATED)::bodyValue);
    }
}
