package com.luv2code.springdemo.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.admin.entity.AdminRooms;
import com.luv2code.springdemo.admin.service.AdminRoomService;

@Controller
@RequestMapping("/adminRoom")
public class AdminRoomController {
	@Autowired
	private AdminRoomService service;
	
	@GetMapping("/roomList")
	public String getAdminRooms(Model theModel)
	{
		List<AdminRooms> adminRooms=service.getAdminRooms();
		theModel.addAttribute("adminRooms", adminRooms);
		return "admin_Room";
	}

	@GetMapping("/addAdminRoom")
	public String addAdminRoom(Model theModel)
	{
		AdminRooms rooms=new AdminRooms();
		theModel.addAttribute("adminAddRoom",rooms);
		return "admin_add_room";
	}
	
	@PostMapping("/saveRoom")
	public String adminAddRoom(@ModelAttribute("adminAddRoom")AdminRooms theRooms)
	{
		service.saveAdminRoom(theRooms);
		return "redirect:/adminRoom/roomList";
	}
	
	@GetMapping("/adminRoomUpdate")
	public String adminRoomUpdate(@RequestParam("roomId")int theRoomId,Model theModel)
	{
		AdminRooms adminRoom=service.getAdminRoom(theRoomId);
		theModel.addAttribute("adminAddRoom",adminRoom);
		return "admin_add_room";
		
	}
	
	@GetMapping("/adminRoomDelete")
	public String adminRoomDelete(@RequestParam("roomId")int theRoomId)
	{
		service.deleteAdminRoom(theRoomId);
		return "redirect:/adminRoom/roomList";
	}
	

}
