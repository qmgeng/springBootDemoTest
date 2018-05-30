package com.example.demo.dao;

import com.example.demo.bean.BidLanguageRelation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BidLanguageRelationMapper {

//    @Select("select * from alert_bid_language_relation WHERE 1 = 1 and status = 1")
    public List<BidLanguageRelation> list();
}
