public class Questao1 {
  public static void main(String [] args){
    
  Paciente paciente1 = new Paciente("00000", "Maria Luíza ","20/12/2004", "Feminino", "Planserv", "Nenhuma", "A+" );

System.out.println(" \n Dados da Paciente: \n ");
System.out.println("Código: "+paciente1.codigo);
System.out.println("Nome: "+paciente1.nome);
System.out.println("Data de Nascimento: "+paciente1.dataNascimento);
System.out.println("Sexo: "+paciente1.sexo);
System.out.println("Plano de Saúde: "+paciente1.planoSaude);
System.out.println("Alergia: "+paciente1.alergia);
System.out.println("Tipo Tipo Sanguineo: "+paciente1.tipoSanguineo);

System.out.println("\n Dados da mãe: \n ");

paciente1.codigo = "00001";
paciente1.nome = "Luceilma Costa";
paciente1.dataNascimento = "17/11/1970";
paciente1.sexo = "Feminino";
paciente1.planoSaude = "N sei";
paciente1.alergia = "Lactose"; 
paciente1.tipoSanguineo = "A+"; 
System.out.println("Código: "+paciente1.codigo);
System.out.println("Nome: "+paciente1.nome);
System.out.println("Data de Nascimento: "+paciente1.dataNascimento);
System.out.println("Sexo: "+paciente1.sexo);
System.out.println("Plano de Saúde: "+paciente1.planoSaude);
System.out.println("Alergia: "+paciente1.alergia);
System.out.println("Tipo Sanguineo: "+paciente1.tipoSanguineo);
 

  }
}
