package com.sparta.springmvc.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
public class User {
    String id;
    String password;
}
