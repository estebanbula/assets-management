package com.helpcenter.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@Document(collection = "asset")
@TypeAlias("abstractAsset")
public class AbstractAssetData extends AssetData {

    private String url;
    private String supplier;
    private Date expiresAt;
}
