package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(10);
//		a1.pi = 10;
		AreaCirc a2 = new AreaCirc(5);
//		a2.pi = 5;
		System.out.println(a1.area()); //se colocar alguma nova variável, 
									   //os próximos irão dar retorno no valor da última variável
		System.out.println(a2.area());
		System.out.println(AreaCirc.area(100));
	}
}
