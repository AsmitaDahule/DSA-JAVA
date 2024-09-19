public class IsSorted {
    public static void main(String[] args) {
        
    }
    static int isSorted(int n, int []a) {
        if(a.length == 0) {
            return -1;
        }
        int previous = a[0];
        for(int i:a) {
            if(a[i] < previous){
                return -1;
            }
        }
        return 1;
    }
}
