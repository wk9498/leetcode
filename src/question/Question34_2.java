package question;

public class Question34_2 {
    public int[] searchRange(int[] nums, int target) {
        int i = 0;
        int[] ans = {-1, -1};
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        int loc = -1;

        while (left <= right) {
            System.out.println("target: "+target);
            System.out.println("left: "+left+", right: "+right);
            mid = left + (right - left)/2;
            System.out.println("mid: "+mid);
            if (nums[mid] == target) {
                loc = mid;
                break;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }
        }
        System.out.println("target: "+target);
        System.out.println("left: "+left+", right: "+right);
        System.out.println("loc: "+loc);
        if (loc != -1) {
            System.out.println();
            int m1 = loc;
            int m2 = loc;
            while (m1 >= 0 && m1 <= nums.length -1 && target == nums[m1]) {
                m1 -= 1;
            }
            m1 += 1;
            while (m2 >= 0 && m2 <= nums.length -1 && target == nums[m2]) {
                m2 += 1;
            }
            m2 -= 1;
            ans[0] = m1;
            ans[1] = m2;

            System.out.println("ans: ["+ans[0]+", "+ans[1]+"]");
            return ans;
        }
        System.out.println("ans: ["+ans[0]+", "+ans[1]+"]");
        return ans;
    }
}
