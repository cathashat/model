package com.zzzl.model.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;

/**
 * @author zzzzl
 * @Description
 * @date 2020-10-29 15:35
 */
@Data
@ApiModel(value = "分页数据",description = "分页需要的表单数据")
public class PageForm<T extends PageForm<?>>  {
    @ApiModelProperty("页码 从第一页开始1")
    @Min(value = 1,message = "页码输入有误")
    private Integer current;

    @ApiModelProperty("每页显示的数量，范围1-100")
    @Range(min=1,max = 100,message = "每页显示数量输入有误")
    private Integer size;

    @ApiModelProperty(hidden = true)
    public T calcCurrrent(){
        current=(current-1)*size;
        return (T)this;
    }

}
