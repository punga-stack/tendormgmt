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

import com.tender.beans.AdminLogin;
import com.tender.beans.Contractor;
import com.tender.beans.ContractorLogin;
import com.tender.beans.Tender;
import com.tender.repo.ContractorDao;
import com.tender.repo.TenderDao;

@Controller
public class ContractorController {
	
	@Autowired
	private TenderDao tenDao;
	
	
	@Autowired
	private ContractorDao cDao;
	
	
	@GetMapping("/generateTender")
	public String tenderPageLauncher(Model m) {
		
		Tender t=new Tender();
		
		m.addAttribute("tenData", t);
		
		return "registerTender";
	}
	
	
	@PostMapping("/registerTender")
	public ModelAndView doInsertTender(@Valid @ModelAttribute("tenData") Tender ten, BindingResult br) {

		if (br.hasErrors()) {

			return new ModelAndView("registerTender");
		}
		Tender savedTen = tenDao.save(ten);

		return new ModelAndView("registerTenderSuccess", "ten", savedTen);

	}
	

}
