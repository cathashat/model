package com.zzzl.model.vo;

import java.util.List;

import com.zzzl.model.form.PageForm;

import org.springframework.beans.BeanUtils;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zzzzl
 * @Description
 * @date 2020-10-29 15:55
 */
@Data
public class PageVo<T> {
    @ApiModelProperty("分页数据")
    private List<T> records;
    @ApiModelProperty("总条数")
    private Integer total;
    @ApiModelProperty("总页数")
    private Integer pages;
    @ApiModelProperty("当前页")
    private Integer current;
    @ApiModelProperty("查询数量")
    private Integer size;
    @ApiModelProperty(hidden = true)
    public PageVo<T> setCurrentAndSize(PageForm<?> pageForm){
        BeanUtils.copyProperties(pageForm,this);
        return this;
    }
    @ApiModelProperty(hidden = true)
    public void setTotal(Integer total){
        this.total=total;
        this.setPages(this.total % this.size>0?this.total/this.size+1:this.total/this.size);
    }

    public void update(){
        setTotal(records.size());
    }
}
