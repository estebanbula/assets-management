package com.helpcenter.operations;

import com.helpcenter.asset.gateway.AssetDynamoAsyncGateway;
import com.helpcenter.asset.model.Asset;
import com.helpcenter.asset.model.TechnologicalAsset;
import com.helpcenter.model.TechnologicalAssetData;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbAsyncTable;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbEnhancedAsyncClient;
import software.amazon.awssdk.enhanced.dynamodb.TableSchema;

@Component
@RequiredArgsConstructor
public class DynamoAsyncConsumer implements AssetDynamoAsyncGateway {

    private final DynamoDbEnhancedAsyncClient dynamoDbEnhancedClient;
    private final ModelMapper modelMapper;

    @Override
    public Flux<Asset> retrieveAssets() {
        return null;
    }

    @Override
    public Mono<Void> putAsset(TechnologicalAsset asset) {
        DynamoDbAsyncTable<TechnologicalAssetData> assetDataDynamoDbAsyncTable =
                dynamoDbEnhancedClient.table("asset",
                        TableSchema.fromBean(TechnologicalAssetData.class));
        var assetDate = modelMapper.map(asset, TechnologicalAssetData.class);
        return Mono.fromCompletionStage(assetDataDynamoDbAsyncTable.putItem(assetDate));
    }

    @Override
    public Mono<Asset> updateAsset(String id, Asset asset) {
        return null;
    }

    @Override
    public Mono<Void> deleteAsset(String id) {
        return null;
    }
}
