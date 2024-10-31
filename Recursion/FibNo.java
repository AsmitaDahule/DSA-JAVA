public class FibNo {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(findFiboNo(n));
    }
    public static int findFiboNo(int n){
        if(n < 2){
            return n;
        }
        return findFiboNo(n-1) + findFiboNo(n-2);
    }
}
