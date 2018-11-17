package com.soochow.nlp.mercury.mapper;

import com.soochow.nlp.mercury.model.Ta;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TaMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Ta record);

    Ta selectByPrimaryKey(Long id);

    List<Ta> selectAll();

    int updateByPrimaryKey(Ta record);
}