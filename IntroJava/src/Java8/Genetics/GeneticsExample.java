package Java8.Genetics;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GeneticsExample {

  public static void main(String[] args) {
    List myVales = new ArrayList();

    myVales.add(5);
    myVales.add("luaosdfh");
    myVales.add(new Date());

    GeneticsExample geneticsExample = new GeneticsExample();
    geneticsExample.sum(myVales);
  }

  private void sum(List values) {
    int sum = 0;
    for (int i = 0; i < values.size(); i ++) {
      System.out.println(values.get(i));
    }
  }
}
