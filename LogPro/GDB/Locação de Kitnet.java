import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double alugueAtual, alugueTotal = 0; //Kitnet
        int media = 4, inquilinos = 0;
        Scanner input = new Scanner(System.in);
        final double LOCACAO = 1000, AUMENTO = 100;
        char kitnetEntrada;

        for (int x = 0;x<4;x++){
            do{
                System.out.print("Informe a unidade de locação ( [A], [B], [C] ou [D]: ");
                kitnetEntrada = input.nextLine().charAt(0);
                kitnetEntrada = Character.toUpperCase(kitnetEntrada);
                
                if (kitnetEntrada!='A'&&kitnetEntrada!='B'&&kitnetEntrada!='C'&&kitnetEntrada!='D'){
                    System.out.println("Entrada Incorreta! Informe uma letra válida.");
                    continue;
                }
                break;    
            }while(true);
            
            
            do{
                System.out.print("Quantos moradores terá no Kitnet (0 - 6): ");
                inquilinos = input.nextInt();
                
                if(inquilinos<0 || inquilinos>6){
                    System.out.println("Entrada Incorreta! Informe um valor válido.");
                    continue;
                }
                break;    
            }while(true);
            
            if(inquilinos == 0){
                System.out.println("Aluguel R$ 00,00 - Kitnet Desocupado.");
            }
           else if(inquilinos>0 && inquilinos<4){
                alugueTotal+=LOCACAO;
                System.out.printf("\nValor do Aluguel R$ %.2f\n",LOCACAO);
            }
            else{
                alugueAtual = LOCACAO + (AUMENTO*(inquilinos-3));
                alugueTotal+=alugueAtual;
                System.out.printf("\nValor do Aluguel R$ %.2f\n",alugueAtual);
            }
            input.nextLine();
            System.out.println("------------------------------------------------------");
        }
        System.out.println("======================================================");
        System.out.printf("\nValor Total das Locações R$ %.2f\n", alugueTotal);
        System.out.printf("\nValor Médio das Locações (%d) R$ %.2f\n",media, alugueTotal/media);
    }
}
