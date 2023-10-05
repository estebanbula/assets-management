package com.helpcenter.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;

@Data
@DynamoDbBean
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TechnologicalAssetData extends AssetData {

    private String brand;
    private String location;
    private String detail;
    private String warranty;
    private String expiresAt;
}
