package com.vm.business;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeExample {

	public static void main(String[] args) {


		ApplicationContext ct=new ClassPathXmlApplicationContext(new String[]{"ApplicationContext.xml","beans.xml"});

		/*Bank b=new Bank();*/
		
        Bank b=(Bank)ct.getBean(Bank.class);
        //ct.getb
        
       b.setName("ICICI Bank");
        
        System.out.println(b.getName());
        Bank b1=(Bank)ct.getBean("b");
        
        System.out.println(b1.getName());
        
        Bank b2=(Bank)ct.getBean("b");
        
        System.out.println(b2.getName());
        
	}

}
