package io.mbeyah.springbootstarter.topic;

import java.util.List;
import java.util.Arrays;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("Spring", "Spring Framework", "Spring framework description"),
				new Topic("Spring", "Spring Framework", "Spring framework description"),
				new Topic("Spring", "Spring Framework", "Spring framework description"),
				new Topic("Spring", "Spring Framework", "Spring framework description")
				);
	}
}
