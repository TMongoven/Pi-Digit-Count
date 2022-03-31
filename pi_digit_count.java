import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class ReadFile{
	public static void main(String[] args) {
		int digit_count[] = new int[10];
		File pi_file = new File("./pi.txt");
		try{
			Scanner my_scan	= new Scanner(pi_file); // These lines sets up the scanner and skips the first line, 
			my_scan.nextLine();  					//as it just has "3."" (no meaningful decimal places)
			while(my_scan.hasNextLine()){
				String data = my_scan.nextLine();
				for(int i = 0; i < data.length(); i++){
					int digit = data.charAt(i);
					digit = digit - 48; // fix the digit to be accurate,
					if(digit >= 0 && digit < 10){
						digit_count[digit]++;
					}
				}
			}
			System.out.println("Checking across the first 1 million digits of pi:");
			System.out.println(String.format("Number of 0s found: %d", digit_count[0]));
			System.out.println(String.format("Number of 1s found: %d", digit_count[1]));
			System.out.println(String.format("Number of 2s found: %d", digit_count[2]));
			System.out.println(String.format("Number of 3s found: %d", digit_count[3]));
			System.out.println(String.format("Number of 4s found: %d", digit_count[4]));
			System.out.println(String.format("Number of 5s found: %d", digit_count[5]));
			System.out.println(String.format("Number of 6s found: %d", digit_count[6]));
			System.out.println(String.format("Number of 7s found: %d", digit_count[7]));
			System.out.println(String.format("Number of 8s found: %d", digit_count[8]));
			System.out.println(String.format("Number of 9s found: %d", digit_count[9]));

			my_scan.close();
		} catch(FileNotFoundException e){

		}
	}
}