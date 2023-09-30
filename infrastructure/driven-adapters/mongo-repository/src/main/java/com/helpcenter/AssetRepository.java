package com.helpcenter;

import com.helpcenter.model.AssetData;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface AssetRepository extends ReactiveMongoRepository<AssetData, String> {
}
