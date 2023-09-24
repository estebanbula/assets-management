package com.helpcenter;

import com.helpcenter.asset.gateway.IAsset;
import com.helpcenter.asset.model.Asset;
import com.helpcenter.model.AssetData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
@RequiredArgsConstructor
public class AssetAdapterImpl implements IAsset {

    private final AssetRepository repository;

    @Override
    public Flux<Asset> retrieveAssets() {
        return repository.findAll()
                .map(this::getAsset);
    }

    private Asset getAsset(AssetData assetData) {
        return new Asset().toBuilder()
                .assetId(assetData.getAssetId())
                .description(assetData.getDescription())
                .inChargeOf(assetData.getInChargeOf())
                .billNumber(assetData.getBillNumber())
                .acquiredAt(assetData.getAcquiredAt())
                .status(assetData.getStatus())
                .build();
    }
}
