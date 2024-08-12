package view;

import controller. NegativosController;
public class Principal {

	public static void main( String[]args) {
		
	int vet[]={-5,-3,-6,7,-13};
	 NegativosController negCon= new NegativosController();
	int tamanho= vet.length - 1;
	
	int quantidade=0;
			
	int resp= negCon.resultado(quantidade, tamanho,vet);
	System.out.println(resp);
	
}
}