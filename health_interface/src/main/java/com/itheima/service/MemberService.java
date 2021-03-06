package com.itheima.service;

import com.itheima.pojo.Member;

import java.util.List;

public interface MemberService {
    Member findByTelephone(String telephone);

    void add(Member member);

    List<Integer> findMemberCountByMonths(List<String> months);

    List<Member> todayNewMember(String today);
}
