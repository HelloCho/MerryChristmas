package org.raspberry.cho.merrychristmas.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.raspberry.cho.merrychristmas.vo.CompanyVO;
import org.raspberry.cho.merrychristmas.vo.MemberVO;

import java.util.List;

@Mapper
public interface MemberMapper {

    List<MemberVO> getMemberList() throws Exception;
}
