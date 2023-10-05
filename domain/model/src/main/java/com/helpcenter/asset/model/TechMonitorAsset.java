package com.helpcenter.asset.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor
public class TechMonitorAsset extends TechnologicalAsset {

    private String inches;

    @Builder(builderMethodName = "technologicalMonitorBuilder")
    public TechMonitorAsset(String assetId, String assignee, String acquiredAt, String bill, String description, String status, String brand, String location, String detail, String warranty, String expiresAt, String inches) {
        super(assetId, assignee, acquiredAt, bill, description, status, brand, location, detail, warranty, expiresAt);
        this.inches = inches;
    }
}
