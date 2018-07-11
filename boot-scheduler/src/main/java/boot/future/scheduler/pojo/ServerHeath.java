package boot.future.scheduler.pojo;

public class ServerHeath {
	
	private String health;
	private String serverName;
	private String message;
	
	
	
	public ServerHeath(String health, String serverName, String message) {
		super();
		this.health = health;
		this.serverName = serverName;
		this.message = message;
	}
	public String getHealth() {
		return health;
	}
	public void setHealth(String health) {
		this.health = health;
	}
	public String getServerName() {
		return serverName;
	}
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}	
	
	

}
