package com.zzzl.model.advice;

import com.zzzl.model.exception.CustomException;
import com.zzzl.model.exception.ResultsEnum;
import com.zzzl.model.utils.ResultVoUtil;
import com.zzzl.model.vo.ResultVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author zzzzl
 * @Description
 * @date 2020-10-29 15:22
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandling {

    @ExceptionHandler(value = CustomException.class)
    public ResultVo processException(CustomException e){
        log.error("位置:{}->错误信息:{}",e.getMethod(),e.getLocalizedMessage());
        return ResultVoUtil.error(ResultsEnum.UNKNOWN_EXCEPTION);
    }

    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(Exception.class)
    public ResultVo exception(Exception e){
        e.printStackTrace();
        return ResultVoUtil.error(ResultsEnum.UNKNOWN_EXCEPTION);
    }
}
