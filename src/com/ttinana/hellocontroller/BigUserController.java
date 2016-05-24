/**
 * 
 */
package com.ttinana.hellocontroller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;
import javax.xml.ws.BindingType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ttinana.bindingeditors.BigUserNameEditor;
import com.ttinana.model.BigUser;

/**
 * @author tijana.pavicic
 *
 */
@Controller
// @SessionAttributes("bigUser")
public class BigUserController {
	static Logger logger = LoggerFactory.getLogger(BigUserController.class);
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		
		binder.setDisallowedFields(new String[] {"bigUserMobile"});
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy****MM****dd");
		binder.registerCustomEditor(Date.class, "bigUserDoB", new CustomDateEditor(dateFormat, false));
		binder.registerCustomEditor(String.class, "bigUserName", new BigUserNameEditor());
	}

	// @RequestMapping(value = "/bigUserForm", method = RequestMethod.GET)
	@RequestMapping("/*")
	public ModelAndView getAdmissionBigUserT() {

		ModelAndView model = new ModelAndView("BigUserForm");
		logger.info(" |INFO| BigUserController by Tijana.");
		return model;
	}

	/*
	 * @ModelAttribute("bigUser") public BigUser getInitializeMyObject() {
	 * return BigUser.getInitializedObject(); }
	 */

	@RequestMapping(value = "submitAdmissionBigUserForm", method = RequestMethod.POST)
	public ModelAndView submitAdmissionBigUserForm(
			@Valid @ModelAttribute("bigUser") BigUser bigUser, BindingResult result) {
		if (result.hasErrors()) {
			ModelAndView model = new ModelAndView("BigUserForm");
			model.addObject("msg", "Error try again: ");
			logger.error(" |ERROR| submitAdmissionBigUserForm by Tijana.");
			return model;
		} else {
			ModelAndView model = new ModelAndView("BigUserSuccess");
			model.addObject("msg", "Details submitted by you:: ");
			logger.info(" |INFO| submitAdmissionBigUserForm by Tijana.");
			return model;

		}

		
	}

	@ModelAttribute
	public void addingModelObject(Model model) {
		model.addAttribute("headerText", "MadHatter");
	}

}
