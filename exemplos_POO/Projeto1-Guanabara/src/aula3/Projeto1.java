package aula3;
//Visibilidades
public class Projeto1 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo = "Bic";
		c1.cor = "Azul";
		c1.carga = 70;
		//c1.tampada = false;
		//c1.ponta = 0.5f; não esta visivel
		
		c1.tampar();
		//c1.destampar();
		c1.status();
	}

}
