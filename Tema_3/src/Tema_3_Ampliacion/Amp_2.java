package Tema_3_Ampliacion;

public class Amp_2 {
	public static void main(String[] args) {
		int num,max=0,min=200,media=0;
		for (int i = 0; i < 50; i++) {
			num = (int) (Math.random()*99+100);
			System.out.println(num);
			
			if (num>max) {
				max=num;
				
			} else {
				max=max;
			}
			if (num<min) {
				min=num;
				
			} else {
				min=min;
			}
			media=num+media;
			
		}
		media=media/50;
		System.out.println("el maximo es: "+max);
		System.out.println("el minimo es: "+min);
		System.out.println("la media es: "+media);

	}
}
