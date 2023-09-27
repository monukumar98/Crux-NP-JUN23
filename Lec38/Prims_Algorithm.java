package Lec38;

import java.util.*;

public class Prims_Algorithm {
	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Prims_Algorithm(int v) {
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

	public void PrimsAlgo() {
PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<PrimsPair>(){

			@Override
			public int compare(PrimsPair o1, PrimsPair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		HashSet<Integer> visited = new HashSet<>();
		pq.add(new PrimsPair(1, 1, 0));
		while (!pq.isEmpty()) {
			// 1. remove
			PrimsPair rp = pq.poll();
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
					pq.add(new PrimsPair(nbrs, rp.vtx, cost));
				}

			}

		}

	}

	class PrimsPair {
		int vtx;
		int acq;
		int cost;

		public PrimsPair(int vtx, int acq, int cost) {
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
		Prims_Algorithm pq = new Prims_Algorithm(7);
		pq.AddEdge(1, 2, 3);
		pq.AddEdge(1, 4, 2);
		pq.AddEdge(4, 3, 1);
		pq.AddEdge(3, 2, 4);
		pq.AddEdge(4, 5, 5);
		pq.AddEdge(5, 6, 3);
		pq.AddEdge(5, 7, 2);
		pq.AddEdge(6, 7, 7);
		pq.PrimsAlgo();
	}
}
