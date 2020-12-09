package org.raspberry.cho.merrychristmas.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.raspberry.cho.merrychristmas.vo.TestVO;

import java.util.List;

@Mapper
public interface TestMapper {

    List<TestVO> getTestList() throws Exception;
}
