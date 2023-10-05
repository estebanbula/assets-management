package com.helpcenter.asset.gateway;

import com.helpcenter.asset.model.Asset;
import com.helpcenter.asset.model.TechnologicalAsset;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AssetDynamoAsyncGateway {

    Flux<Asset> retrieveAssets();
    Mono<Void> putAsset(TechnologicalAsset asset);
    Mono<Asset> updateAsset(String id, Asset asset);
    Mono<Void> deleteAsset(String id);
}
