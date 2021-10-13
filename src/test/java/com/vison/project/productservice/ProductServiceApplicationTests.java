package com.vison.project.productservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@ActiveProfiles("test")
@TestPropertySource("classpath:bootstrap-test.properties")
class ProductServiceApplicationTests {

	@Test
	void contextLoads() {
	}

}
