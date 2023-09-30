package com.helpcenter.adapter;

import com.helpcenter.AssetRepository;
import com.helpcenter.asset.gateway.IAsset;
import com.helpcenter.asset.model.Asset;
import com.helpcenter.asset.model.TechnologicalAsset;
import com.helpcenter.model.AssetData;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class AssetAdapterImpl implements IAsset {

    private final AssetRepository repository;

    @Override
    public Flux<Asset> retrieveAssets() {
        return repository.findAll()
                .map(this::getAsset);
    }

    @Override
    public Mono<Asset> saveAsset(Asset asset) {
        return repository.save(getAssetDocument(asset))
                .map(this::getAsset);
    }

    @Override
    public Mono<Asset> updateAsset(String id, Asset asset) {
        return null;
    }

    @Override
    public Mono<Void> deleteAsset(String id) {
        return null;
    }

    private Asset getAsset(AssetData assetData) {
        return new Asset().toBuilder()
                .assetId(assetData.getAssetId())
                .description(assetData.getDescription())
                .assignee(assetData.getAssignee())
                .bill(assetData.getBill())
                .acquiredAt(assetData.getAcquiredAt())
                .status(assetData.getStatus())
                .build();
    }

    private AssetData getAssetDocument(Asset asset) {
        return new AssetData().toBuilder()
                .assetId(asset.getAssetId())
                .assignee(asset.getAssignee())
                .acquiredAt(asset.getAcquiredAt())
                .bill(asset.getBill())
                .description(asset.getDescription())
                .status(asset.getStatus())
                .build();
    }
}
