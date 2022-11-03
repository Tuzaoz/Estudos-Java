package entities;

public class Aluno {
    public String name;
    public double nota1;
    public double nota2;
    public double nota3;
    
    public double NotaFinal() {
        return nota1+nota2+nota3;
    }

    public double missingGrade(){
        if (NotaFinal() < 60.00) {
            return 60.00 - NotaFinal();
        }
        else{
            return 0.0;
        }
    }

    
}
