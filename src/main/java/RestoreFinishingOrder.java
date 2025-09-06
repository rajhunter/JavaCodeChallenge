import java.util.*;

class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        // Put friends in a set for fast lookup
        Set<Integer> friendsSet = new HashSet<>();
        for (int f : friends) {
            friendsSet.add(f);
        }

        // Collect in finishing order
        List<Integer> result = new ArrayList<>();
        for (int id : order) {
            if (friendsSet.contains(id)) {
                result.add(id);
            }
        }

        // Convert list to int[]
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }
}

public class RestoreFinishingOrder {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] order1 = {3, 1, 2, 5, 4};
        int[] friends1 = {1, 3, 4};
        System.out.println(Arrays.toString(sol.recoverOrder(order1, friends1)));
        // Output: [3, 1, 4]

        int[] order2 = {1, 4, 5, 3, 2};
        int[] friends2 = {2, 5};
        System.out.println(Arrays.toString(sol.recoverOrder(order2, friends2)));
        // Output: [5, 2]
    }
}