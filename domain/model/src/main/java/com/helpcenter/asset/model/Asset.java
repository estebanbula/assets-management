package com.helpcenter.asset.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class Asset {

    private String assetId;
    private String assignee;
    private Date acquiredAt;
    private String bill;
    private String description;
    private String status;
}
