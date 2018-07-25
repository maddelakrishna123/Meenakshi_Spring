package com.vm.spring.beaninit;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AwareBeam implements ApplicationContextAware,BeanNameAware,BeanFactoryAware{

	@Override
	//ApplicationContextAware
	public void setApplicationContext(ApplicationContext context) throws BeansException {


		
System.out.println("setApplicationContext Method is called");
System.out.println("setApplicationContext:: Bean Definition name"+Arrays.toString(context.getBeanDefinitionNames()));

		
	}

	@Override
	//BeanNameAwareInterface
	public void setBeanName(String beanName) {

		System.out.println("setBeanName method of BeanNameAware is called");
	     System.out.println("setBeanName:: Bean Name defined in context="
	                    + beanName);
		
	}
	
	@Override
	// BeanfactoryAware
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {


		
		
		
		System.out.println("setBeanFactory method of Aware bean is called");
	       System.out.println("setBeanFactory:: Aware bean singleton="
	                + beanFactory.isSingleton("awarebean"));
		
	}

}
