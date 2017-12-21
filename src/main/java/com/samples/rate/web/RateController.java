package com.samples.rate.web;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.samples.rate.domain.Rate;
import com.samples.rate.service.RateService;

@RestController
@RequestMapping(value = "/rates")
public class RateController {
    private static final Logger logger = LoggerFactory.getLogger(RateController.class);
    private RateService rateService;

    @Autowired
    public RateController(RateService rateService) {
        this.rateService = rateService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Rate> rates() {
        return rateService.rates();
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Rate add(@RequestBody @Valid Rate rate) {
       
        return rateService.add(rate);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Rate update(@RequestBody @Valid Rate rate) {
      
        return rateService.update(rate);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Rate getById(@PathVariable String id) {
       
        return rateService.getById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable String id) {
       
        rateService.deleteById(id);
    }
}