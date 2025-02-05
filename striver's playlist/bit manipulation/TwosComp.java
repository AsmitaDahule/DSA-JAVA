public class TwosComp {
    public static void main(String[] args) {
        int[] num = new int[]{1,0,0,1,0,1,0};
        int cnt = 0;
        for(int i = num.length-1; i >= 0; i--) {
            if(num[i] == 0) { 
                cnt++;
                num[i] = 0;
            }
            else {
                num[i] = 1;
                cnt++;
                break;
            }
        } 

        for(int i = num.length - cnt - 1; i >= 0; i--) {
            if(num[i] == 1) num[i] = 0;
            else num[i] = 1;
        }
        StringBuilder comp = new StringBuilder();
        for(int n : num) {
            comp.append(n);
        } 
        System.out.println(comp.toString());
    }
}
