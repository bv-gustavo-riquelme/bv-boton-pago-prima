package cl.bicevida.object;

import java.io.Serializable;

public class DataBanco implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String value;
    private String name;
    private String type;
	
	public DataBanco() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
