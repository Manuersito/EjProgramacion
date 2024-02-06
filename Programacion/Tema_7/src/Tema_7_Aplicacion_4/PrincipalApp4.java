package app4;

public class PrincipalApp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Lista l1 = new Lista();
		        Lista l2 = new Lista();
		        l1.insertarFinal(4);
		        l1.insertarFinal(5);
		        l1.insertarFinal(6);
		        System.out.println(l1);
		        l1.insertarPrincipio(3);
		        l1.insertarPrincipio(2);
		        l1.insertarPrincipio(1);
		        System.out.println(l1);
		        l1.insertar(2, 99);
		        System.out.println(l1);
		        l1.eliminar(2);
		        System.out.println(l1);
		        System.out.println(l1);
		        l2.insertarFinal(10);
		        l2.insertarFinal(20);
		        l2.insertarFinal(30);
		        l2.insertarFinal(40);
		        l2.insertarFinal(50);
		        System.out.println(l2);
		        l1.insertarFinal(l2);
		        System.out.println(l1.toString());
		    }
		}
	


