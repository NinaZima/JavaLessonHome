/**
 *Java 1. Home work 1.
 *@autor Ilyukhina Natalia
 *@version 20.09.21
 */
class HomeWorkAppGeneral1 {
    public static void main(String[]args){
		checkSumSing(8, 4);
		printColor();
		printThreeWords();
		compareNumbers();
	}
	
	static void printThreeWords(){
	        System.out.println("Orange");
		    System.out.println("Banana");
		    System.out.println("Apple");
	}
	
	static void checkSumSing(int a, int b){
	    int c = a + b;
	        System.out.println(c >= 0?  "Positive amount" :"The amount is negative");
	}
	
	static void printColor(){
	    int value = 95;
	    if (value <= 0) {
		    System.out.println("Red"); 
	    } else if (value > 0 && value <= 100) {
		    System.out.println("Yellow"); 
	    } else {
		    System.out.println("Green"); 
	}
		
    static void compareNumbers() {
	    int a = 11;
	    int b = 23;
	    if (a >= b ){
		    System.out.println("a >= b");
	    } else  {
	        System.out.println("a < b");		
	}
	}
	}
}
