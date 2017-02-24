package com.wyl.db.dao;

import com.wyl.bean.TestUser;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by dfsj0317 on 2017/2/24.
 */
@Repository
public class DemoDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    public TestUser getInfoById(long id){
        String sql = "select id,name from test_user where id = ?";

        RowMapper<TestUser> rowMapper = new BeanPropertyRowMapper<TestUser>(TestUser.class);

        return jdbcTemplate.queryForObject(sql, rowMapper,id);
    }
}
