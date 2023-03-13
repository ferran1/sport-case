package com.example.sport.service;

import com.example.sport.data.models.Member;
import com.example.sport.data.payloads.request.MemberRequest;
import com.example.sport.data.payloads.response.MemberResponse;
import com.example.sport.data.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberServiceImpl implements MemberService{

    @Autowired
    MemberRepository memberRepository;

    @Override
    public MemberResponse addMember(MemberRequest memberRequest) {
        Member member = new Member();
        member.setName(memberRequest.getName());
        memberRepository.save(member);
        return new MemberResponse("New Member added successfully");
    }

    @Override
    public MemberResponse linkMember(Integer memberId, Integer sportId, MemberRequest memberRequest) {
        Optional<Member> member = memberRepository.findById(memberId);

        // find sport

        return null;
    }

    @Override
    public List<Member> getAllMembers() {
        return null;
    }
}
