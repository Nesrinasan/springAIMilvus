package com.asan.milvusspringaitest;

import com.asan.milvusspringaitest.milvus.MilvusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MilvusspringaitestApplication implements CommandLineRunner {

	@Autowired
	MilvusService milvusService;

	public static void main(String[] args) {
		SpringApplication.run(MilvusspringaitestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		milvusService.getDataFromMilvus();
	}
}
