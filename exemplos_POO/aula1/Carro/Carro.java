public class Carro{
    //atributos
    String modelo;
    String marca;
    int ano;
    int vel;

    //metodos
    void acelerar_vel(int acelerar){
        vel += acelerar;
    }
    void reduzir_vel(int reduzir){
        vel -= reduzir;
    }
    void buzinar(){
        System.out.println("BI BI BI");
    }
}
class Veiculo{
    public static void main(String[] args) {
        Carro c1 = new Carro();

        c1.modelo = "Uno";
        c1.marca = "Fiat";
        c1.ano = 2022;
        c1.vel = 60;

        c1.acelerar_vel(30);
        System.out.println(c1.vel);

        c1.reduzir_vel(10);
        System.out.println(c1.vel);

    }
}
