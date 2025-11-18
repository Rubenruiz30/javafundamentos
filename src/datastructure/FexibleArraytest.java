package datastructure;

public class FexibleArraytest {
    public static void main(String[] args) {
        FlexibleArray<Object> flexileArray = new FlexibleArray<>(1);
       //git  System.out.println("the current sie =" flexileArray.size());
      System.out.println("the current size = " + flexileArray.size());
      for (int i = 0; i < 6; i++) {
          flexileArray.add(3);

	}
      flexileArray.remove(4);
    }
}
