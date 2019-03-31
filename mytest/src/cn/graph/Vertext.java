package cn.graph;

/**      
 * Description :顶点类   
 * @author     :WDH
 * @date       :2019年2月24日 下午3:58:57    
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
