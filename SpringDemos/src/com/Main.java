package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
	public static void main(String[] args) {
		
		/*Usual method with "new". But creates an object each time so don't.
		 * Employee employee = new Employee();
		 * employee.setEmployeeName("aaa");
		 *
		 Three ways to link beans.xml :
		 *	Resource r = new ClassPathResource("beans.xml");
			BeanFactory b = new XmlBeanFactory(r);
			classObject.getBean("idThatYouGaveInBeansXml");
			
		 *	ApplicationContext context = new ClassPathResource("beans.xml");
		
		 *  BeanFactory
		 */
				
		Resource resource = new ClassPathResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Employee employee = (Employee) factory.getBean("emp");
		System.out.println(employee);
		}
}

 
