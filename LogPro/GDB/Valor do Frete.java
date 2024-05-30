import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		double peso, taxaDeslocamento = 10;
		char tipoDeslocamento;
		
		System.out.print("Informe o peso da encomenda: ");
		peso = input.nextDouble();
		peso*=3; //R$ 3,00 por kilo
		
		
		do{
		    System.out.print("Informe o tipo de deslocamento [L-local, E-estadual ou I-interestadual] ");
		    tipoDeslocamento = input2.nextLine().charAt(0);
		    tipoDeslocamento = Character.toUpperCase(tipoDeslocamento);
		    
		    if(tipoDeslocamento!='L'&&tipoDeslocamento!='E'&&tipoDeslocamento!='I'){
		        System.out.println("Erro!! Informe um valor valido");
		        continue;
		    }
		    break;
		}while(true);
		
		if(tipoDeslocamento == 'E'){
		    taxaDeslocamento*=1.80;
		}
		
		else if(tipoDeslocamento == 'I'){
		    taxaDeslocamento *=2.50;
		}
		
		System.out.println("Valor do frete é de R$ " + (peso+taxaDeslocamento));
		
	}
}
