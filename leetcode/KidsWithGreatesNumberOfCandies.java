package leetcode;
import java.util.List;
import java.util.ArrayList;
/*Given the array candies and the integer extraCandies, 
where candies[i] represents the number of candies that the ith kid has.

For each kid check if there is a way to distribute extraCandies among 
the kids such that he or she can have the greatest number of candies among them. 
Notice that multiple kids can have the greatest number of candies. */

public class KidsWithGreatesNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = maxnum(candies);
        List<Boolean> values = new ArrayList<>();
        for (int i = 0; i< candies.length;i++){
            values.add((candies[i] + extraCandies>=max) ? true : false);
        }
        return values;
    }
    public int maxnum(int[] values){
        int max = values[0];
        for (int i = 0; i < values.length; i++) {
            if(values[i]>max){
                max=values[i];
            }
        }
        return max;
    }
}
