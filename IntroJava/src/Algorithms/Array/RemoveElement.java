package Algorithms.Array;

public class RemoveElement {

    public static void main(String[] args) {
        int[] item = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(item, 2));
    }

    public static int removeElement(int[] nums, int val) {
        int start = -1;
        for(int i = 0; i < nums.length; ++i) {
            if(nums[i] != val) {
                nums[++start] = nums[i];
            }
        }
        return start + 1;
    }
}
