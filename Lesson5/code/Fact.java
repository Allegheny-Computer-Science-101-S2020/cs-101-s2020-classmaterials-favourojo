public class Fact {
//  public static int factorial(int num) {
  //  int fact = 0;
    //for(int i = num; i > 0; i--) {
    //  if(i == num) {
      //  fact = num;
    //  } else {
      //  fact *= i;
      //}
    //}
  //  return fact;
//  }

  public static int sum(int num) {
    int sum = 0;
    for(int i = num; i > 0; i--) {
      if(i == num) {
        sum = num;
      } else {
        sum += i;
      }
    }
    return sum;
  }
  public static void main(String[] args) {
    //System.out.println(factorial(5));
    //System.out.println(sum(20));
    int n = 20;
    System.out.println(n*(n+1)/2);
  }
}
