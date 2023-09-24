package com.helpcenter.asset.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TechMonitorAsset extends TechnologicalAsset {

    private String inches;
}
