import java.util.Collections;
import java.util.ArrayList;

public class game{
	public static void game(String[] String_Array,int input) {

		ArrayList numbers = new ArrayList();
		int k = 0;

		for(int i = 0; i < input; i++){
			numbers.add(i);
		}

		Collections.shuffle(numbers);

		for(int i = 0;i < input;i++){
			try{
				k = (Integer) numbers.get(i);
				System.out.println(String_Array[k]);
			}catch(Exception e){
				System.out.println("This is a problem" + e);
			}
		}
	}
} 
