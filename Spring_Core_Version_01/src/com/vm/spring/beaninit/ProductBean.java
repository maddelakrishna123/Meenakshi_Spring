package com.vm.spring.beaninit;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ProductBean implements InitializingBean, DisposableBean {

	private String productName;

	public ProductBean() {

		System.out.println("With In The Product Bean Constructor");

	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public void destroy() throws Exception {

		System.out.println("with in the productbean destroy");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("With in the Product Bean afterPropertiesSet Method");

	}

}
