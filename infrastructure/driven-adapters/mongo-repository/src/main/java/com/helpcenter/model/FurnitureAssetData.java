package com.helpcenter.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@EqualsAndHashCode(callSuper = true)
@Document(collection = "asset")
@TypeAlias("furnitureAsset")
public class FurnitureAssetData extends AssetData {

    private String manufacturer;
    private String location;
    private Integer quantity;
    private String detail;
    private String maintainer;
}
