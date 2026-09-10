
class Solution {
    public void wiggleSort(int[] nums) {

        Arrays.sort(nums);

        int len = nums.length / 2;

        int[] arr1 = new int[nums.length - len];

        int[] arr2 = new int[len];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = nums[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = nums[i + arr1.length];
        }

        int index = 1;

        for (int i = arr2.length - 1; i >= 0; i--) {
            nums[index] = arr2[i];
            index += 2;
        }

        index = 0;

        for (int i = arr1.length - 1; i >= 0; i--) {
            nums[index] = arr1[i];
            index += 2;
        }
    }
}
