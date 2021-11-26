package question;

public class Question35 {
    public int searchInsert(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;
        int k = 0;
        while (first <= last) {
            int mid = first + (last - first)/2;
               /* System.out.println("中位数下标是: " + mid + ", 头部是：" + first + "，尾部是：" + last);
                System.out.println("target是：" + target + ", 中位数值是：" + nums[mid]);*/
            k = mid;
            if (first == last && nums[mid] != target) {
                //System.out.println("target不存在！");
                if (nums[mid] > target) {
                    //System.out.printf("%d,%d，%d",target, nums[mid], mid);
                    return mid;
                } else {
                    //System.out.printf("%d,%d，%d",target, nums[mid], mid);
                    return mid + 1;
                }
            } else if (nums[mid] > target && first != last) {
                last = mid - 1;
            } else if (nums[mid] < target) {
                first = mid + 1;
            } else {
                //System.out.println("找到了！");
                return mid;
            }
        }
        return k;
    }
}
