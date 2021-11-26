package question;

public class Question {
    public int removeDuplicates(int[] nums) {
        int fastpoint = 0;
        int slowpoint = 0;
        int val = 0;
        for (int i = 0; i < nums.length; i++) {
            val = nums[i];
            slowpoint = i;
            for (fastpoint = i+1; fastpoint < nums.length; fastpoint++) {
                if (val != nums[fastpoint]) {
                    nums[slowpoint+1] = nums[fastpoint];
                    slowpoint ++;
                }
            }
        }
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] != nums[i+1]) {
                i++;
            } else {
                break;
            }
        }
        return i+1;
    }
}
