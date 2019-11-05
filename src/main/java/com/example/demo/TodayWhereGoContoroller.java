package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TodayWhereGoContoroller {

	@Autowired
	DestinationCandidateService service;

	@GetMapping("setting/table")
	String list(Model model) {
		List<DestinationCandidate> destination = service.findAll();
		model.addAttribute("destination_candidates", destination);
		return "setting/table";
	}
	@GetMapping("home/start")
	public String start(Model model) {
		return "home/start";
	}
	@GetMapping("roulette/roulette")
	public String roulette(Model model) {
		return "roulette/roulette";
	}
	@GetMapping("analysis/analysis")
	public String analysis(Model model) {
		return "analysis/analysis";
	}
//	@GetMapping("setting/table")
//	public String table(Model model) {
//		return "setting/table";
//	}

	@GetMapping("setting/user")
	public String user(Model model) {
		return "setting/user";
	}
}
