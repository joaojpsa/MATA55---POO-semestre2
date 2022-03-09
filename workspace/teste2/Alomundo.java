public class Alomundo {
    public static void main(String[] args) {
        int num1 = 64, num2 = 7;
        int resultadoSoma = num1 + num2;

        System.out.printf("Hello Salvador" + "/" + "BA " + resultadoSoma + "\n");
        System.out.println(9 / 2.0 >= 4);
        double d = 2.8;
        System.out.println((int)d);
        System.out.println(1 + 2 != 10);
        System.out.println(1 == 1 && 2 == 2);
        char x = 'A';
        int y = (int)x;
        
        if(y > 10){
            System.out.println("Y é maior que 10");
        }else{
            System.out.println("ALGO ERRADO");
        }

        System.out.println(y);
        int numerador = 10;
        int denominador = 3;
        double res = numerador / (double)denominador;
        System.out.println(res);

    }
}