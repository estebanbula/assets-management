package com.helpcenter.asset.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TechComputerAsset extends TechnologicalAsset {

    private String processor;
    private String ram;
    private String storage;

}
