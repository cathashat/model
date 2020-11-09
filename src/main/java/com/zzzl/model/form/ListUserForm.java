package com.zzzl.model.form;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Range;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author zzzzl
 * @Description
 * @date 2020-10-29 16:07
 */
@Data
@ApiModel("获取用户列表需要的表单数据")
@EqualsAndHashCode(callSuper = false)
public class ListUserForm extends PageForm<ListUserForm>{

    @ApiModelProperty("用户状态")
    @NotEmpty(message = "用户状态不能为空")
    @Range(min=-1,max=1,message = "用户状态有误")
    private String status;

}
