package org.raspberry.cho.merrychristmas.service;

import org.raspberry.cho.merrychristmas.mapper.CompanyMapper;
import org.raspberry.cho.merrychristmas.mapper.MemberMapper;
import org.raspberry.cho.merrychristmas.vo.CompanyVO;
import org.raspberry.cho.merrychristmas.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyMapper companyMapper;

    public List<CompanyVO> getCompanyList() throws Exception {
        return companyMapper.getCompanyList();
    }
    public CompanyVO findCompany(String code) throws Exception {
        return companyMapper.findCompany(code);
    }
}
