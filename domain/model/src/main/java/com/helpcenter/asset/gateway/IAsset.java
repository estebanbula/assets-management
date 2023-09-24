package com.helpcenter.asset.gateway;

import com.helpcenter.asset.model.Asset;
import reactor.core.publisher.Flux;

public interface IAsset {

    Flux<Asset> retrieveAssets();
}
