package boot.future.scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import boot.future.scheduler.pojo.ServerHeath;

@SpringBootApplication
@RestController("/")
@EnableScheduling
public class BootSchedulerApplication {
	
	@ResponseBody
	@GetMapping("/")
	public ServerHeath startScheduling() {
		return new ServerHeath("200.OK", "Boot Scheduler", "Scheduler has been successfully started...");
	}

	public static void main(String[] args) {
		SpringApplication.run(BootSchedulerApplication.class, args);
	}
}
