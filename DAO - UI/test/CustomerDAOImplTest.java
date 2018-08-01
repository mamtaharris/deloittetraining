package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerDAOImplTest {

	CustomerDAO customerDAO;
	@BeforeEach
	void setUp() throws Exception {
		customerDAO = new CustomerDAOImpl();
	}

	@AfterEach
	void tearDown() throws Exception {
		customerDAO = null;
	}

	@Test
	void testInsertCustomerDetails() {
		Customer customer = new Customer(200, "aaa", "xyz", 1000);
		assertEquals("Success", customerDAO.insertCustomerDetails(customer));
	}

	@Test
	void testFindByCustomerId() {
		Customer customer = new Customer(3, "3", "3", 3);
		assertEquals(customer, customerDAO.findByCustomerId(3));
	}

	@Test
	void testIsCustomerExists() {
		assertEquals(true, customerDAO.isCustomerExists(3));
	}

	@Test
	void testDeleteCustomer() {
		assertEquals(true, customerDAO.deleteCustomer(200));
	}

	@Test
	void testUpdateCustomer() {
		Customer updateCustomer = new Customer(4, "bbb", "xyz", 2000);
		assertEquals(updateCustomer, customerDAO.updateCustomer(4 ,updateCustomer));
	}

	@Test
	void testListAllEmployees() {
		assertEquals(3, customerDAO.listAllEmployees().size());
	}

}
