package com.sparta.springmvc.controller;

import com.sparta.springmvc.Service.UserService;
import com.sparta.springmvc.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Controller
public class LoginController {

    private final UserService userService;

    @GetMapping("/login")
    public String getLogin(){
        return "redirect:/login-form.html";
    }

    @PostMapping("/login")
    public String processLogin(@ModelAttribute User user, Model model){
        if(userService.checkid(user.getId())){              // 영문자만 입력했는지 판단
            if(user.getId().equals(user.getPassword())) {   // 아이디와 비밀번호 동일 여부
                model.addAttribute("loginId", user.getId());
            }

        }
        return "login-result";
    }
}
