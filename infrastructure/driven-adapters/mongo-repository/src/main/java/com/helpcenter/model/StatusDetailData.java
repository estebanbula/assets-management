package com.helpcenter.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "statusDetail")
public class StatusDetailData {

    @Id
    private String statusId;
    private String description;
}
