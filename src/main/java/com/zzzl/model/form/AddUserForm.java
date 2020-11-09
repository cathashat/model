package com.zzzl.model.form;

import com.zzzl.model.bean.User;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * @author zzzzl
 * @Description
 * @date 2020-10-29 16:26
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class AddUserForm implements BaseForm<User> {

    private String nickname;

    private Date birthday;

    private String username;

    private String password;

    @Override
    public User buildEntity() {
        User user = new User();
        BeanUtils.copyProperties(this,user);
        return user;
    }
}
