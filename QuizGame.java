package quiz;

class QuizGame{
	private QuizFile quizFile;
	private Player player;
	
	
	public QuizGame(){
		quizFile = new QuizFile();
		player = new Player();
	}
	
	public void start(){
		QuizFile file = new QuizFile();
		file.load();
		for(int i=0;i<file.getSize();++i){
			Quiz q = file.getQuiz(i);
			q.showMondai();
			String kaitou = player.Input();
			if( q.isSeikai(kaitou)){
				System.out.println("正解！");
				player.addSeikai();
			}else{
				System.out.println("間違い！");
				q.showSeikai();
			}
		}
		player.showSeikai();
	}
}
