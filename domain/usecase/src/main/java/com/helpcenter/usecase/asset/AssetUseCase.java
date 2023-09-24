package com.helpcenter.usecase.asset;

import com.helpcenter.asset.gateway.IAsset;
import com.helpcenter.asset.model.Asset;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
public class AssetUseCase {

    private final IAsset assetRepository;

    public Flux<Asset> retrieveAssets() {
        return assetRepository.retrieveAssets();
    }
}
