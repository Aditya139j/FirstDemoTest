package com.nt.boot.examle3;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
    
@Controller
public class LoginController {

	@Autowired
	LoginDaoRepository loginRepo;

	@RequestMapping(value = "/login")
	public String getEmpDetails(ModelMap model) {
		System.out.println(" Calling Mehtid getEmpDetails");
		return "login";
	}

	@RequestMapping(value = "/loginDetails", method = RequestMethod.POST)
	public String submit(@Valid @ModelAttribute("employee") LoginData employee, BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
			return "error";
		}

		System.out.println(" Login Object : " + employee);

		//List<MX_REGMTB> daoObj = loginRepo.findAll();
		MX_REGMTB daoObj = loginRepo.findByUserId(employee.getUserId());
		System.out.println(" Object printing from DB " + daoObj);
		
		if(daoObj == null)
		{	
			//Show Error Popup Message
			System.out.println(" Invalid UserId : " );
			return  "useridError";
			
		}
		else if(employee.getPassword().equals(daoObj.getPassword())){
			//return Sucess Msg
			
			return "home";
		}else {
			//Show Error Msg
			System.out.println(" Invalid Password : " );
			return  "passwordError";
		}
		
		//return "home";
		

		
	}
}
