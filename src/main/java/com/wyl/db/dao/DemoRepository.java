package com.wyl.db.dao;

import com.wyl.bean.TestUser;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by dfsj0317 on 2017/2/24.
 */
public interface DemoRepository extends CrudRepository<TestUser, Long> {
}
