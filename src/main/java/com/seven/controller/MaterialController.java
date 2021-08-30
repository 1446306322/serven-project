package com.seven.controller;

import com.seven.bean.Material;
import com.seven.service.impl.MaterialServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("material")
public class MaterialController {

    @Autowired
    private MaterialServiceImpl materialService;

    @GetMapping()
    @ApiOperation("全部材料查询接口")
    public List<Material> selectAllMaterial(){
        return materialService.selectAllMaterial();
    }
}
