package com.helpcenter.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;

@Data
@DynamoDbBean
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TechComputerAssetData extends TechnologicalAssetData {

    private String processor;
    private String ram;
    private String storage;
}
