package com.zzzl.model.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author zzzzl
 * @Description
 * @date 2020-10-29 14:57
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CustomException extends RuntimeException {

    /**
     * UID
     */
    private static final long serialVersionUID = 2362039541275684811L;


    private final Integer code;

    private final String method;

    public CustomException(ResultsEnum resultEnum,String method){
        super(resultEnum.getMsg());
        this.code=resultEnum.getCode();
        this.method=method;
    }
    public CustomException(Integer code,String message,String method){
        super(message);
        this.code=code;
        this.method=method;
    }

}
