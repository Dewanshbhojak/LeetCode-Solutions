class Solution {

    public static void dfs(
        int[] arr,
        int target,
        List<List<Integer>> res,
        List<Integer> current,
        int start
    ) {

        if (target == 0) {
            res.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < arr.length; i++) {

            // Skip duplicate values at the same recursion level
            if (i > start && arr[i] == arr[i - 1]) {
                continue;
            }

            // Since sorted
            if (arr[i] > target) {
                break;
            }

            current.add(arr[i]);

            dfs(
                arr,
                target - arr[i],
                res,
                current,
                i + 1
            );

            current.remove(current.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(
        int[] candidates,
        int target
    ) {

        Arrays.sort(candidates);

        List<List<Integer>> res = new ArrayList<>();

        dfs(
            candidates,
            target,
            res,
            new ArrayList<>(),
            0
        );

        return res;
    }
}