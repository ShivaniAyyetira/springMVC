package com.xworkz.hibernate.util;

import com.xworkz.hibernate.dao.CollegeDAO;
import com.xworkz.hibernate.dto.CollegeDTO;
import com.xworkz.hibernate.dto.PrincipalDTO;

public class CollegeTester
{
	public static void main(String[] args)
	{
		CollegeDTO cdto = new CollegeDTO();
		cdto.setCollegName("UVCE");
		cdto.setCollegeLocn("Bangalore");
		cdto.setNoOfDept(6);
		
		PrincipalDTO pdto = new PrincipalDTO();
		pdto.setPrinciName("DR Venu gopal");
		pdto.setPrinciEmail("venu@gmail.com");
		pdto.setPrinciAddress("kolar");
		
		cdto.setPrincipaldto(pdto);
		pdto.setCollegedto(cdto);
		
		CollegeDAO cdao = new CollegeDAO();
		cdao.save(cdto);
	}

}
