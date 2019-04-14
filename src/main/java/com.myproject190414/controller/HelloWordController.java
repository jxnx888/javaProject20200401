package com.myproject190414.controller;

import com.myproject190414.pojo.ExpensesRecord;
import com.myproject190414.pojo.ExpensesRecordExample;
import com.myproject190414.service.ExpensesRecordService;
import com.sun.deploy.net.HttpResponse;
import net.sf.json.JSONArray;
import netscape.javascript.JSObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * *****************************************************************************************
 *
 * @ClassName HelloWordController
 * @Author: cjc
 * @Descripeion TODO
 * @Date： 2019/4/14 17:36
 * @Version 1.0
 * <p>
 * <p>
 * Version    Date                ModifiedBy                 Content
 * --------   ---------           ----------                -----------------------
 * 1.0.0       17:362019/4/14     cjc                       初版
 * ******************************************************************************************
 */
@Controller
@RequestMapping(value = "/hello")
public class HelloWordController {
    @Autowired
    ExpensesRecordService expensesRecordService;
    @RequestMapping(value = "/get")
    public String HelloWord(HttpServletRequest request, HttpServletResponse response){
        String s="sss";
        ExpensesRecordExample expensesRecordExample = new ExpensesRecordExample();
        List<ExpensesRecord> expensesRecords = expensesRecordService.selectByExample(expensesRecordExample);
        if(expensesRecords.size()>0){
            request.setAttribute("message", JSONArray.fromObject(expensesRecords));
        }else {
            request.setAttribute("message",s);
        }
        return "html/index.html";
    }
}
