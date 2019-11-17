package com.example._load_balancing_client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class LogsController {
	private static int count = 1;
	private List<LogDto> logs = new ArrayList<>();
	private RestTemplate restTemplate;
	
	public LogsController() {
		this.restTemplate=new RestTemplate();
	}

	@Scheduled(fixedRate = 2000)
	public void scheduleFixedRateTask() {
		String log = restTemplate.getForObject("http://blog-3-zuul-container:8762/books/api/v1", String.class);
//		logs.add(new LogDto(count++, String.valueOf(System.currentTimeMillis())));
		logs.add(new LogDto(count++, log));
		if (logs.size() > 10) {
			logs.remove(0);
		}
	}

	@GetMapping("/")
	public String retrieveLogs(Model model) {
		model.addAttribute("logs", logs);
		return "logs.html";
	}
}
