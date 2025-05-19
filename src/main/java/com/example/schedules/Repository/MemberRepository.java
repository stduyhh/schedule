package com.example.schedules.Repository;

import com.example.schedules.Dto.MemberCreateResponseDto;
import com.example.schedules.entity.Member;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemberRepository {

    List<Member> memberList = new ArrayList<>();







    public MemberCreateResponseDto createMember(Member member){
        memberList.add(member);
        return new MemberCreateResponseDto(member.getMember_name(), member.getPassword());
    }

}
