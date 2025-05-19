package com.example.schedules.entity;

public class Member {
    private String member_name;
    private String password;

    public Member (String member_name, String password){
        this.member_name = member_name;
        this.password = password;
    }

    public String getMember_name() {
        return member_name;
    }

    public String getPassword() {
        return password;
    }

}
