package Lec37;

import java.util.*;

public class Graph_Valid_Tree {

	class Solution {
		public boolean validTree(int n, int[][] edges) {
			HashMap<Integer, List<Integer>> map = new HashMap<>();
			for (int i = 0; i < n; i++) {
				map.put(i, new ArrayList<>());
			}
			for (int i = 0; i < edges.length; i++) {
				int a = edges[i][0];
				int b = edges[i][1];
				map.get(a).add(b);
				map.get(b).add(a);
			}
			return BFT(map);
		}

		public boolean BFT(HashMap<Integer, List<Integer>> map) {
			Queue<Integer> q = new LinkedList<>();
			HashSet<Integer> visited = new HashSet<>();
			int count = 0;
			for (int src : map.keySet()) {
				if (visited.contains(src)) {
					continue;
				}
				count++;
				q.add(src);
				while (!q.isEmpty()) {
					// 1. remove
					int rv = q.poll();
					// 2. Ignore if Already visited
					if (visited.contains(rv)) {
						return false;
					}
					// 3. marked Visited
					visited.add(rv);
					// 4. Self Work
					System.out.print(rv + " ");
					// 5. Add nbrs
					for (int nbrs : map.get(rv)) {
						if (!visited.contains(nbrs)) {
							q.add(nbrs);
						}
					}
				}
			}
			return count == 1;
		}
	}
}
