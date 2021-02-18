package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.CountList;
import com.example.demo.entity.OutgoIncomeHistory;
import com.example.demo.mapper.OutgoIncomeHistoryMapper;
import com.example.demo.service.IOutgoIncomeHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2021-02-17
 */
@Service
public class OutgoIncomeHistoryServiceImpl extends ServiceImpl<OutgoIncomeHistoryMapper, OutgoIncomeHistory> implements IOutgoIncomeHistoryService {

    @Autowired
    private OutgoIncomeHistoryMapper outgoIncomeHistoryMapper;

    @Override
    public CountList<OutgoIncomeHistory> test(int pageNumber,int pageSize) {
        int count = count();
        return new CountList<>(count,this.page(new Page<>(pageNumber,pageSize)).getRecords());
    }
}
