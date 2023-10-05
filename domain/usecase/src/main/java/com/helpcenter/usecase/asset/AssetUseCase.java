package com.helpcenter.usecase.asset;

import com.helpcenter.asset.gateway.AssetDynamoAsyncGateway;
import com.helpcenter.asset.model.Asset;
import com.helpcenter.asset.model.TechnologicalAsset;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RequiredArgsConstructor
public class AssetUseCase {

    private final AssetDynamoAsyncGateway assetRepository;

    public Flux<Asset> retrieveAssets() {
        return assetRepository.retrieveAssets();
    }

    public Mono<Void> addAsset(TechnologicalAsset asset) {
        asset.setAssetId(UUID.randomUUID().toString());
        return assetRepository.putAsset(asset);
    }
}
