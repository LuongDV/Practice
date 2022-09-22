package com.example.cafeinecache;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import java.util.concurrent.TimeUnit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler {

  @GetMapping(value = "/data")
  public DataObject getDataObject() {

    Cache<String, DataObject> cache = Caffeine.newBuilder()
        .expireAfterWrite(1, TimeUnit.MINUTES)
        .maximumSize(100)
        .build();

    DataObject dataObject = new DataObject("");
    String key = "A";
    cache.put(key, dataObject);
    dataObject = cache.getIfPresent(key);

    assertNull(dataObject);

    return null;
  }

  private static void assertNull(DataObject dataObject) {
  }
}

