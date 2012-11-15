import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Parse {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		FileInputStream fstream = new FileInputStream("cluster.txt");
		Scanner sc = new Scanner(fstream);
		String line;
		while (sc.hasNextLine()){
			line = sc.nextLine();
			String[] lineSplit = line.split("}");
			if (lineSplit.length >10){
				System.out.print("{ \n \"name\": \"x\",\n \"children\": [");
				
				for (int j=0; j < lineSplit.length; j++){
					if (j == lineSplit.length-1){
						System.out.println("   " + lineSplit[j] + "}");
					}
					else{
					System.out.println("   " + lineSplit[j] + "},");
					}
				}
				System.out.print("] \n },\n");
			}
			
		}
	}
	
	

}
