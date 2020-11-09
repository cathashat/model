package com.zzzl.model.utils;

import com.zzzl.model.exception.ResultsEnum;
import com.zzzl.model.vo.PageVo;
import com.zzzl.model.vo.ResultVo;

/**
 * @author zzzzl
 * @Description
 * @date 2020-10-29 15:29
 */
public class ResultVoUtil {

    public static ResultVo error(ResultsEnum resultsEnum){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(resultsEnum.getCode());
        resultVo.setMessage(resultsEnum.getMsg());
        return resultVo;
    }

    public static ResultVo success(Object object){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(200);
        resultVo.setMessage("查询成功");
        resultVo.setData(object);
        return resultVo;
    }
}
