package com.demo.springboot.solrcloud;

import com.demo.springboot.solrcloud.entity.Demo;
import com.demo.springboot.solrcloud.repository.DemoRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SolrcloudApplicationTests {

	@Autowired
	private DemoRepo demoRepo;

	@Test
	public void findByNameTest() {
		List<Demo> demos = demoRepo.findByName("test");


	}

}
