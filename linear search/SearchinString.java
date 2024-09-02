import java.util.Arrays;

public class SearchinString {
    public static void main(String[] args) {
        String name = "Asmii";
        char target = 's';  
        boolean ans = search2(name, target);
        System.out.println(ans);  
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean search2(String str , char target) {
        if(str.length()==0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }


    // static boolean search(String str , char target) {
    //     if(str.length()==0){
    //         return false;
    //     }

    //     for(int index=0; index<str.length();index++){
    //         if(str.charAt(index) == target){
    //             return true;
    //         }
    //     }
    //     return false;
    // }
}
