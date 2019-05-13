public class PrePostTest {

  public static void main(String[] args) {
    int result1 = 10;
    int result2 = result1++ % 5;
    System.out.println(result1);
    System.out.println(result2);
  }
}