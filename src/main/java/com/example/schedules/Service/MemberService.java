package com.example.schedules.Service;

import com.example.schedules.Dto.MemberCreateRequestDto;
import com.example.schedules.Dto.MemberCreateResponseDto;
import com.example.schedules.Repository.MemberRepository;
import com.example.schedules.entity.Member;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    public ResponseEntity<MemberCreateResponseDto> createMember(MemberCreateRequestDto dto){
        //데이터 준비
        String name = dto.getMember_name();
        String password = dto.getPassword();
        Member member = new Member(name, password);
        MemberCreateResponseDto responseDto = memberRepository.createMember(member);

        return new ResponseEntity<>(responseDto, HttpStatus.CREATED);
    }

}
