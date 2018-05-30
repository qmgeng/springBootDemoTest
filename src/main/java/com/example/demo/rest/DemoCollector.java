package com.example.demo.rest;

import com.example.demo.bean.BidLanguageRelation;
import com.example.demo.dao.BidLanguageRelationMapper;
import com.example.demo.service.BidLanguageRelationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoCollector {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${demo.testValue}")
    private  String name;

    @Autowired
    private BidLanguageRelationService bidLanguageRelationService;

    @GetMapping("/get")
    public String get() {
        logger.info("test logger!!");
        List<BidLanguageRelation> listBids =  bidLanguageRelationService.list();
        logger.info("/get" + listBids.toString());
        return name;
    }
}
