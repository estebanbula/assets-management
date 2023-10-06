package com.helpcenter.asset.model;

import com.helpcenter.assignee.model.Assignee;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class FurnitureAsset extends Asset {

    private String manufacturer;
    private String location;
    private Integer quantity;
    private String detail;
    private Assignee maintainer;

    @Builder(builderMethodName = "furnitureAssetBuilder")
    public FurnitureAsset(String assetId, Assignee assignee, String acquiredAt, String bill, String description, String status, String manufacturer, String location, Integer quantity, String detail, Assignee maintainer) {
        super(assetId, assignee, acquiredAt, bill, description, status);
        this.manufacturer = manufacturer;
        this.location = location;
        this.quantity = quantity;
        this.detail = detail;
        this.maintainer = maintainer;
    }
}
