class Complement {
    public static void main(String[] args) {
        int[] Bnum = new int[]{1,0,1,0,0,1,0,1,1};
        for(int i = 0; i < Bnum.length; i++) {
            if(Bnum[i] == 1) Bnum[i] = 0;
            else Bnum[i] = 1;
        }
        // convert array into string 
        StringBuilder complement = new StringBuilder();
        for(int num : Bnum) {
            complement.append(num);
        }

        System.out.println(complement.toString());
    }
}