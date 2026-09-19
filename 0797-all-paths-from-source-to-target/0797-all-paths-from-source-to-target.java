class Solution {
    public void dfs(int[][] graph, int n, List<Integer> list1, List<List<Integer>> list) {
        if (n == graph.length - 1) {
            list.add(new ArrayList<>(list1));
            return;
        }
        for (int i : graph[n]) {
            list1.add(i);
            dfs(graph, i, list1, list);
            list1.remove(list1.size() - 1);
        }

    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> list1 = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        list1.add(0);
        dfs(graph, 0, list1, list);
        return list;
    }
}