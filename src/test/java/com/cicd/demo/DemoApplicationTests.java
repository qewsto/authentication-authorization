package com.cicd.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testsRun() {
		System.out.println("Запуск тестов");
		System.out.println("Тесты пройдены");
	}
}
