import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class lancher{
	public static void main(String[] args){
		Game_mode Game_mode = new Game_mode();
		BufferedReader reader_int = new BufferedReader(new InputStreamReader(System.in));
		Scanner reader_String = new Scanner(System.in);

		boolean round = true;
		int input_int = 0;
		String input_recheck;
		
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

			switch(input_int){
				case 1:
					Game_mode.mode_1("Word_list_1");
				break;
				case 2:
					Game_mode.mode_1("Word_list_2");
				break;
				case 3:
					Game_mode.mode_1("Word_list_3");
				break;
				case 4:
					Game_mode.mode_2();
				break;
			}

			loop = true;

			while(loop){
				System.out.println("Akkarsz meg jadszani (y) igen (n)nem");
				input_recheck = reader_String.nextLine();
				
				if(input_recheck.equals("y")){
					loop = false;
				}else if(input_recheck.equals("n")){
					loop = false;
					round = false;
				}
			}
		}
	}
}
