package controller;

import java.util.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ControllerJsp {
	
	// localhost:8888/testJsp
	@RequestMapping("/testJsp")
	public ModelAndView test() throws Exception{
		ModelAndView mav = new ModelAndView("testJsp");
		mav.addObject("name", "testJsp");

		List<String> testList = new ArrayList<String>();
		testList.add("a");
		testList.add("b");
		testList.add("c");

		mav.addObject("list", testList);
		return mav;
	}
	
	// 작동 안함
	// localhost:8080/testJsp2
	@RequestMapping("/testJsp2")
	public ModelAndView test2() throws Exception{
		ModelAndView mav = new ModelAndView("testJsp2");
		mav.addObject("name", "testJsp2");

		List<String> testList = new ArrayList<String>();
		testList.add("a");
		testList.add("b");
		testList.add("c");

		mav.addObject("list", testList);
		return mav;
	}

}
