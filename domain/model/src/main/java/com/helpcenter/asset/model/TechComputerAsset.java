package com.helpcenter.asset.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TechComputerAsset extends TechnologicalAsset {

    private String processor;
    private String ram;
    private String storage;
}
