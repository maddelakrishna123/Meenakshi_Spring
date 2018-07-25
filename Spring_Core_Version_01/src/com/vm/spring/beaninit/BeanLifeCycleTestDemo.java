package com.vm.spring.beaninit;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vm.business.EmployeeBO;

public class BeanLifeCycleTestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext ct=new ClassPathXmlApplicationContext(new String[]{"ApplicationContext.xml","beans.xml"});


		
		/*ProductBean pb=(ProductBean) ct.getBean("productBean");*/
		
		//System.out.println(pb.getProductName());
		
		
		
		/*((AbstractApplicationContext) ct).registerShutdownHook();*/
		
//	EmployeeBO bo=	(EmployeeBO) ct.getBean("bo");
		
	}

}
