package com.mikespider.springbootMagic.moniter;

import org.springframework.stereotype.Service;

@Service
public class TestMoniter implements ScheduledTask {

	public void excute() {
		System.out.println("执行----------------"+System.currentTimeMillis());
	}

}
