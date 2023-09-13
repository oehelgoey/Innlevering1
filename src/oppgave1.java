import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*; 
import static java.lang.Math.*;
public class oppgave1 {


	public static void main(String[] args) {
		
	    double skatt = 0;
		String lønn = showInputDialog("Hvor mye tjener du på et år?");
		double brutto = Double.parseDouble(lønn); 
		String finnmarksfradrag = showInputDialog("Skriv 'ja' hvis du er bosatt i Troms og Finnmark");
		Boolean f = false;
		 if (finnmarksfradrag.equals("ja")) {f=true;}
		 
		 
		if (brutto>=1500000){
			double trinn5 = brutto - 1500000;
			skatt+=trinn5*0.175;
			brutto= 1499999;
		}
		 
	    if (brutto>=926800) {
	    	double trinn4 = brutto - 926800;
	    	skatt+=trinn4*0.165;
	    	brutto = 926800-1;
	    }
		 
		if (brutto>=642950) { 
			double trinn3 = brutto - 642950;
			skatt+=trinn3*(f==true ? 0.115 : 0.135);
			brutto = 642949;
			
		}
		
		if (brutto>=279150) {
			double trinn2 = brutto - 279150;
			skatt+=trinn2*0.04;
			brutto = 279149;
		
		}
		
		if (brutto>=198350) {
			double trinn1 = brutto - 198350;
			skatt+=trinn1*0.017;
	
		}
		
		System.out.println("Skatten du skal betale er: " + skatt );
	}

}
