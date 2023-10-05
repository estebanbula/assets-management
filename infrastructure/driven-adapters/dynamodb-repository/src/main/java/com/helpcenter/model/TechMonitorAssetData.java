package com.helpcenter.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;

@Data
@DynamoDbBean
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TechMonitorAssetData extends TechnologicalAssetData {

    private String inches;
}
