class Solution {
    public boolean validPath(int n, int[][] edges, int src, int dest) {
        ArrayList<Integer> graph[] = new ArrayList[n];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int edge[] : edges) {
            int v0 = edge[0];
            int v1 = edge[1];
            graph[v0].add(v1);
            graph[v1].add(v0);

        }
        boolean visited[] = new boolean[n];
        return hasPath(graph, src, dest, visited);

    }

    public static boolean hasPath(ArrayList<Integer> graph[], int src, int dest, boolean visited[]) {
        if (src == dest) {
            return true;
        }
        visited[src] = true;

        for (int i : graph[src]) {
            if (!visited[i]) {
                if (hasPath(graph, i, dest, visited)) {

                    return true;
                }
            }
        }
        return false;
    }
}