import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int maxlen = 0;

        HashSet<Integer> set = new HashSet<>();
        for (int j = 0; j < n; j++) {
            set.add(nums[j]);
        }

        for (int i = 0; i < n; i++) {
            int len = 0;
            int x = nums[i];
            if (set.contains(x - 1))
                continue;

            while (set.contains(x + 1)) {
                x = x + 1;
                len++;
            }

            if (len > maxlen)
                maxlen = len;
        }
        return maxlen;
    }
}