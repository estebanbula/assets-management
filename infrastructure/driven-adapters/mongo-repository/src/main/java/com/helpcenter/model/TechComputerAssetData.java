package com.helpcenter.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@EqualsAndHashCode(callSuper = true)
@Document(collection = "asset")
@TypeAlias("technologicalComputerAsset")
public class TechComputerAssetData extends TechnologicalAssetData {

    private String processor;
    private String ram;
    private String storage;
}
