import java.util.Random;

public class ReverseInteger {
    static Random randNums = new Random();

    public static int sortDesc(final int num) {
        //Your code
        int aux = num;
        int reverse = 0;
        int remainder = 0;
        while (aux>0) {
            remainder = aux % 10;
            reverse = (reverse *10) + remainder;
            aux = aux / 10;
        }

        return reverse;

    }

    public static void main(String[] args) {
        //running tests
        int[] test = tests();
        System.out.println("Original\n");
        for (int i = 0; i < test.length; i++) {           
            System.out.println(test[i]);
        }

        System.out.println("Reversed\n");

        for (int i = 0; i < test.length; i++) {
            System.out.println(sortDesc(test[i]));
        }
    }

    public static int[] tests(){
        randNums.setSeed(100000);
        int[] nums = new int[9];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = randNums.nextInt(100000);
        }

        return nums;
    }
}
