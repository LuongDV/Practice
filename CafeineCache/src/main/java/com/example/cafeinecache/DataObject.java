package com.example.cafeinecache;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
