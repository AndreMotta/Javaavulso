/*Um estacionamento cobra uma tarifa mínima de R$ 2,00 para estacionar por até três horas. Um adicional
de R$ 0,50 por hora não necessariamente inteira é cobrado após as três primeiras horas. A tarifa máxima para qualquer dado período
de 24 horas é R$ 10,00. Suponha que nenhum carro fique estacionado por mais de 24 horas por vez. Escreva um aplicativo que calcule e
exiba as tarifas de estacionamento para cada cliente que estacionou nessa garagem ontem. Você deve inserir as horas de estacionamento
para cada cliente. O programa deve exibir a cobrança para o cliente atual e calcular e exibir o total dos recibos de ontem. Ele deve utilizar
o método calculateCharges para determinar a tarifa para cada cliente.*/
package questões;
import java.util.Scanner;

public class seis_ponto_oito {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double entrada= 2.0;
		double cobranca= 0.5;
		System.out.println("Tempo no local: ");
		double minutos=sc.nextDouble();
		
		if(180 < minutos) {
			entrada= entrada+ Math.floor(cobranca*(minutos/60));}
		System.out.println(entrada);
		
		System.out.println(entrada);
		System.out.printf("valor a pagar: %.2f", entrada);
		
	sc.close();}

}
