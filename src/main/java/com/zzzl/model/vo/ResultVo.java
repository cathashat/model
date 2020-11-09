package com.zzzl.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zzzzl
 * @Description
 * @date 2020-10-29 15:28
 */
@Data
@ApiModel("固定格式")
public class ResultVo {

    @ApiModelProperty("返回码")
    private Integer code;

    @ApiModelProperty("提示信息")
    private String message;

    @ApiModelProperty("响应数据")
    private Object data;

}
