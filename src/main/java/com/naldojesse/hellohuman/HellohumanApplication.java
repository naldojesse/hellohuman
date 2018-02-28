package com.naldojesse.hellohuman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.RestController;

@Controller
@SpringBootApplication
public class HellohumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellohumanApplication.class, args);
	}

//	@RequestMapping(value = "/test", method = RequestMethod.PO)
	@RequestMapping("/")
	public String index(@RequestParam(value="q", required = false) String f_name, @RequestParam(required=false) String l_name, ModelMap model)  {
		if (f_name == null || l_name == null) {
			return "index.jsp";
		} else {

			String full_name = f_name + l_name;
			System.out.println(full_name);
			model.addAttribute("name", full_name);
			return "name.jsp";
		}
	}

}
