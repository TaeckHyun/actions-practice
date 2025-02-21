package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/dept")
public class GetControllerV3 {

    @GetMapping("/{dept-id}")
    public DeptDto getDeptResponse(@PathVariable("dept-id") long deptId) {
        return new DeptDto(
                1,
                "CS001023004",
                "컨테이너 실습",
                3,
                "CS0010230000",
                "수강생대표팀"
        );
    }
}

