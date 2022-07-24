package com.luv2code.springdemo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.admin.service.AdminRoomService;
import com.luv2code.springdemo.entity.HomeStayCustomer;
import com.luv2code.springdemo.service.RoomBookService;
import com.luv2code.springdemo.service.VerificationIdService;

@Controller
@RequestMapping("/roomBooking")
public class RoomBookController {

	@Autowired
	private RoomBookService service;

	@Autowired
	private VerificationIdService service1;

	@Autowired
	private AdminRoomService roomService;

	@GetMapping("/booklist")
	public String listCustomers(Model theModel) {
		List<HomeStayCustomer> theCustomer = service.getCustomers();
		theModel.addAttribute("roombook", theCustomer);
		return "room-book";
	}

	@GetMapping("/showRoomBookAdd")
	public String showRoomBookAdd(Model theModel) {
		HomeStayCustomer customer = new HomeStayCustomer();
		theModel.addAttribute("bookcustomer", customer);
		return "roombook_form";
	}

	@PostMapping("/saveRoomBook")
	public String saveRoomBook(@ModelAttribute("customer") HomeStayCustomer theCustomer) {
		service.saveCustomer(theCustomer);
		// Save the custome save the service
		return "redirect:/roomBooking/booklist";
	}

	@GetMapping("/showRoomBookUpdate")
	public String showRoomBookUpdate(@RequestParam("bookingId") int theId, Model theModel) {
		HomeStayCustomer theCustomer = service.getCustomer(theId);
		theModel.addAttribute("bookcustomer", theCustomer);
		return "roombook_form";
	}

	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("bookingId") int theId) {
		service.deleteCustomer(theId);
		return "redirect:/roomBooking/booklist";
	}

	@ModelAttribute("veriIdList")
	public Map<Integer, String> getVerificationId() {

		return service1.getVerificationId();
		/*
		 * Map<Integer, String> verIdList = new HashMap<Integer, String>();
		 * verIdList.put(1, "Aadhar"); verIdList.put(2, "Pass Port");
		 * verIdList.put(3, "DL"); verIdList.put(4, "Voter Id");
		 */

		// return verIdList;
	}

	@ModelAttribute("allActiveRoomList")
	public Map<Integer, String> getRoomsList() {
		return roomService.getRoomList();
	}

}
