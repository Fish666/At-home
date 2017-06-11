package com.chinasoft.testSprin.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chinasoft.testSprin.mapper.TestMapper;
import com.chinasoft.testSprin.pojo.Test;
import com.chinasoft.testSprin.service.ITestService;


@Service("testService")
public class TestServiceImpl implements ITestService{

	@Resource
	private TestMapper testMapper;
	
	@Override
	public Test queryTest(Test test) {
		// TODO 自动生成的方法存根
		return testMapper.queryTest(test);
	}

}
