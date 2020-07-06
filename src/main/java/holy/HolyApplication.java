package holy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@ComponentScan({"holy","Controller"}) // 자동으로 하위 패키지까지 찿음
//@EnableAutoConfiguration
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})// JDBC를 당장 사용 안할경우 예외 처리
public class HolyApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolyApplication.class, args);
	}

}
