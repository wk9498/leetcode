package question;

public class Question69 {
    public int mySqrt(int x) {
        int ans = 0;
        long left = 1;
        long right = x;
        long mid = 0;
        while (left <= right) {
            mid = left + (right - left)/2;
            if (mid * mid < x && (mid+1)*(mid+1) <= x) {
                left = mid + 1;
            } else if (mid * mid > x) {
                right = mid - 1;
            } else {
                ans = (int)mid;
                return ans;
            }
        }
        ans = (int)mid;
        return ans;
    }
}
