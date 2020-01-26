public class Tache{
	private String message;
	private int priorite;

	public Tache(String message, int priorite){
		this.message = message;
		this.priorite = priorite;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public void setPriorite(int priorite){
		this.priorite = priorite;
	}

	public String getMessage(){
		return this.message;
	}

	public int getPriorite(){
		return this.priorite;
	}
}