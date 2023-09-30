package com.helpcenter.usecase.asset;

import com.helpcenter.asset.gateway.IAsset;
import com.helpcenter.asset.model.Asset;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class AssetUseCase {

    private final IAsset assetRepository;

    public Flux<Asset> retrieveAssets() {
        return assetRepository.retrieveAssets();
    }

    public Mono<Asset> addAsset(Asset asset) {
        return assetRepository.saveAsset(asset);
    }
}
