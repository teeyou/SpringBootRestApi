package com.teeu;

import model.Menu;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MenuMapper {
    @Select("select * from menu where id=#{id}")
    Menu getMenu(@Param("id") String id);

    @Select("select * from menu")
    public List<Menu> getMenuList();

    @Insert("insert into menu values(#{id}, #{image}, ${name_ko}, #{name}, #{price})")
    int insertMenu(@Param("id") String id,
                   @Param("image") String image,
                   @Param("name_ko") String name_ko,
                   @Param("name") String name,
                   @Param("price") int price);

    @Update("update menu set image=#{image}, name=#{name}, ${name_ko}, price=#{price} where id=#{id}")
    int updateMenu(@Param("id") String id,
                   @Param("image") String image,
                   @Param("name_ko") String name_ko,
                   @Param("name") String name,
                   @Param("price") int price);

    @Delete("delete from menu where id=#{id}")
    int deleteMenu(@Param("id") String id);
}
