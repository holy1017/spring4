package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import util.Log;
import vo.VoThymeleaf;

// RestController 사용 불가
@Controller
public class ControllerThymeleaf {
	
	//http://localhost:8888/testThymeleaf
	@RequestMapping("/testThymeleaf")
	public String thymeleafTest(Model model) {
		Log.log("thymeleafTest");
	    VoThymeleaf testModel = new VoThymeleaf("kkaok", "테스트", "web") ;
	    model.addAttribute("testModel", testModel);
	    return "thymeleaf/testThymeleaf.html";
	}
	
	// 작동 안함
	//http://localhost:8888/testThymeleaf
	@RequestMapping("/testThymeleaf2")
	public String thymeleafTest2(Model model) {
		Log.log("thymeleafTest");
	    VoThymeleaf testModel = new VoThymeleaf("kkaok", "테스트", "web") ;
	    model.addAttribute("testModel", testModel);
	    return "thymeleaf/testThymeleaf2.html";
	}
}
