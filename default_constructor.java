class default_constructor{
	int id;
	String name;
	void display(){
		System.out.println(id + " "+ name);
	}
	public static void main(String args[]){
		default_constructor s1 = new default_constructor();
		default_constructor s2 = new default_constructor();
		s1.display();
		s2.display();
	}
}
	