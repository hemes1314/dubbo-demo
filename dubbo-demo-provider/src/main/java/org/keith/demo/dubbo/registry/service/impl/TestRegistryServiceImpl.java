package org.keith.demo.dubbo.registry.service.impl;

import org.keith.demo.dubbo.registry.service.TestRegistryService;


public class TestRegistryServiceImpl implements TestRegistryService {

	public String hello(String name) {
		return "hello,"+name;
	}

}
