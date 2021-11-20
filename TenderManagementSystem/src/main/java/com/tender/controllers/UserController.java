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
import org.springframework.web.servlet.ModelAndView;

import com.tender.beans.Contractor;
import com.tender.beans.Login;
import com.tender.beans.Signup;
import com.tender.beans.Tender;
import com.tender.beans.UserTender;
import com.tender.exceptions.TenderNotFoundException;
import com.tender.service.ContractorService;
import com.tender.service.SignupService;
import com.tender.service.TenderService;
import com.tender.service.UserTenderService;

@Controller
public class UserController {
	
	@Autowired
	private SignupService service;
	
	@Autowired
	private TenderService tenService;
	
	@Autowired
	private ContractorService conserv;
	
	@Autowired
	private UserTenderService userv;
	
	@GetMapping("/signup")
	public String signupPageLauncher(Model m) {

		Signup s = new Signup();

		m.addAttribute("signData", s);

		return "signup";
	}
	
	@PostMapping("/signupdata")
	public ModelAndView doInsertEmployee(@Valid @ModelAttribute("signData") Signup sign, BindingResult br) {

		if (br.hasErrors()) {

			return new ModelAndView("signup");
		}
		
		Signup savedSign = service.registerSignup(sign);
		
		Login l=new Login();

		return new ModelAndView("adminlogin", "logData", l);

	}
	
	@GetMapping("/viewUserTenderList/{sid}/{susername}")

	public ModelAndView viewTenderListHandler(@PathVariable Integer sid,@PathVariable String susername) throws TenderNotFoundException {

		List<Tender> result = tenService.getAlltenders();
		
		Signup sp=service.findBySidAndSusername(sid, susername);

		ModelAndView mv = new ModelAndView("userTenderList");

		mv.addObject("tenderListData", result);
		mv.addObject("td",sp);
		
		return mv;
	}
	
	@GetMapping("/registerTender/{sid}/{susername}/{tenderId}/{basePrice}")
	public ModelAndView tenderPageLauncher(@PathVariable Integer sid,@PathVariable String susername,@PathVariable Integer tenderId,@PathVariable Integer basePrice,Model m) {
		
		Tender t=tenService.findByTenderId(tenderId);
		
		UserTender u=new UserTender();
		
		u.setTenderId(t.getTenderId());
		u.setConName(t.getConName());
		u.setTenderName(t.getTenderName());
		u.setConId(t.getConId());
		u.setUserId(sid);
		u.setUserName(susername);
		u.setBidPrice(t.getBasePrice());
		
		ModelAndView mv = new ModelAndView("registerUserTender");
		
		mv.addObject("tenderUserData", u);
		
		return mv;
		
	}
	
	@PostMapping("/registerTender/{sid}/{susername}/{tenderId}/registerTenderData")
	public ModelAndView doInsertTender(@Valid @ModelAttribute("tenderUserData") UserTender user, BindingResult br) {

		if (br.hasErrors()) {

			return new ModelAndView("registerUserTender");
		}
		
		UserTender ut=userv.registerUserTender(user);
		
		return new ModelAndView("registerContractorSuccess", "user", ut);

	}
	
	@GetMapping("/myBiddings/{sid}")

	public ModelAndView biddingsHandler(@PathVariable Integer sid)  {

		List<UserTender> result = userv.findByUserId(sid);

		ModelAndView mv = new ModelAndView("biddingsList");

		mv.addObject("biddingData", result);

		return mv;
	}
	
}
