package holy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@ComponentScan({"holy","Controller"}) // 자동으로 하위 패키지까지 찿음
//@EnableAutoConfiguration
public class HolyApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolyApplication.class, args);
	}

}
