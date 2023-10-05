package com.helpcenter.asset.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Asset {

    private String assetId;
    private String assignee;
    private String acquiredAt;
    private String bill;
    private String description;
    private String status;
}
