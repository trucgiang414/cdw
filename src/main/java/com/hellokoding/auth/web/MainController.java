package com.hellokoding.auth.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.hellokoding.auth.model.Menu;
import com.hellokoding.auth.service.MenuService;

@Controller
public class MainController {
	@Autowired
	MenuService menuService;

	@GetMapping({ "/", "/welcome" })
	public String welcome(Model model) {
		List<Menu> menus = menuService.findAll();
		for (int i = 0; i < menus.size(); i++) {
			System.out.println("log: "+ menus.get(i).toString());
		}
		model.addAttribute("menus", menus);
		return "views/main";
	}
}
