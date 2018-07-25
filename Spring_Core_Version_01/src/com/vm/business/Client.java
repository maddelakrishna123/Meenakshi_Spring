package com.vm.business;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.SystemPropertyUtils;

public class Client {

	public static void main(String[] args) {

       
		
		
		//ApplicationContext ctx=new ClassPathXmlApplicationContext();

	   //  ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	
	    //ApplicationContext ctx=new FileSystemXmlApplicationContext("E:\\springconfig\\beans.xml");                  
		ApplicationContext ct=new ClassPathXmlApplicationContext(new String[]{"ApplicationContext.xml","beans.xml"});
		//Employee e=(Employee)context.getBean("e");
		
		
		
		//System.out.println(e);
		
		
		
		Student s=(Student) ct.getBean("s");
		System.out.println(s);
		Student s1=(Student) ct.getBean("s");
		System.out.println(s1);
		Employee e=ct.getBean(Employee.class);
		System.out.println(e);
		
		/*EmployeeBO bo=(EmployeeBO) context.getBean("bo");
		
		bo.createEmployee(e);
*/
	}

}
