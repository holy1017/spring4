package controller;
// 주의 같은 패키지 안에 있어야 작동함
// 만약 다른 패키지 포함 할려면 @ComponentScan 사용

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.var;
import util.Log;

@Controller
public class MainController {

	@RequestMapping(value = "/index")
	public String index() {
		Log.log("index");
		return "/index.html";
	}	
	
	@RequestMapping(value = "/indexGet",method = RequestMethod.GET)
	public String indexGet() {
		Log.log("index");
		return "/index.html";
	}	
	
	// localhost:8080/input?s=asdf&i=6
	// @RequestParam 은 Key=Value 형태의 HTTP 요청 파라미터를 메소드의 파라미터에 전달해준다.
	@RequestMapping(value = "/input")
	public String input(String s,int i) {
		Log.log("input:"+s+":"+i);		
		return "/index.html";
	}	
	
	// localhost:8080/path/qwer/24356
    @RequestMapping(path="/path/{name}/{age}")
    public String getMessage(
    		@PathVariable("name") String name, 
            @PathVariable("age") String age
            ) {
        
    	Log.log("input:"+name+":"+age);		
    	return "/index.html"; // 주의하자. 절대경로 안스면 /path/{name}/index.html 으로 회신한다
    }
    
    // localhost:8080/valueTest
    @ResponseBody 
    @RequestMapping("/valueTest") 
    public String valueTest(){ 
    	String value = "테스트 String"; 
    	return value; 
	}

  //  출처: https://goddaehee.tistory.com/203?category=367461 [갓대희의 작은공간]
    
}
