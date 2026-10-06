class Solution {
    public boolean dfs(List<List<Integer>> list,int start,int end,Boolean[][] visited)
    {
        if(start==end) {
            return true;
        }
        if(visited[start][end]!=null) return visited[start][end];
        for(int i : list.get(start)){
           if(dfs(list,i,end,visited)) return visited[start][end]= true;
        } 
        return visited[start][end] = false;
    }

    public List<Boolean> checkIfPrerequisite(
            int numCourses,
            int[][] prerequisites,
            int[][] queries) {

        List<Boolean> res = new ArrayList<>();

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < prerequisites.length; i++) {
            list.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        Boolean[][] visited = new Boolean[numCourses][numCourses];
       for(int i = 0;i<queries.length;i++){
            res.add(dfs(list,queries[i][0],queries[i][1],visited));
       }

        return res;
    }
}