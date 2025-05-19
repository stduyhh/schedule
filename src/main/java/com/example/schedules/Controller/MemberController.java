package com.example.schedules.Controller;

import com.example.schedules.Dto.MemberCreateRequestDto;
import com.example.schedules.Dto.MemberCreateResponseDto;
import com.example.schedules.Service.MemberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/members")
public class MemberController {
    private final MemberService memberService;

    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }

    @PostMapping
    public ResponseEntity<MemberCreateResponseDto> createResponseDto (@RequestBody MemberCreateRequestDto dto){

        ResponseEntity<MemberCreateResponseDto> responseDto = memberService.createMember(dto);

        return responseDto;
    }

    @GetMapping("/{member_id}")
    public ResponseEntity<>
}
