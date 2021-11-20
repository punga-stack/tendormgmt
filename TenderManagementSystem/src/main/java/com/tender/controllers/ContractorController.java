package com.tender.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.tender.beans.Login;
import com.tender.beans.Contractor;
import com.tender.beans.Tender;
import com.tender.beans.UserTender;
import com.tender.exceptions.TenderNotFoundException;
import com.tender.repo.ContractorDao;
import com.tender.repo.TenderDao;
import com.tender.service.ContractorService;
import com.tender.service.TenderService;
import com.tender.service.UserTenderService;

@Controller
public class ContractorController {
	
	@Autowired
	private TenderDao tenDao;
	
	@Autowired
	private TenderService tenService;
	
	@Autowired
	private ContractorDao cDao;
	
	@Autowired
	private ContractorService conserv;
	
	@Autowired
	private UserTenderService userserv;
	
	
	@GetMapping("/generateTender/{conId}")
	public String tenderPageLauncher(@PathVariable Integer conId,Model m) {
		
		Contractor c=conserv.findByConId(conId);
		
		System.out.print(c);
		
		Tender t=new Tender();
		
		t.setConId(c.getConId());
		t.setConName(c.getConName());
		
		m.addAttribute("tenData", t);
		
		return "registerTender";
	}
	
	
	@PostMapping("/generateTender/registerTender")
	public ModelAndView doInsertTender(@Valid @ModelAttribute("tenData") Tender ten, BindingResult br) {

		if (br.hasErrors()) {

			return new ModelAndView("registerTender");
		}
		Tender savedTen = tenDao.save(ten);

		return new ModelAndView("registerTenderSuccess", "ten", savedTen);

	}
	
	@GetMapping("/viewContractorTender/{conId}")

	public ModelAndView viewContractorTenderHandler(@PathVariable Integer conId) throws TenderNotFoundException {

		List<Tender> result = tenService.findByConId(conId);

		ModelAndView mv = new ModelAndView("TenderList");

		mv.addObject("tenderData", result);

		return mv;
	}
	
	@GetMapping("/allBiddings/{conId}")

	public ModelAndView viewallbiddingsHandler(@PathVariable Integer conId){

		List<UserTender> res=userserv.findByConId(conId);

		ModelAndView mv = new ModelAndView("allBiddingsList");

		mv.addObject("biddingList", res);

		return mv;
	}
	

}
