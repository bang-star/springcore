package com.sparta.springmvc.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    public boolean checkid(String id){
        char ch;

        for (int i = 0; i < id.length(); i++) {
            ch = id.charAt(i);

            if (ch >= 0x61 && ch <= 0x7A) {     // 소문자
                continue;
            } else if (ch >= 0x41 && ch <= 0x5A) {    // 대문자
                continue;
            } else if (ch >= 0x30 && ch <= 0x39) {   // 숫자
                return false;
            } else {
                return false; // 영문자도 아니고 숫자도 아님!
            }
        }
        return true;
    }
}
