import question.*;

public class LeetCode {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        Question question = new Question();
        System.out.println(question.removeDuplicates(nums));
    }
}
