public class Ex{

	public static void main(String [] args){

		Complexe z1 = new Complexe();
		Complexe z2 = new Complexe();
		
		z1.re = 2.0; 
		z1.im = 3.0;

		z2.re = 3.0; 
		z2.im = 4.0;

		//Opération d'addition
		Complexe z3 = new Complexe();
		z3.re = z1.re + z2.re;
		z3.im = z1.im + z2.im;

		//Opération de multiplication
		Complexe z4 = new Complexe();
		z4.re = z1.re*z2.re - z1.im*z2.im;
		z4.im = z1.re*z2.im + z1.im*z2.re;

		//Opération d'affichage

		//z3
		System.out.println(z3.re+" + "+z3.im+"i");
		//z4
		System.out.println(z4.re+" + "+z4.im+"i");


	}
}