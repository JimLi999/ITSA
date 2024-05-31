import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //process inputs.
        while (sc.hasNextInt()) {
            //variables
            int dataCount = sc.nextInt();
            int[] rawData = new int[dataCount];
            int sum = 0;

            //process inputs into variables.
            for (int i = 0; i < dataCount; i++) {
                rawData[i] = sc.nextInt();
                sum += rawData[i];
            }

            int median = sum / 2;  //get the median(Integer).

            //create a bag that can contain half of the total value of the loots.
            // e.g. We have total value 50, the bag only can hold 25.
            int[] bag = new int[median + 1];


            //pass the processed data to methods.
            System.out.println(findResult(dataCount, rawData, sum, median, bag));
        }
    }

    private static int findResult(int dataCount, int[] rawData, int sum, int median, int[] bag) {
        /*
         *   We list out all possible result of what's in the bag.
         *   e.g. Loot(1, 2, 3) can have these following permutation:
         *   0, 1, 2, 1+2, 3, 1+3, 2+3, 1+2+3. 8 results total.
         *
         *   We only need the permutations that closest to the median(We have two bags), so the results will be:
         *   first, get the median: (1+2+3)/2 = 3
         *   then, these results are satisfied the condition we want:
         *   0, 1, 2, 1+2, 3.
         *
         *   And we don't care which loot should be in the bag. We only care the sum of the bag is close to the median.
         *   So the results we just came out can be written as following:
         *   0, 1, 2, 3, 3.
         *
         *   And we don't care the alt result to achieve the same value, so we can look the permutation as these:
         *   value:  |0|1|2|3     | (X) 3(alt)|
         *   result: |0|1|2|3(1+2)| (X) 3     |
         *
         *   Run.
         *   loot{
         *      index: |0|1|2|
         *      value: |1|2|3|
         *   }
         *
         *   value(bag){
         *      value(index): |0|1|2|3|
         *      result(data): |0|0|0|0|
         *   }
         *
         *
         *   3 - loot[0]
         *   new value[3] = value[2] + loot[0] = 1
         *   old value[3] > new value[3]? T, then value[3] = new value[3]
         *   value:  |0|1|2|3|
         *   result: |0|0|0|1|
         *
         *   2 - loot[0]
         *   new value[2] = value[1] + loot[0] = 1
         *   old value[2] > new value[2]? T, then value[2] = new value[2]
         *   value:  |0|1|2|3|
         *   result: |0|0|1|1|
         *
         *   1 - loot[0]
         *   new value[1] = value[0] + loot[0] = 1
         *   old value[1] > new value[1]? T, then value[1] = new value[1]
         *   value:  |0|1|2|3|
         *   result: |0|1|1|1|
         *
         *   3 - loot[1]
         *   new value[3] = value[1] + loot[1] = 3
         *   old value[3] > new value[3]? T, then value[3] = new value[3]
         *   value:  |0|1|2|3|
         *   result: |0|1|1|3|
         *
         *   2 - loot[1]
         *   new value[2] = value[0] + loot[1] = 2
         *   old value[2] > new value[2]? T, then value[2] = new value[2]
         *   value:  |0|1|2|3|
         *   result: |0|1|2|3|
         *
         *   3 - loot[2]
         *   new value[3] = value[0] + loot[2] = 3
         *   old value[3] > new value[3]? F, then value[3] = value[3]
         *   value:  |0|1|2|3|
         *   result: |0|1|2|3|
         *
         *   The difference between two bags is written as following:
         *   bagA: bagA which we just found the closest result to median.
         *   bagB: sum - bagA
         *   difference: abs of bagA - bagB
         *
         *   Can be written as:
         *   difference: abs of bagA - (sum - bagA)
         *
         *   Can simplify it to:
         *   difference: abs of 2bagA - sum  or  abs of sum - 2bagA
         */


        for (int i = 0; i < dataCount; i++)
            for (int j = median; j >= rawData[i]; j--) {
                int diff = j - rawData[i];
                int newBagValue = bag[diff] + rawData[i];
                bag[j] = Math.max(newBagValue, bag[j]);
            }
        return Math.abs(sum - 2 * bag[median]);
    }
}



