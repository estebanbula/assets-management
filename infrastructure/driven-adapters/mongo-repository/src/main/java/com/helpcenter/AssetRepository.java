package com.helpcenter;

import com.helpcenter.model.AssetData;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

public interface AssetRepository extends ReactiveMongoRepository<AssetData, String> {
}
