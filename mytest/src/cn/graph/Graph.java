package cn.graph;

public class Graph {
	private Vertext[] vertext;

	private int currentSize;

	public int[][] adjmat;

	/**
	 * Description :��ʼ��ͼ���������Ӿ���ĶԽ�������Ϊ�������� 1   
	 * @author     :WDH
	 * @date       :2019��2��24�� ����4:06:56
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
	 * Description :��ͼ�в���һ����
	 * @author :WDH
	 * @date :2019��2��24�� ����4:06:08
	 * @param v
	 */
	public void addVertext(Vertext v) {
		vertext[currentSize++] = v;
	}
	
	
	/**
	 * Description :����һ����
	 * @author :WDH
	 * @date :2019��2��24�� ����4:06:08
	 */
	public void addEdge(String v1,String v2) {
		int index1=0;
		int index2=0;
		//�ҳ�����������±�
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
	    //����˫��Ĺ�ϵ
		adjmat[index1][index2]=1;
		adjmat[index2][index1]=1;
	}
}
