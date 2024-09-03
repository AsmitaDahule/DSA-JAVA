// Wipro coding interview question
// we have given an decinal number ( ex. 6) and first we have return number of 1 it contains when number
// is in binary form

public class SetBits {
    public static void main(String[] args) {
        int number =12;
        int ans = numberofBit1(number);
        System.out.println(ans + " '1' present in " + number + " binary");
    }
    static int numberofBit1(int number) {
        int count1= 0;
        while (number > 0){
           int bits= number % 2;
           if(bits == 1){
               count1++;
           }
           number /= 2;
        }
        return count1;
    }

}
