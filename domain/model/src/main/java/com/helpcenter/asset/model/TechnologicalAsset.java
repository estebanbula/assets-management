package com.helpcenter.asset.model;

import com.helpcenter.assignee.model.Assignee;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TechnologicalAsset extends Asset {

    private String brand;
    private String location;
    private String detail;
    private String warranty;
    private String expiresAt;

    @Builder(builderMethodName = "technologicalAssetBuilder")
    public TechnologicalAsset(String assetId, Assignee assignee, String acquiredAt, String bill, String description, String status, String brand, String location, String detail, String warranty, String expiresAt) {
        super(assetId, assignee, acquiredAt, bill, description, status);
        this.brand = brand;
        this.location = location;
        this.detail = detail;
        this.warranty = warranty;
        this.expiresAt = expiresAt;
    }
}
