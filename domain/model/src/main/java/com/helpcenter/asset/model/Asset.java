package com.helpcenter.asset.model;

import com.helpcenter.assignee.model.Assignee;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Asset {

    private String assetId;
    private Assignee assignee;
    private String acquiredAt;
    private String bill;
    private String description;
    private String status;
}
