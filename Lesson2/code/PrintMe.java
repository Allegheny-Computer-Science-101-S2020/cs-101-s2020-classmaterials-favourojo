public class PrintMe{
  public static void main(String[] args){
    /*
    System.out.println(i);
    */
    if (i % 2 == 0)
      System.out.println(i + " is even");
    else
      System.out.println(i + " is odd");

    }
    System.out.println("---------------------");
    int = 0;
    while(true) {
      if (i % 2 == 0)
        System.out.println(i + " is even");
      else
        System.out.println(i + " is odd");
      i++;
      if (i > 9)
        break;
    }
    System.out.println("-------------------------");
    int j = 0;
    while(true){
      if (j % 2 == 0)
        System.out.println(j + " is even");
      else
        System.out.println(j + " is odd");
      j++;
    }
  }
}
