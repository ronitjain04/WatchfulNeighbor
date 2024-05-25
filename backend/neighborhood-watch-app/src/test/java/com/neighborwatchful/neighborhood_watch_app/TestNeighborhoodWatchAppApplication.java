package com.neighborwatchful.neighborhood_watch_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestNeighborhoodWatchAppApplication {

	public static void main(String[] args) {
		SpringApplication.from(NeighborhoodWatchAppApplication::main).with(TestNeighborhoodWatchAppApplication.class).run(args);
	}

}
