public class RecurMin{
  public static int findMin(int a[], int index, int compare){
    //base
    if (index == a.length-1)
      return a[index];

    // scenario 1
    for (int i = index; i < a.length; i++) {
      if (a[i] < compare) {
        compare = a[i];
      }
    }
    return compare;
  }
  public static void main(String [] args) {
    int a[] == {8,3,10,5,2};
    int min = findMin(a[],0,100);
  }
}
