class HelloWorld1609 {
	public static void main(String[] args){
		int d = 25;
		if(d > 29) {
	        System.out.println("Too hot");
	} else  {
		System.out.println("It is normal");
	}
	System.out.println(d > 29? "Too hot" : "It is normal");	
	first();
	addAndPrint(2, 2); // add -добавить
	
	int a = 4;
	int b = 3;
	    System.out.println(a + " + " + b + " = " + add(a, b)); 
	}
	static void first(){
	    System.out.println("I am first");
    }
	static void addAndPrint(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a + b));
		}
	static int add(int a, int b) {
		return a + b; // return - возвращение
	}
}