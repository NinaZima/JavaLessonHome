/**
 * Java 1. Home work 2. Training manual
 * @autor Ilyukhina Natalia
 * @version 21.09.21
 */
class FirstApp2109 {
public static void main(String[]args){
	int a = 3;
	if (a == 1) {
		System.out.println("a = 1");
	} else if (a == 3) {
	    System.out.println("a = 3");  	
	} else {
		System.out.println("Now");
	}
		int d = 3;
		switch (d) {
			case 1:
			    System.out.println("d = 1");
			    break;
		    case 3:
			    System.out.println("d = 3");
				break;
			default:
       		    System.out.println("Now");	
		    }
		int x;
		for (x = 10; x >= 0; x -=5) { // шаг -5
			System.out.print(x + " ");	
			}
		int y =0;
		for( int count = 10; count < 5; count++)
			{
			System.out.println( count + " ");	// тот оператор не работает, т.к. 10 > 5
			} 
		for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("i-j: " + i + "-" + j);	
		    }
		for (int p = 0; p<10; p++) {
		if (p > 3) {
		    break;	
			}
			    System.out.println("p = " +p);	
		    }
		String[] sm = {"A", "B", "C", "D"};
		for (String o : sm) {
			System.out.print(o + " ");	
			}
		for (int q = 0; q < 3; q++) {
		    for (int v = 0; v < 3; v++) {
				System.out.print(" " + q + v);	
			}
		}	
        for (int c = 0; c < 10; c++) {
			System.out.print('*');	
		}	
		for (int n = 0; n < 6; n++) {
			for (int z = 0; z < 10; z++) {
				System.out.print('*');	
			}
			System.out.println();	
		}	 
	for (int s = 0; s < 6; s++) {
		for (int o = 0; o < 6; o++) {
			System.out.print("* ");	
		}
		System.out.println();
	}
    for(int w = 0; w < 6; w++)	{
		for(int f = 0; f < 6; f++) {
		    if (f < 3) {
				System.out.print("* ");	
			} else {
			System.out.print("0 ");	
			}	
		}
		System.out.println();
	}
	for (int l = 0; l < 6; l++) {
		for ( int e = 0; e < 6; e++) {
			if(l == 0 || l ==5 || e == 0 || e == 5) {
				System.out.print("0 ");				
			} else {
				System.out.print("* ");	
			}
		}
		System.out.println();	
		}
	for (int h = 0; h < 6;h++) {
		for ( int m = 0; m < 6; m++) {
			if((h + m)  % 2 == 0) {
				System.out.print("* ");				
			} else {
				System.out.print("0 ");	
			}
		}
		System.out.println();	
	}
	for (int r = 0; r < 6; r++) {
		for ( int g = 0; g< 6; g++) {
			if(r > g) {
				System.out.print("0 ");				
			} else if(r < g) {
				System.out.print("* ");	
			} else {
				System.out.print(" ");	
			}
		}
		System.out.println();
		}		
	}	
}