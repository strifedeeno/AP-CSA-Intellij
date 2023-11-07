import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] one ={8};
        int[] two ={14, 7};
        int[] thre ={7, 1, 3, 2, 0, 4};
        int[] four={10, 8, 9, 5, 5};
        int[] give={12, 11, 10, 10, 8, 7};
        arrayMystery4(one);
        arrayMystery4(two);
        arrayMystery4(thre);
        arrayMystery4(four);
        arrayMystery4(give);
    }

    public static void arrayMystery4(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                nums[i + 1]++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}