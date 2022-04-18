
package calculadormedia;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class CalculadorMedia {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota:");
        aluno1.setM1(sc.nextLine());
        System.out.println();
        System.out.println("Digite a segunda nota:");
        aluno1.setM2(sc.nextLine());
        
        aluno1.calcularMedia0();
        
        System.out.println();
        System.out.println("Primeira Nota: "+aluno1.getM1());
        System.out.println("Segunda Nota: "+aluno1.getM2());
        System.out.println();
        System.out.println("Média Final: "+aluno1.getMedia());
    }
    
}
