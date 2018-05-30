package com.example.demo.service;

import com.example.demo.bean.BidLanguageRelation;
import com.example.demo.dao.BidLanguageRelationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BidLanguageRelationService {

    @Autowired
    private BidLanguageRelationMapper bidLanguageRelationMapper;

    public List<BidLanguageRelation> list(){
        return bidLanguageRelationMapper.list();
    }
}
