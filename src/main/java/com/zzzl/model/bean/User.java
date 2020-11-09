package com.zzzl.model.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author zzzzl
 * @Description
 * @date 2020-10-29 16:27
 */
@Entity
@Data
@ApiModel("用户信息")
public class User {

    @Id
    @GeneratedValue
    @ApiModelProperty("用户唯一id")
    private int index_id;
    @Column
    @ApiModelProperty("用户姓名")
    private String nickname;
    @Column
    @ApiModelProperty("生日")
    private Date birthday;
    @Column
    @ApiModelProperty("登录名")
    private String username;
    @Column
    @ApiModelProperty("密码")
    private String password;


}
