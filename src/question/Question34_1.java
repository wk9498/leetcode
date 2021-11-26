package question;

import java.util.ArrayList;

public class Question34_1 {
    public int[] searchRange(int[] nums, int target) {
        int i = 0;
        int length = nums.length;
        int[] ans = {-1, -1};
        //System.out.println(nums[i]);
        while (i < length && nums[i] < target) {
            //System.out.println("index: "+i+", value: "+nums[i]);
            //System.out.println(i.getClass());
            i += 1;
        }
        //System.out.println("index: "+i+", value: "+nums[i]);
        if (i < length && nums[i] == target) {
            ans[0] = i;
            while (nums[ans[0]] == nums[i]) {
                i += 1;
            }
            ans[1] = i-1;
            return ans;
        }
        return ans;
    }

}
