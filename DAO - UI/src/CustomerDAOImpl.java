package com;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;

public class CustomerDAOImpl implements CustomerDAO{

	Connection connection = MyConnection.getConnection();
	public String insertCustomerDetails(Customer customer) {
		int results = 0;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("insert into customer values(?,?,?,?)");
			preparedStatement.setInt(1, customer.getCustomerId());
			preparedStatement.setString(2, customer.getCustomerName());
			preparedStatement.setString(3, customer.getCustomerAddress());
			preparedStatement.setInt(4, customer.getBillAmount());
			results = preparedStatement.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		if(results == 0)
			return "Failed";
		else
			return "Success";
	}

	@Override
	public Customer findByCustomerId(int customerId) {
		ResultSet results;
		Customer customer = new Customer();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("select * from customer where customerid = ?");
			preparedStatement.setInt(1, customerId);
			results = preparedStatement.executeQuery();
			if (results.next()) {
				customer.setCustomerId(results.getInt(1));
				customer.setCustomerName(results.getString(2));
				customer.setCustomerAddress(results.getString(3));
				customer.setBillAmount(results.getInt(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return customer;
	}

	@Override
	public boolean isCustomerExists(int customerId) {
		boolean exists = false;
		ResultSet results;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("select * from customer where customerid = ?");
			preparedStatement.setInt(1, customerId);
			results = preparedStatement.executeQuery();
			if (results.next()) {
				exists = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return exists;
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		boolean deleted = false;
		int results = 0;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("delete from customer where customerid = ?");
			preparedStatement.setInt(1, customerId);
			results = preparedStatement.executeUpdate();
			if (results != 0) {
				deleted = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return deleted;
	}

	@Override
	public Customer updateCustomer(int customerId, Customer customer) {
		int results;
		Customer newCustomer = new Customer();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("update customer set customerId = ?, customerName = ?, customerAddress = ?, billAmount = ? where customerid = ?");
			preparedStatement.setInt(1, customerId);
			preparedStatement.setString(2, customer.getCustomerName());
			preparedStatement.setString(3, customer.getCustomerAddress());
			preparedStatement.setInt(4, customer.getBillAmount());
			preparedStatement.setInt(5, customerId);
			results = preparedStatement.executeUpdate();
			if (results != 0) {
				ResultSet result;
				PreparedStatement prepared = connection.prepareStatement("select * from customer where customerId = ?");
				prepared.setInt(1, customerId);
				result = prepared.executeQuery();
				result.next();
				newCustomer.setCustomerId(result.getInt(1));
				newCustomer.setCustomerName(result.getString(2));
				newCustomer.setCustomerAddress(result.getString(3));
				newCustomer.setBillAmount(result.getInt(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return newCustomer;
	}

	@Override
	public List<Customer> listAllEmployees() {
		List<Customer> customers = new ArrayList<Customer>();
		try {
			Customer customer = new Customer();
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery("select * from customer");
			while (result.next()) {
				customer.setCustomerId(result.getInt(1));
				customer.setCustomerName(result.getString(2));
				customer.setCustomerAddress(result.getString(3));
				customer.setBillAmount(result.getInt(4));
				customers.add(customer);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return customers;
	}

}
