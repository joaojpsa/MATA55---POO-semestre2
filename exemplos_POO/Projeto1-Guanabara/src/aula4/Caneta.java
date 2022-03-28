package aula4;

//metodos getters, setters e construtores

public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    //metodo construtor (ele tem o meus nome da classe)
    public Caneta(String m, String c, float p){
        this.modelo = m;
        this.cor = c;
        //this.ponta = p;
        this.setPonta(p);
        this.tampar();
    }

    // usado String ao inves do void por ser do tipo string
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    public void status(){
        System.out.println("SOBRE A CANETA:");
        //System.out.println("Modelo: " + this.modelo);
        //System.out.println("Ponta: " + this.ponta);
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada + "\n");
    }
}

