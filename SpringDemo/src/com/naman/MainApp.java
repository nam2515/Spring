package com.naman;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathResource resource= new ClassPathResource("applicationContext.xml");
		AbstractApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
		ac.registerShutdownHook();
		
		Employee employee=(Employee)ac.getBean("emp","Employee.class");
		System.out.println(employee.getEmpNumber());
		System.out.println(employee.getEmpname());
		
		
	}

}
