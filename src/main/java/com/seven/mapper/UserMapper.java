package com.seven.mapper;

import com.seven.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


public interface UserMapper {
    @Select("select idcard,name,password,phone,address from p_user where idcard=#{idcard} and password=#{password}")
    User login(@Param("idcard") Integer idcard, @Param("password") String password);

    @Insert("insert into p_user(idcard,name,password) values(#{idcard},#{name},#{password})")
    int register(User user);
}
