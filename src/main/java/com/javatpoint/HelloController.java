package com.javatpoint;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloController {
	
	
	
@RequestMapping("/")
	public String display()
	{
	
	    System.out.println("this my first project using reposritory");
	    System.out.println("this my first project using reposritory");System.out.println("this my first project using reposritory");
	    System.out.println("this my first project using reposritory");
		return "hellow";
	}	
}
