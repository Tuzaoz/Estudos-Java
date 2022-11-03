import java.util.Scanner;

import entities.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        aluno.name = sc.nextLine();
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();
        if (aluno.missingGrade() != 0.0) {
            System.out.println("Nota Final = " + aluno.NotaFinal());
            System.out.println("Falhou");
            System.out.println("Falou "+ aluno.missingGrade() + " pontos");
        } else {
            System.out.println("Nota Final = " + aluno.NotaFinal());
            System.out.println("Passou");
        }
        sc.close();        
    }
}
