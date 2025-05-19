package com.example.schedules.Dto;

public class MemberCreateResponseDto {
    private String member_name;
    private String password;

    public MemberCreateResponseDto(String member_name, String password){
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
