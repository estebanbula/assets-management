package com.helpcenter.asset.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Asset {

    private String assetId;
    private String inChargeOf;
    private Date acquiredAt;
    private String billNumber;
    private String description;
    private String status;
}
