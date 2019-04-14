package com.myproject190414.service;

import com.myproject190414.pojo.ExpensesRecord;
import com.myproject190414.pojo.ExpensesRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExpensesRecordService {

    int countByExample(ExpensesRecordExample example);

    int deleteByExample(ExpensesRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExpensesRecord record);

    int insertSelective(ExpensesRecord record);

    List<ExpensesRecord> selectByExample(ExpensesRecordExample example);

    ExpensesRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExpensesRecord record, @Param("example") ExpensesRecordExample example);

    int updateByExample(@Param("record") ExpensesRecord record, @Param("example") ExpensesRecordExample example);

    int updateByPrimaryKeySelective(ExpensesRecord record);

    int updateByPrimaryKey(ExpensesRecord record);

}
