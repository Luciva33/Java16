import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		// 100人分作るとき
		

	
		ArrayList<Human> humans = new ArrayList<Human>();
		for(int i =0; i < 100; i++) {
			Human h = new Human("村びと" + (i+1));
			humans.add(h);
		}
		
		Human human = humans.remove(3); //リストから消しつつほかのところに移動させる  カードを引く処理など
		human.intro();                   

		
	}

}
