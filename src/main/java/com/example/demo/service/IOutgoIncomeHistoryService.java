package com.example.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.CountList;
import com.example.demo.entity.OutgoIncomeHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author jobob
 * @since 2021-02-17
 */
@Service
public interface IOutgoIncomeHistoryService extends IService<OutgoIncomeHistory> {
    CountList<OutgoIncomeHistory> test(int pageNumber,int pageSize);
}
