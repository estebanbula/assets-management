package com.helpcenter.asset.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor
public class AbstractAsset extends Asset {

    private String url;
    private String supplier;
    private Date expiresAt;

    @Builder(builderMethodName = "abstractAssetBuilder")
    public AbstractAsset(String assetId, String assignee, String acquiredAt, String bill, String description, String status, String url, String supplier, Date expiresAt) {
        super(assetId, assignee, acquiredAt, bill, description, status);
        this.url = url;
        this.supplier = supplier;
        this.expiresAt = expiresAt;
    }
}
