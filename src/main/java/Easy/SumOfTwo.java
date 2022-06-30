package Easy;

public class SumOfTwo {
    public static class Solution {
        public void Solution(int[] num, int target) {
            int[] result=new int[2];
            int size= num.length;
            for (int i = 0; i < size - 1; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (num[i] + num[j] == target) {
                        result[0]=i;
                        result[1]=j;

                    }

                }
            }
            for (int i=0;i<result.length;i++)
            System.out.println(result);
        }
    }


    public static void main(String[] args) {

        // List<Integer> num=new ArrayList<>();
        int[] array=new int[]{3, 2, 4};
        int target=6;

        // num.add(2);num.add(4);//num.add(15);
        // System.out.println(num);
        Solution solution=new Solution();
        solution.Solution(array,target);


    }

}
