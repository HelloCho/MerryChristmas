package org.raspberry.cho.merrychristmas.controller;

import org.raspberry.cho.merrychristmas.service.CompanyService;
import org.raspberry.cho.merrychristmas.service.MemberService;
import org.raspberry.cho.merrychristmas.service.TestService;
import org.raspberry.cho.merrychristmas.vo.CompanyVO;
import org.raspberry.cho.merrychristmas.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class CompanyController {

    @Autowired
    TestService testService;

    @Autowired
    MemberService memberService;

    @Autowired
    CompanyService companyService;

    @RequestMapping("/company")
    public ModelAndView allCompany() throws Exception {
        ModelAndView model = new ModelAndView("company");

        List<CompanyVO> companyList = companyService.getCompanyList();
        model.addObject("companyList", companyList);

        return model;
    }

    @RequestMapping("/find/company")
    public ModelAndView findCompany(@RequestParam(required = true) String code) throws Exception {
        ModelAndView model = new ModelAndView("detailCompany");

        CompanyVO company = companyService.findCompany(code);
        model.addObject("company", company);

        return model;
    }
}
