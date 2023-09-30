package com.helpcenter.asset.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class FurnitureAsset extends Asset {

    private String manufacturer;
    private String location;
    private Integer quantity;
    private String detail;
    private String maintainer;
}
