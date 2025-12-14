package CodingQuestion;

public class ExceptionHandling {
public static void main(String [] args)
{
    age(17);
}
  static  void age(int n)
  {
      if(n<18)
      {
          throw new RuntimeException("Age is below 18");

      }
      else {
          System.out.println("Perfect age");
      }
  }
}
