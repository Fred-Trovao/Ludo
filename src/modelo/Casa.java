package modelo;

public class Casa {
	
	private String id;
	private String casa;
	private String param;
	
	public Casa(String id, String casa, String param) {
		this.id = id;
		this.casa = casa;
		this.param = param;
	}
	
	public String getId(){
		return id;
	}
	public String getCasa(){
		return casa;
	}
	public String getParam(){
		return param;
	}
		
}