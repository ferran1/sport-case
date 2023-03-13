package com.example.sport.controller;

import com.example.sport.data.models.Member;
import com.example.sport.data.payloads.request.MemberRequest;
import com.example.sport.data.payloads.response.MemberResponse;
import com.example.sport.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    MemberService memberService;

    @PostMapping("/add")
    public ResponseEntity<MemberResponse> addMember( @RequestBody MemberRequest member) {
        MemberResponse newMember = memberService.addMember(member);
        return new ResponseEntity<>(member, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Member>> getAllMembers() {
        List<Member> members = memberService.getAllMembers();
        return new ResponseEntity<>(members, HttpStatus.OK);
    }
}
