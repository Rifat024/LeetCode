package Easy;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
            int i = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] != val) {
                    nums[i] = nums[j];
                    i++;
                }
            }
            return i;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{3,2,2,3};
        int val=3;
        RemoveElement removeElement=new RemoveElement();
       int result= removeElement.removeElement(arr,val);
        System.out.println("Result= "+result);
    }
}
