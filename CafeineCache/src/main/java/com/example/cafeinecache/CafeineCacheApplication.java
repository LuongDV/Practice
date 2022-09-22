package com.example.cafeinecache;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import java.util.concurrent.TimeUnit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CafeineCacheApplication {

  public static void main(String[] args) {
    SpringApplication.run(CafeineCacheApplication.class, args);
  }

}
