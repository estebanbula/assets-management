package com.helpcenter.asset.model;

import com.helpcenter.assignee.model.Assignee;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class TechMonitorAsset extends TechnologicalAsset {

    private String inches;

    @Builder(builderMethodName = "technologicalMonitorBuilder")
    public TechMonitorAsset(String assetId, Assignee assignee, String acquiredAt, String bill, String description, String status, String brand, String location, String detail, String warranty, String expiresAt, String inches) {
        super(assetId, assignee, acquiredAt, bill, description, status, brand, location, detail, warranty, expiresAt);
        this.inches = inches;
    }
}
