package com.zzzl.model.exception;

import lombok.Getter;

/**
 * @author zzzzl
 * @Description
 * @date 2020-10-29 15:00
 */
@Getter
public enum ResultsEnum {
    UNKNOWN_EXCEPTION(100,"未知异常"),
    ADD_ERROR(103,"添加失败"),
    UPDATE_ERROR(104,"更新失败"),
    DELETE_ERROR(105,"删除失败"),
    GET_ERROR(106,"获取失败"),
    PARSE_ERROR(107,"请求解析异常"),
    RESULT_EXCEPTION(108,"返回类型异常"),
    ;
    private Integer code;
    private String msg;
    ResultsEnum(Integer code,String msg){
        this.code=code;
        this.msg=msg;
    }
    public static ResultsEnum getByCode(int code){
        for(ResultsEnum resultEnum:ResultsEnum.values()){
            if(code == resultEnum.getCode()){
                return resultEnum;
            }
        }
        return null;
    }
}