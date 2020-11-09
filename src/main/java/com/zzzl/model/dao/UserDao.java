package com.zzzl.model.dao;

import com.zzzl.model.bean.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author zzzzl
 * @Description
 * @date 2020-10-30 09:48
 */
@Repository
public interface UserDao extends JpaRepository<User,Integer> {

}
