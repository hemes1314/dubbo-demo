package org.keith.demo.dubbo.reference;

import org.keith.demo.dubbo.registry.service.TestRegistryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	String paths[] = {"AC.xml"};
		//这个xml文件是Spring配置beans的文件，顺带一提，路径 在整个应用的根目录
		ApplicationContext ctx = new ClassPathXmlApplicationContext(paths);
		TestRegistryService testRegistryService = (TestRegistryService) ctx.getBean("testRegistryService");
		
		for(int i = 0; i < 100; i++) {
			String str = testRegistryService.hello("world-"+i);
			System.out.println(str);
			Thread.sleep(1000);
		}
    }
}
