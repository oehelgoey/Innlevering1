import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*; 
import static java.lang.Math.*;
public class oppgave3 {

	public static void main(String[] args) {
		
		
		String tall = showInputDialog("Gi et tall som er større enn 0");
		int n = parseInt (tall);
        int res = 1;
        int i = 1;
		while (i<=n) {
		res=res*i;
		i+=1;
		}
		System.out.println(res);
	}

}
