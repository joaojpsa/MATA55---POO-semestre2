package Conta;

public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;

	public void estadoAtual(){
		System.out.println("-----------------------------");
		System.out.println("Conta: " + this.getNumConta(numConta));
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getsaldo());
		System.out.println("Status: " + this.getStatus());
	}
	public void abrirConta(String t){
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC"){
			//this.saldo = 50;
			this.setSaldo(50);
		} else if(t == "CP"){
			//this.saldo = 150;
			this.setSaldo(150);
		}
	}
	public void fecharConta(){
		if (this.getsaldo() > 0) {
			System.out.println("ERRO:Conta com dinheiro");
		} else if(this.getsaldo() < 0){
			System.out.println("ERRO: Conta em débito");
		} else{
			this.setStatus(status);
			System.out.println("Conta Fechada!!");
		}
	}
	public void depositar(float v){
		if (this.getStatus()) {
			this.setSaldo(this.getsaldo() + v);
			System.out.println("Depositado");
		} else {
			System.out.println("Impossível depositar");
		}
	}
	public void sacar(float v){
		if (this.getStatus()){
			if(this.getsaldo() >= v){
				this.setSaldo(this.getsaldo() - v);
				System.out.println("Saque realizado na conta" + this.getDono());
			}else{
				System.out.println("Saldo insuficiente");
			}
		}else {
			System.out.println("Impossível sacar");
		}
	}
	public void pagarMensal(){
		float v = 0;
		if (this.getTipo() == "CC") {
			v = 43.2f;
		} else if(this.getTipo() == "CP"){
			v = 20;
		}
		if (this.getStatus()) {
			if (this.getsaldo() >= v) {
				this.setSaldo(this.getsaldo() - v);
				System.out.println("Pago com sucesso: " + this.getDono());
			} else {
				System.out.println("Saldo insuficiente");
			}
		} else {
			System.out.println("CONTA FECHADA: Impossível pagar");
		}
	}
	//METODOS ESPECIAIS
	//construtor
	public void ContaBanco(){
		this.saldo = 0;
		this.status = false;
	}
	public void setNumConta(int n){
		 this.numConta = n;
	}
	public int getNumConta(int n){
		return this.numConta;
	}
	public void setTipo(String t){
		this.tipo = t;
	}
	public String getTipo(){
		return this.tipo;
	}
	public void setDono(String dono){
		this.dono = dono;
	}
	public String getDono(){
		return this.dono;
	}
	public void setSaldo(float saldo){
		this.saldo = saldo;
	}
	public float getsaldo(){
		return this.saldo;
	}
	public void setStatus(boolean status){
		this.status = status;
	}
	public boolean getStatus(){
		return this.status;
	}
}
