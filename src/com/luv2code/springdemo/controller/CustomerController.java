package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//need the inject customerDao
	@Autowired
	private CustomerService customerService;
	//@RequestMapping("/list")
	@GetMapping("/list")
	public String listCustomers(Model theModel)
	{
		//get Customers from Dao
		List<Customer> theCustomer=customerService.getCustomers();
		
		//Add customers to the Model
		theModel.addAttribute("customers", theCustomer);
		return "list-customers";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormAdd(Model theModel)
	{
		Customer customer=new Customer();
		theModel.addAttribute("customer",customer);
		return "customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer")Customer theCustomer)
	{
		customerService.saveCustomer(theCustomer);
		//Save the custome save the service
		return "redirect:/customer/list";
	}
	
	@GetMapping("/showFormUpdate")
	public String showFormUpdate(@RequestParam("customerId") int theId,Model theModel)
	{
		Customer theCustomer=customerService.getCustomer(theId);
		theModel.addAttribute("customer",theCustomer);
		return "customer-form";
	}
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") int theId)
	{
		customerService.deleteCustomer(theId);
		return "redirect:/customer/list";
	}

}
