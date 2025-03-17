
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        int maxSum = Integer.MIN_VALUE;
        int n = nums.size();
        for(int i = 0; i < n-1; i++ ){
            for(int j = i+1 ; j < n; j++){
                int sum = nums.get(i) + nums.get(j);
                if(sum > maxSum){
                    maxSum = sum;
                }
            }
        }
        return (maxSum == Integer.MIN_VALUE) ? -1 : maxSum;
    }
}