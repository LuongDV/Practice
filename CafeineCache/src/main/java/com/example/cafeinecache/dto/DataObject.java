package com.example.cafeinecache.dto;

import lombok.Data;

@Data
public class DataObject {
  private final String data;
  private static int objectCounter = 0;
  // standard constructors/getters

  public static DataObject get(String data) {
    objectCounter++;
    return new DataObject(data);
  }
}
