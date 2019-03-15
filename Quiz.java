package quiz;

class Quiz{
	private String mondai;
	private String kotae;
	
	public Quiz(String m,String k){
		mondai = m;
		kotae = k;
	}
	public void showMondai(){
		System.out.println(mondai);
	}
	
	public boolean isSeikai(String k){
		return kotae.equals(k);
	}

	public void showSeikai(){
		System.out.println("³‰ğ‚ÍF" + kotae);
	}
}

