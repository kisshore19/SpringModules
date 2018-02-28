package com.kishore.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCalss {
	@Autowired
	PrintBeanProps printBeanProps;

	public void method1() {
		printBeanProps.print();
	}
	
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-confix.xml");
		PrintBeanProps dd= (PrintBeanProps)applicationContext.getBean("printBean");
		dd.print();
		/*TestCalss testCalss = new TestCalss();
		testCalss.method1();*/
	}

	public PrintBeanProps getPrintBeanProps() {
		return printBeanProps;
	}

	public void setPrintBeanProps(PrintBeanProps printBeanProps) {
		this.printBeanProps = printBeanProps;
	}
	
	

}
