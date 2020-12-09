package org.raspberry.cho.merrychristmas.service;

import org.raspberry.cho.merrychristmas.mapper.TestMapper;
import org.raspberry.cho.merrychristmas.vo.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private TestMapper mainMapper;

    public String getTestList() throws Exception {
        String result = "";
        List<TestVO> resultList = mainMapper.getTestList();

        for (TestVO member : resultList) {
            System.out.println("resultList = " + member.getContents());
            result += member.getName() + "\n";
        }
        return result;
    }
}
