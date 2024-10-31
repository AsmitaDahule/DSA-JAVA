public class IsPalindrom {
    public static void main(String[] args) {
        String str = "abcba"; 
ispalindrom(str, 0, str.length()-1);    }
    public static void ispalindrom(String str, int start, int end){
        if(start < end){
        if(str.charAt(start) == str.charAt(end)){
            return;
        }
    }
    ispalindrom(str, start+1, end-1);
    System.out.println("palindrome");
    }
}
