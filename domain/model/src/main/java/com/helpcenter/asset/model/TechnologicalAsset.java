package com.helpcenter.asset.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TechnologicalAsset extends Asset {

    private String brand;
    private String location;
    private String detail;
    private String warranty;
    private Date expiresAt;
}
