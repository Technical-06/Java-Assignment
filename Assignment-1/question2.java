class Encapsulate{
	private String name="Sonal";

	public void setName(String name){
		this.name = name;
		System.out.println("Name changed successfully.");
	}

	public void getName(){
		System.out.println("Current Name: " + this.name);
	}

}

class question2{
	public static void main(String args[]){
		Encapsulate e = new Encapsulate();
		e.getName();
		e.setName("Sonal Bedi");
		e.getName();
	}
}