package com.seven.mapper;

import com.seven.bean.Material;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MaterialMapper {

    @Select("select id,mname,mtype from p_material")
    List<Material> selectAllMaterial();

    @Select("select id,mname,mtype from p_material where id=#{id}")
    Material selectById(@Param("id") Integer id);
}
