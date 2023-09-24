package com.helpcenter.asset.model;

import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TechnologicalAsset extends Asset {

    private String brand;
    private String location;
    private String detail;
    private String warrantyDetail;
    private Date expiresAt;
}
