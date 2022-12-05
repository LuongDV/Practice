package com.example.cafeinecache.controller;

import com.example.cafeinecache.dto.DataObject;
import com.example.cafeinecache.dto.JobTriggerPoolHelper;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.LoadingCache;
import com.sun.corba.se.impl.orbutil.graph.Graph;
import java.security.Key;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler {

//  @GetMapping(value = "/data")
//  public DataObject getDataObject() {
//
//    //    3.1: mannually
//
////    Cache<String, DataObject> cache = Caffeine.newBuilder()
////        .expireAfterWrite(1, TimeUnit.MINUTES)
////        .maximumSize(100)
////        .build();
////
////    DataObject dataObject = new DataObject("");
////    String key = "A";
//
//    // populate the cache
////    cache.put(key, dataObject);
////    dataObject = cache.getIfPresent(key);
//
//    // get the value using the get method
////    dataObject = cache
////        .get(key, k -> DataObject.get("Data for A"));
//
//
//    // invalidate some cached values
////    cache.invalidate(key);
////    dataObject = cache.getIfPresent(key);
//
////    3.2. Synchronous Loading
//      synLoading();
//
//    return null;
//  }
//
//  public static void synLoading() {
//        String key = "A";
//
//    LoadingCache<Key, Graph> cache = Caffeine.newBuilder()
//        .maximumSize(10_000)
//        .expireAfterWrite(10, TimeUnit.MINUTES)
//        .build(key -> createExpensiveGraph(key));
//// Lookup and compute an entry if absent, or null if not computable
//    Graph graph = cache.get(key);
//// Lookup and compute entries that are absent
//    Map<Key, Graph> graphs = cache.getAll(keys);
//  }
//
//  private void assertEquals(int i, int size) {
//  }
//
//  private void assertEquals(String s, String a) {
//  }
//
//  private void assertNotNull(DataObject dataObject) {
//  }
//
//  private static void assertNull(DataObject dataObject) {
//  }

  @RequestMapping("/trigger")
  @ResponseBody
//@PermessionLimit(limit = false)
  public String triggerJob(int id, String executorParam) {
    // force cover job param
    if (executorParam == null) {
      executorParam = "";
    }

//    JobTriggerPoolHelper.trigger(id, TriggerTypeEnum.MANUAL, -1, null, executorParam);
    return "SUCCESS";
  }
}

