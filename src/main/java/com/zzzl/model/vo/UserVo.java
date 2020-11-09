package com.zzzl.model.vo;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zzzzl
 * @Description
 * @date 2020-10-29 15:40
 */
@Data
@ApiModel("返回数据")
public class UserVo {
    @ApiModelProperty("用户唯一标识")
    private int index_id;
    @ApiModelProperty("用户姓名")
    private String nickname;
    @ApiModelProperty("生日")
    private Date birthday;
    @ApiModelProperty("登录名")
    private String username;
    @ApiModelProperty("密码")
    private String password;

}
