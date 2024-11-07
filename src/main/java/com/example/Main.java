import java.util.Scanner;

public class Main 
{
    public static void main( String[] args )
    {
        final Scanner in = new Scanner(System.in);
        int tempo = in.nextInt();
        int velocidade = in.nextInt();
        in.close();
        double litros = solve(tempo, velocidade);
        System.out.printf("%.3f%n", litros);
    }
    

    /**
    * Calcula o total de combustível para uma viagem com um certo tempo e uma certa velocidade média.
    * @param tempo tempo da viagem em horas
    * @param velocidade velociade da viagem em Km/horas
    * @return litros de combustível gastos na viagem 
    */

    public static double solve(int tempo, int velocidade) {
        final double consumo = 12.0; //Km/l
        double litros = (velocidade * tempo) / consumo; //l
       return litros;
    }
}
