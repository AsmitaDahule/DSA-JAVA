class Bubble {
  public static void main(String[] args) {
    int n = 6;
    int[] arr = {1,2,3,4,5,6};
    bubblesort(arr, n);
    print(arr, n);
  }

  public static void bubblesort(int[] arr, int n) {
    boolean flag = false;
    int cnt = 0;
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < n-i-1; j++) {
        cnt++;
        if(arr[j] > arr[j+1]) {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
          flag = true;
        }
      } 
      if(flag == false) {
        break;
      }
    } System.out.println(cnt);
  } 

  public static void print(int[] arr, int n) {
    for(int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}