class HomeWorkAppGeneral {
    public static void main(String[]args){
		checkSumSing();
		printColor();
	}
	static void checkSumSing(){
	int a = 8;
	int b = 4;
	int c = a + b;
	    System.out.println(c >= 0?  "Positive amount" :"The amount is negative");
	 }
	
	static void printColor(){
	int value = 95;
	
	if (value <=0) {
		System.out.println("Red"); 
	} 
	if (value > 0 && value <= 100) {
		System.out.println("Yellow"); 
	}
	if (value > 100) {
		System.out.println("Green"); 
	}
	}
}
