// 大牛
// 思想就是：逆双指针排序
// 并且写得更符合惯性思维：先考虑指针没有行走完 nums1 和 nums2 的情况
// 再考虑特殊情况：靠近结尾时，要是 nums1 或 nums2 有一个走完了怎么办

// 老师的 while 条件 和 if 条件 也写得很精辟：
// 没有用新的 index i 和 j，直接用了 m 和 n
// m + n ，要是 = 0 就是整个被排序完了
// m && n 意味着两个都都不等于 0，都没有走完
// 直接使用 m 和 n 违反了 计算机 index 从 1 开始的常识，
// 所以在后面写 m-- -1，需要多 减一个 1

void merge(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n) {
    while (m + n){
        if (m && n)
            nums1[m+n] = nums1[m-1] > nums2[n-1] ? nums1[m---1] : nums2[n---1];
        else if (!m)
            nums1[m+n] = nums2[n---1];
        else 
            return;
    }
}