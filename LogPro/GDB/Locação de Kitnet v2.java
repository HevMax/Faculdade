import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
//DECLARAÇÕES
        double alugueA = 0, alugueB = 0, alugueC = 0, alugueD = 0, alugueTotal = 0;
        boolean kitnetA = true, kitnetB = true, kitnetC = true, kitnetD = true,kitnetOcupada = false; 
        Scanner input = new Scanner(System.in);
        final double LOCACAO = 1000, AUMENTO = 100;
        char kitnet;
        int moradores, media = 4;
        
        for (int x = 0;x<4 ;x++ ){
            do{
//ENTRADA DO KITNET E REPETIÇÃO SE ESTIVER ERRADO             
                System.out.print("Informe a qual Kitnet deseja alugar [A, B, C, D]: ");
                kitnet = input.nextLine().charAt(0);
                kitnet = Character.toUpperCase(kitnet);
                
                if (kitnet != 'A' && kitnet != 'B' && kitnet != 'C' && kitnet != 'D') {
                    System.out.println("ERRO!! Informe uma entrada válida");
                    continue;
                }
                else{
                    if (kitnet == 'A'){
                        kitnetOcupada = kitnetA;
                    }
                    else if (kitnet == 'B'){
                        kitnetOcupada = kitnetB;
                    }
                    else if (kitnet == 'C'){
                        kitnetOcupada = kitnetC;
                    }
                    else if (kitnet == 'D'){
                        kitnetOcupada = kitnetD;
                    }
                }
                
                if(kitnetOcupada == false){
                    System.out.println("Desculpe, mas a kitnet já está ocupada. Informe outra unidade.");
                    continue;
                }
                break;
            }while(true);

// ENTRADA DE MORADORES
            do{
                System.out.print("Informe a quantidade de moradores (Max. 6): ");
                moradores = input.nextInt();
                input.nextLine();

                if (moradores < 0 || moradores > 6) {
                    System.out.println("ERRO!! Informe uma entrada válida (de 0 a 6 moradores).");
                     continue;
                }
                else if (moradores>3){
                    moradores-=3;
                }
                else{
                    moradores = 0;
                }
                break;
            }while(true);
// CALCULO DO ALUGUEL          
            if (kitnet == 'A'){
                kitnetA = false;
                alugueA = LOCACAO + (AUMENTO*moradores);
                System.out.println("Valor da Locação: R$" + alugueA);
            }
            
            else if (kitnet == 'B'){
                kitnetB = false;
                alugueB = LOCACAO + (AUMENTO*moradores);
                System.out.println("Valor da Locação: R$" + alugueB); 
            }
            else if (kitnet == 'C'){
                kitnetC = false;
                alugueC = LOCACAO + (AUMENTO*moradores);
                System.out.println("Valor da Locação: R$" + alugueC);
            }
            else if (kitnet == 'D'){
                kitnetD = false;
                alugueD = LOCACAO + (AUMENTO*moradores);
                System.out.println("Valor da Locação: R$" + alugueD);
            }
        }
//SAIDAS        
        alugueTotal = alugueA+alugueB+alugueC+alugueD;
        System.out.println("Valor Total da Locação: R$" + alugueTotal);
        System.out.println("Valor Médio da Locação: R$" + alugueTotal / media);
	}
}
