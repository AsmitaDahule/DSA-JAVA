public class RichestWealth {
    public static void main(String[] args) {
        int[][] accounts = {
            {1,5},
            {7,3},
            {3,5},
            {98}
        };
        System.out.println(maxinmumWealth(accounts));
    }
    // now count maximum wealth of a person
    static int maxinmumWealth(int[][] accounts){
        int wealth = Integer.MIN_VALUE;
        // person=row
        // account=col

        // iterate each row one by one
        for(int person=0;person<accounts.length;person++){
            int rowsum=0; // rowsum for each new row start from 0 
            for(int account=0;account<accounts[person].length;account++){
                rowsum += accounts[person][account]; // sum of all account
            }

            // check whether weath is lesser then rowsum or not
            if(rowsum>wealth){
                // if condition true
                wealth=rowsum; 
            }
        }
        // simply return wealth that will be maximum wealth
        return wealth;
    }
}
