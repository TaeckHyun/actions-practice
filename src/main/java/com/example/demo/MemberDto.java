package com.example.demo;


public class MemberDto {
    private long sabun;
    private String name;
    private String dept_cd;
    private String dept_nm;
    private String role_cd;
    private String role_nm;

    public MemberDto() {}

    public MemberDto(long sabun, String name, String dept_cd, String dept_nm, String role_cd, String role_nm) {
        this.sabun = sabun;
        this.name = name;
        this.dept_cd = dept_cd;
        this.dept_nm = dept_nm;
        this.role_cd = role_cd;
        this.role_nm = role_nm;
    }

    public long getSabun() { return sabun; }
    public void setSabun(long sabun) { this.sabun = sabun; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDept_cd() { return dept_cd; }
    public void setDept_cd(String dept_cd) { this.dept_cd = dept_cd; }

    public String getDept_nm() { return dept_nm; }
    public void setDept_nm(String dept_nm) { this.dept_nm = dept_nm; }

    public String getRole_cd() { return role_cd; }
    public void setRole_cd(String role_cd) { this.role_cd = role_cd; }

    public String getRole_nm() { return role_nm; }
    public void setRole_nm(String role_nm) { this.role_nm = role_nm; }
}
