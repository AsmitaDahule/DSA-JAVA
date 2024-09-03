//Wipro interview question

//suppose given array is [8, 4, 5, 3, 2, 6, 9, 1] and we have to start from index [0] then
//we take two variable smaller_Sum and bigger_sum comapre all right side array element with that first element
//and sum all less element than first element and sum all greater element in another variable greater_sum and
//and then multiply smaller_sum and greater_Sum and put this value at first place do it same for all element
// expected output 189 120 90 45 15 9 0 0

public class ImplementMe {
    public static void main(String[] args) {
        // given array
        int[] arr= {8,4,5,3,2,6,9,1};

        //function call
        int[] result = implementMe(arr);

        // printing result array
        for(int i : result) {
            System.out.print(i + " ");
        }
    }

    // Impelement function which return result array
    static int[] implementMe(int[] arr) {
        // iterate the loop from 0 to array.length-1
        for(int i= 0; i< arr.length;i++){
            // initialize variable with 0
            int smaller_sum=0;
            int greater_sum=0;
            // start iterating from next index of i
            for(int j=i+1;j< arr.length;j++){
                // check whether the left element is bigger or not
                if(arr[j] < arr[i]){    // if true
                    // add it into smaller_sum variable
                    smaller_sum=smaller_sum+arr[j];
                } else { // false
                    // add it to greater_sum variable
                    greater_sum=greater_sum+arr[j];
                }

            }
            // simply multiplay both the sum
            int multi = smaller_sum * greater_sum;
            // add to the main array
            // position = arr[i]
            arr[i] = multi;
        }

        // return the modified array
        return arr;
    }
}
