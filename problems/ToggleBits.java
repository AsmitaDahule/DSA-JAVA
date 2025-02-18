import java.util.Scanner;

class ToggleBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();


        convertToBinary(n);
    }

    public static void convertToBinary(int n) {
        StringBuilder res = new StringBuilder();
        while(n > 0) {
            res.append(n % 2);
            n /= 2;
        }
        String str = res.reverse().toString(); 
        System.out.println(str);

        toggle(str);
    }

    public static void toggle(String str) {
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
           if(str.charAt(i) == '1') {
            res.append('0');
           } else {
            res.append('1');
           }
        }
        System.out.println(res.toString());
        convertToDecimal(res.toString());
    }

    public static void convertToDecimal(String str) {
        int decimal = 0;
        int pow = 1;
        for(int i = str.length()-1; i >= 0; i--) {
            if(str.charAt(i) == '1') {
                decimal += pow;
            }
            pow *= 2;
        }
        System.out.println(decimal);
    }
}