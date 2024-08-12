package controller;

public class NegativosController {

	public NegativosController() {
		super();
	}
	public int resultado(int quantidade, int tamanho, int vet[]) {
		if(tamanho < 0) {
			/*
			 * a condição de parada feita para parar quando todo o vetor tiver sido lido, no caso 
			 * ele está sendo lido de trás para frente e acaba quando chegar no 0 
			 */
		return 0 ;
		} else {
			
			if (vet[tamanho]<0) {
				return 1 + resultado(quantidade, tamanho-1,vet);
			}
			else {
			return resultado(quantidade, tamanho-1,vet);
			}
		}
	/* o valor é apenas adicionado se passar pela condicional 
		
		*/
		

	}

	}