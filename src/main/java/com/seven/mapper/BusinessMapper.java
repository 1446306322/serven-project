package com.seven.mapper;

import com.seven.bean.Business;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface BusinessMapper {
    @Select("select * from p_business")
    List<Business> selectAll();

    @Select("select mid,number from p_business_material where bid=#{bid}")
    List<Map<Integer,Integer>> selectMaterialById(@Param("bid") Integer bid);

    @Insert("insert into p_user_business(idcard,name,bname,time) values(#{idcard},#{name},#{bname},#{time})")
    void saveUserAndBusiness(@Param("idcard")Integer idcard,@Param("name")String name,@Param("bname")String bname,@Param("time")String time);
}
