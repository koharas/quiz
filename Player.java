package quiz;
import java.io.*;

class Player{
	private int seikai;

	public Player{
		seikai = 0;
	}
	
	public String Input(){
		String str="";
		try{
			BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
			str = br.readLine();
		}catch(IOException e){
		}
		return str;
	}
	public void addSeikai(){
		seikai++;
	}
	public void showSeikai(){
		System.out.println("³‰ğ”‚Í" + seikai);
	}
}
