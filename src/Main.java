
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// 	コレクション
		
		ArrayList<String> names = new ArrayList<String>();   
		
		names.add("三田");
		names.add("田中");
		names.add("佐々木");
		
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		
		//リストを使うときは宣言 　変数名
		//ArrayListのインスタンス化
		
		//addで中身を追加したらgetで取得できる
		
		System.out.println(names.size() + "個");
		
		//要素の大きさ
		
		names.set(1, "中田"); 
		System.out.println(names.get(1));
		
		//二つの引数　要素　上書きする内容
		
		names.remove(0);     //削除はremoveが使われる
		System.out.println(names.size() + "個");
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		
		//removeで要素番号を削除すると、番号がずれる性質がある
		
		for(String name: names) {       //for文拡張for文も使える
			System.out.println(name);
		}
	}

}
