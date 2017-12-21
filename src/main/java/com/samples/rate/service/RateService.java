package com.samples.rate.service;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.samples.rate.domain.Rate;

@Service
public class RateService {
    private static final Logger logger = LoggerFactory.getLogger(RateService.class);
    private CrudRepository<Rate, String> repository;

    @Autowired
    public RateService(CrudRepository<Rate, String> repository) {
        this.repository = repository;
    }

    @HystrixCommand()
    public Iterable<Rate> rates() {
        return repository.findAll();
    }

    @HystrixCommand()
    public Rate add(@RequestBody @Valid Rate rate) {
        logger.info("Adding Rate " + rate.getId());
        return repository.save(rate);
    }

    @HystrixCommand()
    public Rate update(@RequestBody @Valid Rate rate) {
        logger.info("Updating Rate " + rate.getId());
        return repository.save(rate);
    }

    @HystrixCommand()
    public Rate getById(@PathVariable String id) {
        logger.info("Getting Rate " + id);
        return repository.findOne(id);
    }

    @HystrixCommand()
    public void deleteById(@PathVariable String id) {
        logger.info("Deleting Rate " + id);
        repository.delete(id);
    }
}