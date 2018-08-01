package com;

import java.util.*;

public interface CustomerDAO {
	public String insertCustomerDetails (Customer customer);
	public Customer findByCustomerId (int customerId);
	public boolean isCustomerExists (int customerId);
	public boolean deleteCustomer (int customerId);
	public Customer updateCustomer (int customerId, Customer customer);
	public List<Customer> listAllEmployees();
}
