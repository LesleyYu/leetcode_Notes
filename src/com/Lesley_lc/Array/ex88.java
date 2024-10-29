import java.util.Arrays;

class ex88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1, j = n-1;  // index for nums1: i, nums2: j
        int tail = m+n-1;
        while (i >= 0 || j >= 0 ) {
            if (i < 0) {
                nums1[tail--] = nums2[j--];
            }
            else if(j < 0) break;
            else if(nums1[i] < nums2[j]) {
                // swap(nums1, tail, nums2, j);
                nums1[tail--] = nums2[j--];
            }
            else {
                // swap(nums1, tail, nums1, i);
                nums1[tail--] = nums1[i--];
            }
        }
        System.out.println(Arrays.toString(nums1));

    }

    private static void swap(int[] nums1, int i, int[] nums2, int j) {
      int temp = nums1[i];
      nums1[i] = nums2[j];
      nums2[j] = temp;
    }

    public static void main(String[] args) {
        // case 1:
         int[] nums1 = {1,2,3,0,0,0};
         int[] nums2 = {2, 5, 6};
        merge(nums1, 3, nums2, 3);

        // case 2:
        //  int[] nums1 = {0};
        //  int[] nums2 = {1};
        //  merge(nums1, 0, nums2, 1);
    }

}