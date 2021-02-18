package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.OutgoIncomeHistory;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface OutgoIncomeHistoryMapper extends BaseMapper<OutgoIncomeHistory> {

}
