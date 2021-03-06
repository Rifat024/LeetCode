package Easy;

public class RemoveDuplicateElement {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
                System.out.println(nums[i]);
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        RemoveDuplicateElement removeDuplicateElement = new RemoveDuplicateElement();
        int arr1 = removeDuplicateElement.removeDuplicates(arr);
        System.out.println("no of remove is="+arr1);
    }
}

