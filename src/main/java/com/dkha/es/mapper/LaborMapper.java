package com.dkha.es.mapper;

import com.dkha.es.entity.Labor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface LaborMapper {


    List<Labor> page(@Param("page") int page, @Param("size") int size);
}
