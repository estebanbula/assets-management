package com.helpcenter.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Builder(toBuilder = true)
@Document(collection = "asset")
@TypeAlias("asset")
@AllArgsConstructor
@NoArgsConstructor
public class AssetData {

    @Id
    private String assetId;
    private String assignee;
    private Date acquiredAt;
    private String bill;
    private String description;
    private String status;
}
