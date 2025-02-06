public class TwosComp {
    // public static void main(String[] args) {
    //     int[] num = new int[]{1,0,0,1,0,1,0};
    //     System.out.println(convert(num));
        // int cnt = 0;
        // for(int i = num.length-1; i >= 0; i--) {
        //     if(num[i] == 0) { 
        //         cnt++;
        //         num[i] = 0;
        //     }
        //     else {
        //         num[i] = 1;
        //         cnt++;
        //         break;
        //     }
        // } 

        // for(int i = num.length - cnt - 1; i >= 0; i--) {
        //     if(num[i] == 1) num[i] = 0;
        //     else num[i] = 1;
        // }
        // StringBuilder comp = new StringBuilder();
        // for(int n : num) {
        //     comp.append(n);
        // } 
        // System.out.println(comp.toString());
    //}

    public static void main(String[] args) {
        int[] num = new int[]{1,0,0,1,0,1,0};
        System.out.println(convert(num));
    }

    public static String convert(int[] num) {
        // one's complement
        for(int i = 0; i < num.length; i++) {
            num[i] = (num[i] == 1) ? 0 : 1;
        }


        for(int i = num.length-1; i >= 0; i--) {
            if(num[i] == 0) {
                num[i] = 1;
                break;
            } else {
                num[i] = 0;
            }
        } 

        StringBuilder res = new StringBuilder();
        for(int n : num) {
            res.append(n);
        }
        return res.toString();
    }
}
