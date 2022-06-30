package Easy;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
       int i = 0;
        for ( i=0;i<nums.length;i++){
            if (nums[i]==target)
                return i;
            else if (nums[i]>target)
                return i;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,3,4,6};
        int target =7;
    SearchInsertPosition searchInsertPosition=new SearchInsertPosition();
   int result= searchInsertPosition.searchInsert(nums,target);
        System.out.println(result);
    }
}
