package com.helpcenter.asset.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor
public class FurnitureAsset extends Asset {

    private String manufacturer;
    private String location;
    private Integer quantity;
    private String detail;
    private String maintainer;

    @Builder(builderMethodName = "furnitureAssetBuilder")
    public FurnitureAsset(String assetId, String assignee, String acquiredAt, String bill, String description, String status, String manufacturer, String location, Integer quantity, String detail, String maintainer) {
        super(assetId, assignee, acquiredAt, bill, description, status);
        this.manufacturer = manufacturer;
        this.location = location;
        this.quantity = quantity;
        this.detail = detail;
        this.maintainer = maintainer;
    }
}
