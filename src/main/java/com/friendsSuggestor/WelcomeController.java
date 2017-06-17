package com.friendsSuggestor;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.friendsSuggestor.model.FriendSuggestor;

@Controller
public class WelcomeController {

	private static String UPLOADED_FOLDER = "D://Images//";
	
//	@Autowired FriendSuggestor friendSuggestor;
	// inject via application.properties
	//@Value("${welcome.message}")
	private String message = "Hello World";

	@RequestMapping("/")
	//Map<String, Object> model
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "welcome";
	}
	
	@RequestMapping("/uploadpraveen")
	public String uploadpraveen(Map<String, Object> model,@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {
		FriendSuggestor friendSuggestor = new FriendSuggestor();
		friendSuggestor.setName(file.getOriginalFilename());
		friendSuggestor.setFilePath(UPLOADED_FOLDER);
		friendSuggestor.setIdentification("I");
		System.out.println("Enter into uploadpraveen"+file.getOriginalFilename());
		model.put("message", this.message);
		return "welcome";
	}

	@RequestMapping("/uploadsenthil")
	public String uploadsenthil(Map<String, Object> model ,@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {
		
		FriendSuggestor friendSuggestor = new FriendSuggestor();
		friendSuggestor.setName(file.getOriginalFilename());
		friendSuggestor.setFilePath(UPLOADED_FOLDER);
		friendSuggestor.setIdentification("I");
		System.out.println("Enter into uploadpraveen"+file.getOriginalFilename());
		model.put("message", this.message);
		return "welcome";
	}

	@RequestMapping("/uploadvinoth")
	public String uploadvinoth(Map<String, Object> model ,@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {
		
		FriendSuggestor friendSuggestor = new FriendSuggestor();
		friendSuggestor.setName(file.getOriginalFilename());
		friendSuggestor.setFilePath(UPLOADED_FOLDER);
		friendSuggestor.setIdentification("I");
		System.out.println("Enter into uploadpraveen"+file.getOriginalFilename());
		model.put("message", this.message);
		return "welcome";
	}
	
	@RequestMapping("/group")
	public String group(Map<String, Object> model ) {
		
		
		model.put("message", this.message);
		return "groupwelcome";
	}

}