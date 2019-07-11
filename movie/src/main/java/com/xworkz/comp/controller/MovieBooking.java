package com.xworkz.comp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.comp.dto.MovieDTO;

@Component
@RequestMapping("/")
public class MovieBooking 
{

	public MovieBooking() {

	System.out.println(this.getClass().getSimpleName());
	}
	
	/*@RequestMapping("/Moviebook.do")
	public String savedata()
	{
		System.out.println("Invoked Save");
		
		return "/success.jsp";
	}*/

	@RequestMapping("/Moviebook1.do")
	public String savedata(HttpServletRequest request)
	{
		System.out.println("Invoked Save1");
		
		String name=request.getParameter("name");
		String tickets=request.getParameter("tickets");
		String theater=request.getParameter("theater");
		String type=request.getParameter("type");
		return "/success.jsp";
	}

	
	@RequestMapping(value="/Moviebook2.do",method=RequestMethod.POST)
	public String savedata(MovieDTO dto,Model model)
	{
		System.out.println("Invoked Save2"+dto);
		
		model.addAttribute("name", dto.getName());
		model.addAttribute("tickets", dto.getTickets());
		model.addAttribute("theater", dto.getTheater());
		model.addAttribute("type", dto.getType());
		return "/success.jsp";
	}

}
