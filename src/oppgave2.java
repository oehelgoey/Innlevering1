import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*; 
import static java.lang.Math.*;
public class oppgave2 {

	public static void main(String[] args) {
		
		
		final int ANTALLELEVER = 10;
		for (int elevnr=1; elevnr<=ANTALLELEVER; elevnr++) {
		
			
		String poeng;
		int k;
		
		
		poeng= showInputDialog("Antall poeng fra 0-100");
		k = parseInt (poeng);
	
		
		while (k>100 || k < 0 ){
			poeng= showInputDialog("Tallet du gav var ugyldig, gi et nytt tall mellom 0-100");
			k = parseInt (poeng);	
		}
		
		
	
	if (100<= k ||  k >= 90 ) { 
		System.out.println("Din karakter er: A");
	}
	
	else if (89<= k ||  k >= 80 ) { 
		System.out.println("Din karakter er: B");
	}
	
	else if (79<= k ||  k >= 60 ) { 
		System.out.println("Din karakter er: C");
	}
	
	else if (59<= k ||  k >= 50 ) { 
		System.out.println("Din karakter er: D");
	}
	
	else if (49<= k ||  k >= 40 ) { 
		System.out.println("Din karakter er: E");
	}
	
	
	else if (39<= k ||  k >= 1 ) { 
		System.out.println("Din karakter er: STRYK");
	}
	else if (100< k ||  k < 0 ) { 
		System.out.println("Din karakter er: FEIL");
	}
	
	}
	}
}

