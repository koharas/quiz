package quiz;

import java.io.*;
import java.util.*;

class QuizFile{
	private ArrayList<Quiz> list; 
	
	public QuizFile(){
		list = new ArrayList<Quiz>(); 
	}
	
	public void load(){
		try{
			BufferedReader br = new BufferedReader( new FileReader("quiz.txt"));
			String str;
			while((str = br.readLine()) != null){
				String[] data = str.split("\t");
				list.add(new Quiz(data[0],data[1]));
			}
		}catch(IOException e){
			System.out.println("“Ç‚İ‚İƒGƒ‰[");
		}
	}
	public Quiz getQuiz(int n){
		return list.get(n);
	}
	
	public int getSize(){
		return list.size();
	}
	
}
