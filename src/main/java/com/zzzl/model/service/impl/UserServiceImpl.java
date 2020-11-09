package com.zzzl.model.service.impl;

import com.zzzl.model.bean.User;
import com.zzzl.model.dao.UserDao;
import com.zzzl.model.form.ListUserForm;
import com.zzzl.model.vo.PageVo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zzzzl
 * @Description
 * @date 2020-10-29 16:11
 */
@Service
public class UserServiceImpl {
    @Autowired
    private UserDao userDao;

    public PageVo<User> listUser(ListUserForm listUserForm) {
        PageVo<User> pageVo = new PageVo<User>().setCurrentAndSize(listUserForm);
        pageVo.setRecords(userDao.findAll());
        pageVo.update();
        return pageVo;
    }

    private Integer countUser(String status) {
        return 0;
    }
}
