package com.helpcenter.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@Document(collection = "asset")
@TypeAlias("technologicalAsset")
public class TechnologicalAssetData extends AssetData {

    private String brand;
    private String location;
    private String detail;
    private String warrantyDetail;
    private Date expiresAt;
}
