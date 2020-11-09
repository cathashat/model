package com.zzzl.model.service.impl;

import com.zzzl.model.bean.SysLog;
import com.zzzl.model.service.SysLogService;

import org.springframework.stereotype.Service;

/**
 * 描述:
 * 〈日志记录实现类〉
 *
 * @author Monkey
 * @create 2019/1/24 19:39
 */
@Service
public class SysLogServiceImpl implements SysLogService {

    @Override
    public void save(SysLog sysLog) {
        //保存到db
        System.out.println("保存db,成功!!!!"+sysLog.toString());
    }
}