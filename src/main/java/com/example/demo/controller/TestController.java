package com.example.demo.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.CountList;
import com.example.demo.entity.OutgoIncomeHistory;
import com.example.demo.service.IOutgoIncomeHistoryService;
import com.example.demo.service.impl.OutgoIncomeHistoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TestController {


    @Qualifier("outgoIncomeHistoryServiceImpl")
    @Autowired
    private final IOutgoIncomeHistoryService iOutgoIncomeHistoryService = new OutgoIncomeHistoryServiceImpl();

    @RequestMapping("/test")
    public CountList<OutgoIncomeHistory> test(
            @RequestParam("page_number") int pageNumber,
            @RequestParam("page_size") int pageSize
    ) {
        return iOutgoIncomeHistoryService.test(pageNumber, pageSize);
    }
}
