package com.example.sport.service;

import com.example.sport.data.models.Member;
import com.example.sport.data.payloads.request.MemberRequest;
import com.example.sport.data.payloads.response.MemberResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface MemberService {
    MemberResponse addMember(MemberRequest memberRequest);
    MemberResponse linkMember(Integer memberId, Integer sportId, MemberRequest employeeRequest);
    List<Member> getAllMembers();
}
