package com.seven.service.impl;

import com.seven.bean.Material;
import com.seven.mapper.MaterialMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MaterialServiceImpl {
    @Autowired
    private MaterialMapper materialMapper;

    public List<Material> selectAllMaterial(){
        return materialMapper.selectAllMaterial();
    }
}
