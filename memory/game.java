import java.util.Collections;
import java.util.ArrayList;

public class game{
	public void game(String[] String_Array,int input) {

		private ArrayList numbers = new ArrayList();
		private int k = 0;

		for(int i = 0; i < 10; i++){
			numbers.add(i+1);
		}

		Collections.shuffle(numbers);

		for(int i = 0;i < 10;i++){
			try{
				k = (Integer) numbers.get(i);
				System.out.println(String_Array[k]);
			}catch(Exception e){
				System.out.println("This is a problem" + e);
			}
		}
	}
} 
