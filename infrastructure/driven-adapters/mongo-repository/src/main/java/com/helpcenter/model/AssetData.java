package com.helpcenter.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "asset")
public class AssetData {

    @Id
    private String assetId;
    private String inChargeOf;
    private Date acquiredAt;
    private String billNumber;
    private String description;
    private String status;
}
