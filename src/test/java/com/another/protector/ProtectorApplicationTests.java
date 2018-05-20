package com.another.protector;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProtectorApplicationTests {
	/**
	 * @Test 最基本的注解，用来把方法标记为测试的一部分
	 */
	@Test
	public void contextLoads() {
		System.out.println("This is the test case 1");
	}

}
