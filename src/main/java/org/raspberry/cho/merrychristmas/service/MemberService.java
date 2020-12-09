package org.raspberry.cho.merrychristmas.service;

import org.raspberry.cho.merrychristmas.mapper.MemberMapper;
import org.raspberry.cho.merrychristmas.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MemberMapper memberMapper;

    public List<MemberVO> getMemberList() throws Exception {
        return memberMapper.getMemberList();
    }
}
