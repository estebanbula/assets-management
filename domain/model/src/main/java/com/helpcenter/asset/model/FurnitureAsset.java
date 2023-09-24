package com.helpcenter.asset.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class FurnitureAsset extends Asset {

    private String manufacturer;
    private String location;
    private Integer quantity;
    private String detail;
    private String maintainer;
}
