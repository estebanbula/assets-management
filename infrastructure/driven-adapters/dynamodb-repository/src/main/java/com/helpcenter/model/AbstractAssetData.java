package com.helpcenter.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;

import java.util.Date;

@Data
@DynamoDbBean
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class AbstractAssetData extends AssetData {

    private String url;
    private String supplier;
    private Date expiresAt;
}
