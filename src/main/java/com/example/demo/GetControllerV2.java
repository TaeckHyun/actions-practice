package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/member")
public class GetControllerV2 {

    @GetMapping("/{member-id}")
    public MemberDto getHelloResponse(@PathVariable("member-id") long memberId) {
        return new MemberDto(
                1,
                "hong gildong",
                "CS001023004",
                "컨테이너 실습",
                "EEF9852",
                "STUDENT"
        );
    }
}