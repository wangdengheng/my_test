package cn.graph;

import java.util.Arrays;

/**      
 * Description :测试图   
 * @author     :WDH
 * @date       :2019年2月24日 下午4:22:22    
 */
public class TestGraph {
	public static void main(String[] args) {
		Vertext v1 = new Vertext("A");
		Vertext v2 = new Vertext("B");
		Vertext v3 = new Vertext("C");
		Vertext v4 = new Vertext("D");
		Vertext v5 = new Vertext("E");

		Graph g = new Graph(5);
		g.addVertext(v1);
		g.addVertext(v2);
		g.addVertext(v3);
		g.addVertext(v4);
		g.addVertext(v5);

		// 增加边
		g.addEdge("A", "C");
		g.addEdge("A", "B");
		g.addEdge("B", "C");
		g.addEdge("B", "D");
		g.addEdge("B", "E");

		for (int[] a : g.adjmat) {
			System.out.println(Arrays.toString(a));
		}

	}
}
