package pl.jaceksysiak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 

@Controller
@SpringBootApplication
public class App {

	  public static void main(String[] args) throws Exception {
		    SpringApplication.run(App.class, args);
		  }

		  @RequestMapping("/")
		  String index() {
		    return "index";
		  }
		  
		  @RequestMapping("/admin")
		  String admin() {
		    return "admin";
		  }

}