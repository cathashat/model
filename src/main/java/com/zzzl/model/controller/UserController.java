package com.zzzl.model.controller;

import com.zzzl.model.annotation.MyLog;
import com.zzzl.model.annotation.RsaSecurityParameter;
import com.zzzl.model.bean.User;
import com.zzzl.model.form.ListUserForm;
import com.zzzl.model.service.impl.UserServiceImpl;
import com.zzzl.model.utils.ResultVoUtil;
import com.zzzl.model.vo.ResultVo;
import com.zzzl.model.vo.UserVo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

/**
 * @author zzzzl
 * @Description
 * @date 2020-10-29 15:38
 */
@Api("用户")
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @ApiOperation("获取用户列表")
    @GetMapping("/listUser")
    @ResponseBody
    @ApiResponse(code = 200, message = "操作成功", response = UserVo.class)
    public ResultVo listUser() {
        ListUserForm listUserForm = new ListUserForm();
        listUserForm.setStatus("0");
        listUserForm.setCurrent(1);
        listUserForm.setSize(100);
        return ResultVoUtil.success(userService.listUser(listUserForm));
    }

    @RequestMapping("/")
    public String index(){
        return "demo";
    }

    @MyLog("测试用户")
    @RequestMapping("/testRsaEncrypt")
    @ResponseBody
    @RsaSecurityParameter(inDecode = false)
    public Object testRsaEncrypt(@RequestBody(required = false) User user){
        return user;
    }
}
