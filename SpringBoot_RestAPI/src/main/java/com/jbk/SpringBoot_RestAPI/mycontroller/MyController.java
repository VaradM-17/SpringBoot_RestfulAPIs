package com.jbk.SpringBoot_RestAPI.mycontroller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class MyController {

	@RequestMapping(value = "/inbox", method = RequestMethod.GET)
	public String firstAPI() {
		return "Received feedback for Mock Interview.";
	}

	@RequestMapping(value = "/starred", method = RequestMethod.POST)
	public String secondAPI() {
		return "Java Notes, Python Notes, Javascript Notes";
	}

	@RequestMapping(value = "/spam", method = RequestMethod.PUT)
	public String fourthAPI() {
		return "Congratulations!\nYou've won a $1000 gift card.\nGo to http:/fjhv/123456 tp claim now.";
	}

	@RequestMapping(value = "/trash", method = RequestMethod.DELETE)
	public String thirdAPI() {
		return "Nebula Tech: Long time no see, Varad! Let’s reconnect and talk about some of the new packages we offer. Are you interested?";
	}

	// Using Http Methods
	@GetMapping("/notification")
	public String fifthAPI() {
		return "Thanks for your inquiry! We’ll be with you shortly. Please expect a call within 24 hours.   ";
	}

	@PostMapping("/compose")
	public String sixthAPI() {
		return "New Message\nTo\nSubject\n\nSend";
	}

	@PutMapping("/important")
	public String seventhAPI() {
		return "[Action Required] Deadline for Project Submission";
	}

	@DeleteMapping("/scheduled")
	public String eighthAPI() {
		return "A meeting has been scheduled for Monday at 10am in the conference room.";
	}

}
