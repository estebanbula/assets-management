package com.helpcenter.asset.model;

import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class AbstractAsset extends Asset {

    private String url;
    private String supplier;
    private Date expiresAt;
}
