package sliding_window;

import java.util.HashMap;
import java.util.Map;

public class leetcode904 {
    class Solution {
        public int totalFruit(int[] fruits) {
            int n = fruits.length;
            if (n <= 2) {
                return n;
            }

            int type1 = fruits[0];
            int count1 = 0;
            int type2 = -1;
            int count2 = 0;
            int maxLen = 0;
            int i = 0;
            for (int j = 0; j < n; j++) {

                if (fruits[j] == type1)
                    count1++;
                else if (fruits[j] == type2)
                    count2++;
                else {// move i
                    while (count1 != 0 && count2 != 0) {
                        if (fruits[i] == type1) {
                            count1--;
                            i++;
                        } else if (fruits[i] == type2) {
                            count2--;
                            i++;
                        }
                    }
                    if (count1 == 0) {
                        type1 = type2;
                        count1 = count2;
                    }
                    type2 = fruits[j];
                    count2 = 1;
                }
                maxLen = Math.max(count1 + count2, maxLen);

            }

            return maxLen;
        }
    }

//     class Solution {
//     public int totalFruit(int[] fruits) {
//         HashMap<Integer, Integer> map = new HashMap<>();

//         int i = 0;
//         int maxLen = 0;

//         for (int j = 0; j < fruits.length; j++) {
//             map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);

//             while (map.size() > 2) {
//                 map.put(fruits[i], map.get(fruits[i]) - 1);

//                 if (map.get(fruits[i]) == 0) {
//                     map.remove(fruits[i]);
//                 }

//                 i++;
//             }

//             maxLen = Math.max(maxLen, j - i + 1);
//         }

//         return maxLen;
//     }
// }

}
