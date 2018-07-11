package boot.future.scheduler.core;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class ScheduledTasks {
	
	 private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);
	 private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	 
	 @Scheduled(fixedRate = 5000)
	 public void startScheduling() {
		 log.info("The time is now {}", dateFormat.format(new Date()));
		
	}

}
