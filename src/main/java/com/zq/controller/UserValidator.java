package com.zq.controller;

import com.zq.bean.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


@Repository("userValidator")
public class UserValidator implements Validator {
    //该校验器能够对clazz类型的对象进行校验
    @Override
    public boolean supports(Class<?> clazz) {
        // User指定的是class参数所表示的类或接口是否相同
        return User.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        /**
         * 使用validationUtils中的一个静态方法regectIfEmpty()来对username属性进行校验
         * 若属性是null或者空字符串，就拒绝验证通过
         */
        ValidationUtils.rejectIfEmpty(errors, "name", null,"登录名不能为空");
        ValidationUtils.rejectIfEmpty(errors, "password", null,"密码不能为空");
        ValidationUtils.rejectIfEmpty(errors, "phone", null,"电话不能为空");
        ValidationUtils.rejectIfEmpty(errors, "address", null,"地址不能为空");
        User user = (User)target;
        if(user.getName().length()>10) {
            //使用Errors的rejectIfEmpty方法验证
            errors.rejectValue("name", null, "用户名不能超过10个字符");
        }
        if(user.getName() !=null && !user.getPassword().equals("")
                && user.getPassword().length()<6) {
            errors.rejectValue("password", null, "密码不能小于6位");
        }
        if(user.getPhone().length()!=11) {
            //使用Errors的rejectIfEmpty方法验证
            errors.rejectValue("phone", null, "手机号应该为11个字符");
        }
    }
}


