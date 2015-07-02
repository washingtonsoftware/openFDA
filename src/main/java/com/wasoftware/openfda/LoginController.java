package com.wasoftware.openfda;

import com.wasoftware.openfda.util.GetMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value = {"/","login"}, method = RequestMethod.GET)

	public String gotoLogin() {return "login";}

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)

	public String printWelcome(ModelMap model) {
		model.addAttribute("greeting", GetMessage.getMessage("home.greeting"));
		model.addAttribute("topic1", GetMessage.getMessage("home.topic.aboutUs"));
		model.addAttribute("message1", GetMessage.getMessage("home.aboutUs.introduction"));
		model.addAttribute("topic2", GetMessage.getMessage("home.topic.whoMadeOpenFDAPortal"));
		model.addAttribute("message2", GetMessage.getMessage("home.whoMadeOpenFDAPortal"));
		model.addAttribute("topic3", GetMessage.getMessage("home.topic.whatCanOpenFDAPortalDo"));
		model.addAttribute("message3", GetMessage.getMessage("home.whatCanOpenFDAPortalDo"));
		return "welcome";
	}

	//for 404 access denied page
	@RequestMapping(value = "/404", method = RequestMethod.GET)
	public String accesssDenied() {
		return "login";
	}
}