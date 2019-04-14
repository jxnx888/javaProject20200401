package com.myproject190414.service.impl;

import com.myproject190414.mapper.ExpensesRecordMapper;
import com.myproject190414.pojo.ExpensesRecord;
import com.myproject190414.pojo.ExpensesRecordExample;
import com.myproject190414.service.ExpensesRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ExecutorService;

/**
 * *****************************************************************************************
 *
 * @ClassName ExpensesRecordServiceImpl
 * @Author: cjc
 * @Descripeion TODO
 * @Date： 2019/4/14 16:45
 * @Version 1.0
 * <p>
 * <p>
 * Version    Date                ModifiedBy                 Content
 * --------   ---------           ----------                -----------------------
 * 1.0.0       16:452019/4/14     cjc                       初版
 * ******************************************************************************************
 */
@Service
public class ExpensesRecordServiceImpl implements ExpensesRecordService {
    @Autowired
    ExpensesRecordMapper expensesRecordMapper;
    @Override
    public int countByExample(ExpensesRecordExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(ExpensesRecordExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(ExpensesRecord record) {
        return 0;
    }

    @Override
    public int insertSelective(ExpensesRecord record) {
        return 0;
    }

    @Override
    public List<ExpensesRecord> selectByExample(ExpensesRecordExample example) {
        return expensesRecordMapper.selectByExample(example);
    }

    @Override
    public ExpensesRecord selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(ExpensesRecord record, ExpensesRecordExample example) {
        return 0;
    }

    @Override
    public int updateByExample(ExpensesRecord record, ExpensesRecordExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(ExpensesRecord record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(ExpensesRecord record) {
        return 0;
    }
}
