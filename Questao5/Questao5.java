public class Questao5 {
  public static void main(String [] args)throws Exception {

 Aluno aluno = new Aluno("Maria Luíza Costa Andrade", "69235784606");
    
System.out.println("\nNome: " +aluno.nome);
System.out.println("CPF: " +aluno.cpf);

aluno.nota1 = 8.2;
aluno.nota2 = 5.0;
aluno.nota3 = 9.9;

aluno.calcularMedia();
double media = aluno.calcularMedia();
System.out.println("\nMédia: "+media);

aluno.nota1 = 8.1;
aluno.nota2 = 6.8;
aluno.nota3 = 2.5;

aluno.calcularMedia();
System.out.println("Média: "+aluno.calcularMedia());



  }
}
