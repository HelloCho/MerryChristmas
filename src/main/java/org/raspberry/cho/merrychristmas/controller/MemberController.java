package org.raspberry.cho.merrychristmas.controller;

import org.raspberry.cho.merrychristmas.service.MemberService;
import org.raspberry.cho.merrychristmas.service.TestService;
import org.raspberry.cho.merrychristmas.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class MemberController {

    @Autowired
    TestService testService;

    @Autowired
    MemberService memberService;

    @RequestMapping("/")
    public @ResponseBody String rootTest() throws Exception {
        return "Hello, World~!";
    }

    @RequestMapping("/test")
    public ModelAndView test() throws Exception {
        ModelAndView model = new ModelAndView("test");

        String result = testService.getTestList();
        model.addObject("result", result);

        return model;
    }

    @RequestMapping("/member")
    public ModelAndView allMember() throws Exception {
        ModelAndView model = new ModelAndView("member");

        List<MemberVO> memberList = memberService.getMemberList();
        model.addObject("memberList", memberList);

        return model;
    }

}
