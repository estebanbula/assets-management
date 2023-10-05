package com.helpcenter.asset.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor
public class TechComputerAsset extends TechnologicalAsset {

    private String processor;
    private String ram;
    private String storage;

    @Builder(builderMethodName = "technologicalComputerBuilder")
    public TechComputerAsset(String assetId, String assignee, String acquiredAt, String bill, String description, String status, String brand, String location, String detail, String warranty, String expiresAt, String processor, String ram, String storage) {
        super(assetId, assignee, acquiredAt, bill, description, status, brand, location, detail, warranty, expiresAt);
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }
}
