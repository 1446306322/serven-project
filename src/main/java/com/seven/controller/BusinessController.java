package com.seven.controller;

import com.seven.bean.Business;
import com.seven.service.UserService;
import com.seven.service.impl.BusinessServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("business")
public class BusinessController {
    @Autowired
    private BusinessServiceImpl businessService;

    @GetMapping
    @ApiOperation("全部业务查询接口")
    public List<Business> selectAllBusiness(){
        return businessService.selectAllBusiness();
    }

    @GetMapping("/{id}")
    @ApiOperation("查询业务所需材料接口")
    public Map<String,Integer> selectMaterialById(@PathVariable(name = "id")Integer id){
        return businessService.selectMaterialById(id);
    }

    @PostMapping
    @ApiOperation("保存用户选择的业务接口")
    public void saveUserAndBusiness(Integer idcard,String name,String bname,String time){
        businessService.saveUserAndBusiness(idcard,name,bname,time);
    }
}
