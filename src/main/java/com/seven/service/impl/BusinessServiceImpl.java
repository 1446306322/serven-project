package com.seven.service.impl;

import com.seven.bean.Business;
import com.seven.bean.Material;
import com.seven.mapper.BusinessMapper;
import com.seven.mapper.MaterialMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BusinessServiceImpl {
    @Autowired
    private BusinessMapper businessMapper;
    @Autowired
    private MaterialMapper materialMapper;

    public List<Business> selectAllBusiness(){
        return businessMapper.selectAll();
    }

    public void saveUserAndBusiness(Integer idcard,String name,String bname,String time){
        businessMapper.saveUserAndBusiness(idcard,name,bname,time);
    }

    public Map<String,Integer> selectMaterialById(Integer bid){
        List<Map<Integer,Integer>> numberMap = businessMapper.selectMaterialById(bid);
        System.out.println(numberMap);
        Map<String,Integer> materialAndNumMap = new HashMap<String,Integer>();
        Integer number = null;
        String mname = null;
        for(int i=0;i<numberMap.size();i++) {
            for (Map.Entry<Integer, Integer> a : numberMap.get(i).entrySet()){
                if("number".equals(a.getKey())){
                    number = a.getValue();
                }else if("mid".equals(a.getKey())){
                    Material material = materialMapper.selectById(a.getValue());
                    mname = material.getMname();
                }
                if(number !=null && mname!=null){
                    materialAndNumMap.put(mname,number);
                }
            }
        }
        System.out.println(materialAndNumMap);
        return materialAndNumMap;
    }
}
