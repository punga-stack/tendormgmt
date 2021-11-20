package com.tender.controllers;

import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tender.beans.Contractor;
import com.tender.beans.Login;
import com.tender.beans.Signup;
import com.tender.beans.Tender;
import com.tender.exceptions.TenderNotFoundException;
import com.tender.repo.ContractorDao;
import com.tender.repo.LoginDao;
import com.tender.repo.TenderDao;
import com.tender.service.ContractorService;
import com.tender.service.SignupService;
import com.tender.service.TenderService;

@Controller
public class AdminController {

	@Autowired
	private ContractorDao conDao;

	@Autowired
	private TenderService tenService;

	@Autowired
	private LoginDao logDao;
	
	@Autowired
	private ContractorService conService;
	
	@Autowired
	private SignupService serv;

	@GetMapping("/adminlogin")
	public String adminPageLauncher(Model m) {

		Login l = new Login();

		m.addAttribute("logData", l);

		return "adminlogin";
	}

	@PostMapping("/home")
	public ModelAndView homePageLauncher(@Valid @ModelAttribute("logData") Login log, BindingResult br) {

		if (br.hasErrors()) {

			return new ModelAndView("adminlogin");
		}

		if (log.getLoginAs().equals("Admin")) {
			
			if (log.getUsername().equals("Admin") && log.getPassword().equals("1234")) {

				Login savedLog = logDao.save(log);

				return new ModelAndView("home", "log", savedLog);

			}
		}

		else if (log.getLoginAs().equals("Contractor")) {
			
			Contractor opt = conService.findByConUsernameAndConPassword(log.getUsername(), log.getPassword());
			
			if (opt != null) {
				
				System.out.println("List:" + opt);
				
				return new ModelAndView("contractorHome", "contractorData", opt);
			}
		}
		
		else if(log.getLoginAs().equals("User"))
		{
			Signup sp=serv.findBySusernameAndPwd(log.getUsername(), log.getPassword());
			
			if (sp != null) {
				
				System.out.println("List:" + sp);
				
				return new ModelAndView("userHome", "userData", sp);
			}
			
		}
		return new ModelAndView("InvalidLogin");

	}

	@GetMapping("/registerContractor")
	public String registerContractorLauncher(Model model) {

		Contractor c = new Contractor();

		model.addAttribute("conData", c);

		return "registerContractorForm";

	}

	@PostMapping("/insertContractor")
	public ModelAndView doInsertEmployee(@Valid @ModelAttribute("conData") Contractor con, BindingResult br) {

		if (br.hasErrors()) {

			return new ModelAndView("registerContractorForm");
		}
		Contractor savedCon = conDao.save(con);

		return new ModelAndView("registerContractorSuccess", "cont", savedCon);

	}

	@GetMapping("/viewTender")

	public ModelAndView viewTenderHandler() throws TenderNotFoundException {

		List<Tender> result = tenService.getAlltenders();

		ModelAndView mv = new ModelAndView("TenderList");

		mv.addObject("tenderData", result);

		return mv;
	}

	@GetMapping("/logout")
	public String logoutPageLauncher() {

		return "adminLogout";
	}

}
