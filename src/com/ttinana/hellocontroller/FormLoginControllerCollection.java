/**
 * 12-
 */
package com.ttinana.hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ttinana.model.User;

/**
 * @author tijana.pavicic
 *
 */
@Controller
public class FormLoginControllerCollection {	

	@RequestMapping(value = "submitAdmissionFormCollection", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(
			@ModelAttribute("myUser") User myUser) {
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("msg", "Details submitted by Collection:: ");
		model.addObject("myUser", myUser);
		return model;
	}


}
