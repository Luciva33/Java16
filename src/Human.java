
public class Human {
	
	String name ;
	
	public Human(String name) {
		this.name = name;                //コンストラクタ 
		                                 //thisは自分自身
		
	}
	
	public void intro() {
		System.out.println("私は" + this.name + "です");
	}
	
}
