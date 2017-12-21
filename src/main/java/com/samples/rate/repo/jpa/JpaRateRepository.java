package com.samples.rate.repo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.samples.rate.domain.Rate;

@Repository
public interface JpaRateRepository extends JpaRepository<Rate, String> {
}
