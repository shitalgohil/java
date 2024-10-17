class EnumEx{
	public enum season{ Winter, Spring , Summer, Fall};
	public static void main(String args[]){
		for (season s : season.values()){
			System.out.println(s);
		}
	}
}
