package com.helpcenter.asset.gateway;

import com.helpcenter.asset.model.Asset;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IAsset {

    Flux<Asset> retrieveAssets();
    Mono<Asset> saveAsset(Asset asset);
    Mono<Asset> updateAsset(String id, Asset asset);
    Mono<Void> deleteAsset(String id);
}
