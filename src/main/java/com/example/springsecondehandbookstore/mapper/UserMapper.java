package com.example.springsecondehandbookstore.mapper;

import com.example.springsecondehandbookstore.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper // 注入springboot
public interface UserMapper {
    @Select("select * from users;")
    List<User> findAll();

    @Insert("INSERT INTO users (username,`password`,grade,college,major,phone,school,address) " +
            "VALUES(#{username},#{password},#{grade},#{college},#{major},#{phone},#{school},#{address})")
    int insert(User user);

    int update(User user);
    @Delete("delete from users where id = #{id}")
    Integer deleteById(@Param("id") Integer id);

}
