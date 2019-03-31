package cn.graph;

public class Graph {
	private Vertext[] vertext;

	private int currentSize;

	public int[][] adjmat;

	/**
	 * Description :初始化图，并将连接矩阵的对角线设置为可以连接 1   
	 * @author     :WDH
	 * @date       :2019年2月24日 下午4:06:56
	 * @param size   
	 */
	public Graph(int size) {
		vertext = new Vertext[size];
		adjmat = new int[size][size];
		for (int i = 0; i < vertext.length; i++) {
			adjmat[i][i] = 1;
		}
	}

	/**
	 * Description :向图中插入一顶点
	 * @author :WDH
	 * @date :2019年2月24日 下午4:06:08
	 * @param v
	 */
	public void addVertext(Vertext v) {
		vertext[currentSize++] = v;
	}
	
	
	/**
	 * Description :增加一条边
	 * @author :WDH
	 * @date :2019年2月24日 下午4:06:08
	 */
	public void addEdge(String v1,String v2) {
		int index1=0;
		int index2=0;
		//找出两个顶点的下标
		for (int i = 0; i < vertext.length; i++) {
			if(vertext[i].getValue().equals(v1)) {
				index1=i;
				break;
			}
		}
		for (int i = 0; i < vertext.length; i++) {
			if(vertext[i].getValue().equals(v2)) {
				index2=i;
				break;
			}
		}
	    //创建双向的关系
		adjmat[index1][index2]=1;
		adjmat[index2][index1]=1;
	}
}
