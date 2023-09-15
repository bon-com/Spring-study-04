package com.example.app;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@Autowired
	private MessageSource messageSource;
	
    @RequestMapping("/")
    public String home(Model model) {
    	// メッセージプロパティからメッセージ設定
    	String welcomeMsg = messageSource.getMessage("welcome.message", null, Locale.JAPANESE);
    	model.addAttribute("msg", welcomeMsg);
    	
        return "index";
    }

}