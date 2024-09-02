public class Main {
    public static void main(String[] args) {
        /*
         * synax of if statement
         * if(boolean expression T or F) {
         * // body
         * } else {
         * // do this
         * }
         */

        // int salary = 2400;
        // if (salary > 10000) {
        //     salary = salary + 2000;
        // } else {
        //     salary = salary + 1000;
        // }
        // System.out.println(salary);


        //multiple if else
        int salary = 34324; 
        if(salary > 10000) {
            salary += 2000;
        }
        else if (salary > 20000) {
            salary += 3000;
        }
        else {
            salary += 1000;
        }
    }
}