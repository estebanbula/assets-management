package com.helpcenter.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;

@Data
@DynamoDbBean
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class FurnitureAssetData extends AssetData {

    private String manufacturer;
    private String location;
    private Integer quantity;
    private String detail;
    private String maintainer;
}
