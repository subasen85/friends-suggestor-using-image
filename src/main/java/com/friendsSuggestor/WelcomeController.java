package com.friendsSuggestor;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.friendsSuggestor.model.FriendSuggestor;


@Controller

public class WelcomeController {

	private static String UPLOADED_INDIVIDUAL_FOLDER = "D://Images//Individual//";
	private static String UPLOADED_GROUP_FOLDER = "D://Images//Group//";
	
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
	public String uploadpraveen(Map<String, Object> model,@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes, HttpServletRequest request , HttpServletResponse response) {
		
		 response.setContentType("text/html;charset=UTF-8");
		    try {
				PrintWriter out = response.getWriter();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//		        String savePath = "C:" + File.separator + SAVE_DIR; //specify your path here
		            File fileSaveDir=new File(UPLOADED_INDIVIDUAL_FOLDER);
		            if(!fileSaveDir.exists()){
		                fileSaveDir.mkdir();
		            }
		Part part = null;
		try {
			part = request.getPart("file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String fileName=extractFileName(part);
        System.out.println("praveen uploading...");
        try {
			part.write(UPLOADED_INDIVIDUAL_FOLDER + File.separator + fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("praveen uploaded successfully..");
		FriendSuggestor friendSuggestor = new FriendSuggestor();
		friendSuggestor.setName(file.getOriginalFilename());
		friendSuggestor.setFilePath(UPLOADED_INDIVIDUAL_FOLDER);
		friendSuggestor.setIdentification("I");
		System.out.println("Enter into uploadpraveen"+file.getOriginalFilename());
		model.put("message", this.message);
		return "welcome";
	}

	@RequestMapping("/uploadsenthil")
	public String uploadsenthil(Map<String, Object> model ,@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes , HttpServletRequest request , HttpServletResponse response) {
		
		 response.setContentType("text/html;charset=UTF-8");
		    try {
				PrintWriter out = response.getWriter();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//		        String savePath = "C:" + File.separator + SAVE_DIR; //specify your path here
		            File fileSaveDir=new File(UPLOADED_INDIVIDUAL_FOLDER);
		            if(!fileSaveDir.exists()){
		                fileSaveDir.mkdir();
		            }
		Part part = null;
		try {
			part = request.getPart("file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     String fileName=extractFileName(part);
     System.out.println("praveen uploading...");
     try {
			part.write(UPLOADED_INDIVIDUAL_FOLDER + File.separator + fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     System.out.println("praveen uploaded successfully..");
		FriendSuggestor friendSuggestor = new FriendSuggestor();
		friendSuggestor.setName(file.getOriginalFilename());
		friendSuggestor.setFilePath(UPLOADED_INDIVIDUAL_FOLDER);
		friendSuggestor.setIdentification("I");
		System.out.println("Enter into uploadpraveen"+file.getOriginalFilename());
		model.put("message", this.message);
		return "welcome";
	}

	@RequestMapping("/uploadvinoth")
	public String uploadvinoth(Map<String, Object> model ,@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes , HttpServletRequest request , HttpServletResponse response) {
		
		 response.setContentType("text/html;charset=UTF-8");
		    try {
				PrintWriter out = response.getWriter();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//		        String savePath = "C:" + File.separator + SAVE_DIR; //specify your path here
		            File fileSaveDir=new File(UPLOADED_INDIVIDUAL_FOLDER);
		            if(!fileSaveDir.exists()){
		                fileSaveDir.mkdir();
		            }
		Part part = null;
		try {
			part = request.getPart("file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     String fileName=extractFileName(part);
     System.out.println("praveen uploading...");
     try {
			part.write(UPLOADED_INDIVIDUAL_FOLDER + File.separator + fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     System.out.println("praveen uploaded successfully..");
		FriendSuggestor friendSuggestor = new FriendSuggestor();
		friendSuggestor.setName(file.getOriginalFilename());
		friendSuggestor.setFilePath(UPLOADED_INDIVIDUAL_FOLDER);
		friendSuggestor.setIdentification("I");
		System.out.println("Enter into uploadpraveen"+file.getOriginalFilename());
		model.put("message", this.message);
		return "welcome";
	}
	
	
	@RequestMapping("/individualclear")
	public String individualclear(Map<String, Object> model) {
		
		 
		model.put("message", this.message);
		return "welcome";
	}
	
	@RequestMapping("/groupclear")
	public String groupclear(Map<String, Object> model) {
		
		 
		model.put("message", this.message);
		return "groupwelcome";
	}
	
	@RequestMapping("/group")
	public String group(Map<String, Object> model  , @RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes , HttpServletRequest request , HttpServletResponse response) {
		
		 response.setContentType("text/html;charset=UTF-8");
		    try {
				PrintWriter out = response.getWriter();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//		        String savePath = "C:" + File.separator + SAVE_DIR; //specify your path here
		            File fileSaveDir=new File(UPLOADED_GROUP_FOLDER);
		            if(!fileSaveDir.exists()){
		                fileSaveDir.mkdir();
		            }
		Part part = null;
		try {
			part = request.getPart("file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  String fileName=extractFileName(part);
  System.out.println("praveen uploading...");
  try {
			part.write(UPLOADED_GROUP_FOLDER + File.separator + fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  System.out.println("praveen uploaded successfully..");
		FriendSuggestor friendSuggestor = new FriendSuggestor();
		friendSuggestor.setName(file.getOriginalFilename());
		friendSuggestor.setFilePath(UPLOADED_GROUP_FOLDER);
		friendSuggestor.setIdentification("G");
		System.out.println("Enter into uploadpraveen"+file.getOriginalFilename());
		model.put("message", this.message);
		return "groupwelcome";
	}
	
	
	private String extractFileName(Part part) {
	 String contentDisp = part.getHeader("content-disposition");
	    String[] items = contentDisp.split(";");
	    for (String s : items) {
	        if (s.trim().startsWith("filename")) {
	            return s.substring(s.indexOf("=") + 2, s.length()-1);
	        }
	    }
	    return "";
	}


}