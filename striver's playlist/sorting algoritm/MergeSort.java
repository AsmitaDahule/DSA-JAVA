public class MergeSort{
    public static void main(String[] args) {
        int[] arr = {2,4,1,55,14,22,0};
        ms(arr,0,arr.length-1);
        for(int e:arr){
            System.out.print(e+" ");
        }
    }

    public static void ms(int[] arr, int low, int high){
        if(low >= high) return; // base condition
        int mid = low + (high - low)/2;
        ms(arr,low,mid); // first half
        ms(arr,mid + 1, high); // second half
        merge(arr,low,mid,high);  // merge th array
    }
    public static void merge(int[] arr, int low, int mid, int high){
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid+1;
        int k = 0;
        while(i <= mid && j <= high){
            if(arr[i] <= arr[j]){
                temp[k] = arr[i];
                k++;
                i++;
            } else{
                temp[k] = arr[j];
                k++;
                j++;
            }
        } while(i <= mid){
            temp[k] = arr[i];
            k++;
            i++;
        } while(j <= high){
            temp[k] = arr[j];
            k++;
            j++;
        } 
        for(int x = 0; x < temp.length; x++){
            arr[low + x] = temp[x];
        }
    }
}