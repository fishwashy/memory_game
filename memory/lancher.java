import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class lancher{
	public static void main(String[] args){
		BufferedReader reader_int = new BufferedReader(new InputStreamReader(System.in));
		Scanner reader_String = new Scanner(System.in);
		boolean round = true;
		int input_int = 0;
		
		while(round){
			boolean loop = true;
			while(loop){		
				System.out.println("Valasz jatek modot\n(1)Konnyu mod\n(2)Mediu mod\n(3)Nehez mod\n(4)jateks sajat szovegel");
				try{
					input_int = Integer.parseInt(reader_int.readLine());
					if(input_int > 0 && input_int < 5){
						loop = false;
					}else{
						System.out.println("Wrong input");
					}
				}catch(IOException e){
				System.out.println("Wrong input");
				}catch (NumberFormatException e) {
					System.out.println("Wrong input");
				}
			}
			if(input_int == 1 || input_int == 2 || input_int == 3){
				Game_mode.mode_1(input_int);
			}else{
				Game_mode.mode_2();
			}
			loop = true;
			while(loop){
				System.out.println("Akkarsz meg jadszani (y) igen (n)nem");
				String in = new String("");
				in = reader_String.nextLine();
				
				if(in.equals("y")){
					loop = false;
				}else if(in.equals("n")){
					loop = false;
					round = false;
				}
			}
		}
	}
}
