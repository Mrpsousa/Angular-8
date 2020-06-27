package roger.com.vendaLoja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class VendaLojaApplication {

	@GetMapping("/hello")
	public String helloworld() {
		return "Hello";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(VendaLojaApplication.class, args);
	}

}
