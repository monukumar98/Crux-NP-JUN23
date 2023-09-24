package Lec36;

import java.util.*;

public class Graph_2 {
	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Graph_2(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public boolean BFS(int src, int des) {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		q.add(src);
		while (!q.isEmpty()) {
			// 1. remove
			int rv = q.poll();
			// 2. Ignore if Already visited
			if (visited.contains(rv)) {
				continue;
			}
			// 3. marked Visited
			visited.add(rv);
			// 4. Self Work
			if (rv == des) {
				return true;
			}
			// 5. Add nbrs
			for (int nbrs : map.get(rv).keySet()) {
				if (!visited.contains(nbrs)) {
					q.add(nbrs);
				}
			}
		}
		return false;

	}

	public boolean DFS(int src, int des) {
		Stack<Integer> s = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		s.push(src);
		while (!s.isEmpty()) {
			// 1. remove
			int rv = s.pop();
			// 2. Ignore if Already visited
			if (visited.contains(rv)) {
				continue;
			}
			// 3. marked Visited
			visited.add(rv);
			// 4. Self Work
			if (rv == des) {
				return true;
			}
			// 5. Add nbrs
			for (int nbrs : map.get(rv).keySet()) {
				if (!visited.contains(nbrs)) {
					s.push(nbrs);
				}
			}
		}
		return false;

	}

	public void BFT() {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			q.add(src);
			while (!q.isEmpty()) {
				// 1. remove
				int rv = q.poll();
				// 2. Ignore if Already visited
				if (visited.contains(rv)) {
					continue;
				}
				// 3. marked Visited
				visited.add(rv);
				// 4. Self Work
				System.out.print(rv + " ");
				// 5. Add nbrs
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}
		}
		System.out.println();
	}
}
