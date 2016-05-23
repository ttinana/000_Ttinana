package com.ttinana.hellocontroller;

/** 9, 10, 11
 * this controller covers @RequestMapping
 * @ModelAttribute
 * 
 */

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ttinana.model.User;

@Controller
public class FormLoginController {

	// @RequestMapping(value = "/admissionForm", method = RequestMethod.GET)
	@RequestMapping("/*")
	public ModelAndView getAdmissionForm() {

		ModelAndView model = new ModelAndView("AdmissionForm");
		return model;
	}

	@RequestMapping(value = "submitAdmissionForm", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(
			@ModelAttribute("myUser") User myUser) {
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("msg", "Details submitted by you:: ");
		model.addObject("myUser", myUser);

		return model;
	}

	/**
	 * ADDING MODEL OBJECT
	 * 
	 * @ModelAttribute annotated method are called before any other method from
	 *                 controller like ex. @RequestMapping annotated methods
	 */
	@ModelAttribute
	public void addingModelObject(Model model) {
		model.addAttribute("headerText", "Clearing House of NeverEverland");
	}

	/**
	 * 
	 * 
	 * *** OLDER VERSIONS ***
	 * 
	 * 
	 * 
	 */

	/**
	 * BEST PRACTICE!!!
	 * 
	 * @param reqPar
	 * @return
	 */
	@RequestMapping(value = "submitAdmissionForm11best", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm11best(
			@RequestParam Map<String, String> reqPar) {

		// Boolean isEmptyName = reqPar.get("formName").isEmpty();
		User myUser = new User(reqPar.get("formName"), reqPar.get("formHobby"));

		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("msg", "Details submitted by you:: ");
		model.addObject("myUser", myUser);

		return model;
	}

	@RequestMapping(value = "submitAdmissionForm11", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm11(
			@ModelAttribute("myUser") User myUser) {
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("msg", "Details submitted by you:: ");
		model.addObject("myUser", myUser);

		return model;
	}

	@RequestMapping(value = "submitAdmissionForm10", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm10(
			@RequestParam Map<String, String> reqPar) {

		Boolean isEmptyName = reqPar.get("formName").isEmpty();
		String name = reqPar.get("formName");
		String hobby = reqPar.get("formHobby");

		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("msg", "Details submitted by you:: Name: " + name
				+ ", Hobby: " + hobby);

		return model;
	}
}