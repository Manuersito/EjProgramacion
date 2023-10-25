package Tema_3_Ampliacion;

public class Amp_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2;
do {
	n1=(int) (Math.random()*6+1);
	n2=(int) (Math.random()*6+1);
	System.out.println(n1+" y "+n2);
} while (!(n1==n2));

System.out.println(n1+" y "+n2+" son iguales");
	}

}
