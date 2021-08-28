package com.seven.mapper;

import com.seven.bean.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


public interface UserMapper {
    @Select("select idcard,name,phone,address from p_user where idcard=#{idcard} and name=#{name}")
    User login(@Param("idcard") Integer idcard, @Param("name") String name);
}
