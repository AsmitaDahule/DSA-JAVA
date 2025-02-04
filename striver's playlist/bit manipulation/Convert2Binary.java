class Convert2Binary {
    public static void main(String[] args) {
        int num = 1; 
        System.out.println(num);
        System.out.println(convertToBinary(num));
        System.out.println(convertToBinary(20));
        System.out.println(convertToBinary(10));
        System.out.println(convertToBinary(7));
        System.out.println(convertToBinary(4));
    }

    public static String convertToBinary(int x) {
        String res = "";
        while(x > 0) {
            if(x % 2 == 1) res += "1";
            else res += "0";
            x = x/2;
        }
       
        return reverse(res);
    }
    public static String reverse(String str) {
        String rev = "";
        for(int i =str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }

}

// class Convert2Binary {
//     public static void main(String[] args) {
//         int num = 10;
//         System.out.println(convertToBinary(num)); // Output: 1010
//     }

//     public static String convertToBinary(int x) {
//         if (x == 0) return "0";
        
//         StringBuilder res = new StringBuilder();
//         while (x > 0) {
//             res.append(x % 2);  // Append remainder (0 or 1)
//             x = x / 2;
//         }
//         return res.reverse().toString(); // Reverse the string to get correct binary representation
//     }
// }
