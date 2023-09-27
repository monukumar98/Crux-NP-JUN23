package Lec38;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Dijkstra_Algo {
	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Dijkstra_Algo(int v) {
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

	public void DijkstraAlgo() {
		PriorityQueue<DijkstraPair> pq = new PriorityQueue<>(new Comparator<DijkstraPair>() {

			@Override
			public int compare(DijkstraPair o1, DijkstraPair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		HashSet<Integer> visited = new HashSet<>();
		pq.add(new DijkstraPair(1, "" + 1, 0));
		while (!pq.isEmpty()) {
			// 1. remove
			DijkstraPair rp = pq.poll();
			// 2. Ignore if Already visited
			if (visited.contains(rp.vtx)) {
				continue;
			}
			// 3. visited
			visited.add(rp.vtx);
			// 4. Self Work
			System.out.println(rp);
			// 5. Add nbrs
			for (int nbrs : map.get(rp.vtx).keySet()) {
				if (!visited.contains(nbrs)) {
					int cost = map.get(rp.vtx).get(nbrs);
					pq.add(new DijkstraPair(nbrs, rp.acq + nbrs, rp.cost + cost));
				}

			}

		}

	}

	class DijkstraPair {
		int vtx;
		String acq;
		int cost;

		public DijkstraPair(int vtx, String acq, int cost) {
			// TODO Auto-generated constructor stub
			this.vtx = vtx;
			this.acq = acq;
			this.cost = cost;
		}

		public String toString() {
			return this.vtx + " " + this.acq + " @ " + this.cost;
		}
	}

	public static void main(String[] args) {
		Dijkstra_Algo pq = new Dijkstra_Algo(7);
		pq.AddEdge(1, 2, 3);
		pq.AddEdge(1, 4, 2);
		pq.AddEdge(4, 3, 1);
		pq.AddEdge(3, 2, 4);
		pq.AddEdge(4, 5, 5);
		pq.AddEdge(5, 6, 3);
		pq.AddEdge(5, 7, 2);
		pq.AddEdge(6, 7, 7);
		pq.DijkstraAlgo();
	}
}
