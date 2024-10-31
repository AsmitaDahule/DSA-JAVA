public class Concept{
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
    public static void print(int n){
        if(n == 0)
        return;

        System.out.println(n);
        // print(n--); // pass the value of n first then subtract
        print(--n); // first subtract the value of n by 1 then pass
    }
}