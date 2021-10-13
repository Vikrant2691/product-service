package com.vison.project.productservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = { "timezone = GMT", "port: 8888" })
class ProductServiceApplicationTests {

	@Test
	void contextLoads() {
	}

}
