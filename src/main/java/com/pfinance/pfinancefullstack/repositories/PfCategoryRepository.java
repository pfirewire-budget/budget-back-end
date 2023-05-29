package com.pfinance.pfinancefullstack.repositories;

import com.pfinance.pfinancefullstack.models.PfBucket;
import com.pfinance.pfinancefullstack.models.PfCategory;
import com.pfinance.pfinancefullstack.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PfCategoryRepository extends JpaRepository<PfCategory, Long> {

    List<PfCategory> findAllByUser(User user);

    PfCategory findByBuckets(PfBucket pfBucket);
}
