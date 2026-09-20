class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if ((nums1.length + nums2.length) % 2 == 0) {
            int index = (nums1.length + nums2.length) / 2;
            int curr = 0;
            int prev = 0;
            int i = 0;
            int j = 0;
            while (index >= 0) {
                prev = curr;
                if (i == nums1.length)
                    curr = nums2[j++];
                else if (j == nums2.length)
                    curr = nums1[i++];
                else if (nums1[i] > nums2[j])

                    curr = nums2[j++];
                else
                    curr = nums1[i++];

                index--;
            }

            return (curr + prev) / 2.0;
        } else {
            int index = (nums1.length + nums2.length) / 2;
            int i = 0;
            int j = 0;
            while (index > 0) {
                if (i == nums1.length)
                    j++;
                else if (j == nums2.length)
                    i++;
                else if (nums1[i] > nums2[j])
                    j++;
                else
                    i++;

                index--;
            }
            if(i==nums1.length) return nums2[j];
            if(j==nums2.length) return nums1[i];
            return nums1[i] < nums2[j] ? nums1[i] : nums2[j];
        }

    }
}