package com.atw.signweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Karl
 * @Description
 * @date 2019/1/9 22:00
 */
@RequestMapping("/manage")
@Controller
public class ManageController {

	private static String viewPrefix = "manage/";

	@RequestMapping({"", "/index"})
	public String manage() {

		return viewPrefix+"index";
	}

	@RequestMapping({"/record"})
	public String tables() {

		return viewPrefix+"tables";
	}
}
