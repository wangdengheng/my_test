package cn.graph;

/**      
 * Description :������   
 * @author     :WDH
 * @date       :2019��2��24�� ����3:58:57    
 */
public class Vertext {
  
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}

	public Vertext(String value) {
		super();
		this.value = value;
	}
}
