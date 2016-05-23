/**
 * 
 */
package com.ttinana.hellocontroller;

/**
 * @author tijana.pavicic
 *
 */
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
public class HelloController extends AbstractController {

	@Override
	//@RequestMapping("/*")
	@RequestMapping("/index")
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		ModelAndView modelandview = new ModelAndView("index");
		modelandview.addObject("welcomeMessage",
				"Hi User, welcome to the first Spring MVC Application");

		return modelandview;
	}

	/* 9. cas Gontu @PathVariable */
	@RequestMapping("/path/{countryName}/{userName}")
	protected ModelAndView handleRequest9(
			@PathVariable("userName") String name,
			@PathVariable("countryName") String country) throws Exception {

		ModelAndView modelandview = new ModelAndView("index");
		modelandview.addObject("welcomeMessage",
				"Hi User, welcome to the 9. class, " + name + " from "
						+ country);
		return modelandview;
	}

	/* 9. cas Gontu @PathVariable MAP */
	@RequestMapping("/{countryName}/{userName}")
	protected ModelAndView handleRequest9Map(
			@PathVariable Map<String, String> pathVars) throws Exception {

		String name = pathVars.get("userName");
		String country = pathVars.get("countryName");

		ModelAndView modelandview = new ModelAndView("index");
		modelandview.addObject("welcomeMessage",
				"Hi User, welcome to the 9. class, Map example , " + name + " from "
						+ country);
		return modelandview;
	}
}
