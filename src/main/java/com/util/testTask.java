package com.util;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class testTask {
	@Scheduled(cron = "0/5 * *  * * ? ")
	// 每5秒执行一次
	public void myTest() {
		System.out.println("进入测试");
	}
}