package nz.org.nesi.nesischeduler.scheduler;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import nz.org.nesi.nesischeduler.project.model.Adviser;
import nz.org.nesi.nesischeduler.project.repository.AdviserRepository;

@Configuration
@EnableScheduling
public class NesiScheduler {
	final static Logger logger = LoggerFactory.getLogger(NesiScheduler.class);
	@Autowired
	private AdviserRepository adviserRepository;
	
	@Scheduled(fixedDelay = 10000)
	public void scheduleFixedDelayTask() {
		List<Adviser> adviserList = adviserRepository.findAll();
	    logger.info("Fixed delay task - " + System.currentTimeMillis() / 1000);
	    logger.info("Number of advisers - " + adviserList.size());
	}
}
