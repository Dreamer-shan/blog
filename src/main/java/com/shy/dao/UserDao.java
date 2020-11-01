package com.shy.dao;

import com.shy.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: shy
 * @Date: 2020/10/27/17:17
 * @Description:
 */
// 让Mybatis找到对应的mapper，在编译的时候动态生成代理类，实现相应SQL功能
@Mapper

@Repository
public interface UserDao {
    User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
