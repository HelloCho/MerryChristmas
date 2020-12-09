package org.raspberry.cho.merrychristmas.controller;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.raspberry.cho.merrychristmas.service.CompanyService;
import org.raspberry.cho.merrychristmas.service.MemberService;
import org.raspberry.cho.merrychristmas.service.TestService;
import org.raspberry.cho.merrychristmas.vo.CompanyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(
        properties = {
                "testId=foo",
                "teamName=bar"
        }
)
class CompanyControllerTest {

    @Autowired
    TestService testService;

    @Autowired
    MemberService memberService;


    @Autowired
    CompanyService companyService;

    @Test
    @DisplayName("생성자 4건 OK")
    void createVO() throws Exception {
        List<CompanyVO> companyList = companyService.getCompanyList();
        for (CompanyVO item : companyList) {
            System.out.println("item = " + item);
        }

        Assertions.assertThat(companyList.size()).isEqualTo(4);
    }

    @Test
    @DisplayName("생성자 상세 조건")
    void detailVO() throws Exception {
        CompanyVO companyVO = new CompanyVO();
        companyVO.setAddress("USA");
        companyVO.setCode("A100");
        companyVO.setName("APPLE");

        CompanyVO company = companyService.findCompany("A100");

        Assertions.assertThat(company.getName().toUpperCase()).isEqualTo(companyVO.getName());
    }
}