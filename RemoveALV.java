import java.util.ArrayList;

public class RemoveALV {
  static  ArrayList<String> obj= new ArrayList<>();

    public static void main(String[] args) {
        obj.add("akhilesh");
        obj.add("sonu");
        obj.add("harshi");
        obj.add("risi");
        System.out.println(obj);
        RemoveALV.removeValue("akhilesh");


    }

    public static void removeValue(String str)
    {
      obj.remove(str);
        System.out.println("After Removal:"+obj);

    }

}
