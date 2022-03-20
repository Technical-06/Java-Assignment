abstract class abstractClass{
	public abstract void message();

	public void messages(){
		System.out.println("non abstract method");
	}
}

interface Interface{
	public void greetings(String name);
}


class Main extends abstractClass implements Interface{

	@Override
	public void greetings(String name) {
		System.out.println("heya "+name);
	}
    public void message(){

        System.out.println("Hello! Folks");
    }
}
public class question1{
    public static void main(String[] args){
        Main s= new Main();
        s.greetings("sonalbedi");
        s.message();
    }

}