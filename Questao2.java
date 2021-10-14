public class Questao2 {
  public static void main(String [] args){
    
Endereco endereco = new Endereco( "Rua do Dengo", "546", "Perto do Supermercado", " Centro", "Euclides da Cunha ", "BA", "48500-000");

Medico medico = new Medico( "3833974", "Beatriz Pereira Cardoso", "Feminino", "Ginicologia e Obstetricia", endereco);

System.out.println("Endereço:    \n");

System.out.println("Rua: " +endereco.rua);
System.out.println("Número: " +endereco.numero);
System.out.println("Complemento: " +endereco.complemento);
System.out.println("Bairro: " +endereco.bairro);
System.out.println("Cidade: " +endereco.cidade);
System.out.println("UF: " +endereco.uf);
System.out.println("Cep: " +endereco.cep);


System.out.println("\n Dados do Médico: \n");

System.out.println("Código: "+medico.codigo);
System.out.println("Nome: "+medico.nome);
System.out.println("Sexo: "+medico.sexo);
System.out.println("Especialização em:"+medico.especialidade);
System.out.println("Endereço: "+medico.endereco.rua+", "+medico.endereco.numero+ ", "+medico.endereco.complemento+", "+medico.endereco.bairro+", "+medico.endereco.cidade+", "+medico.endereco.uf+", "+medico.endereco.cep+".");

endereco.rua = "Rua Antônio Silva Dantas";
endereco.numero = "616";
endereco.complemento = "Na frente do bar";
endereco.bairro = "Caixa D'água ";
endereco.cidade = "Euclydes da Cunha";
endereco.uf = "SP";
endereco.cep = "495844-000";


medico.codigo = "646161";
medico.nome = "José Carlos de Albuquerque";
medico.sexo = "Masculino";
medico.especialidade = "Pediatria";
medico.endereco = endereco;

System.out.println("\n_______DADOS MODIFICADOS_______");
System.out.println("Endereço:    \n");

System.out.println("Rua: " +endereco.rua);
System.out.println("Número: " +endereco.numero);
System.out.println("Complemento: " +endereco.complemento);
System.out.println("Bairro: " +endereco.bairro);
System.out.println("Cidade: " +endereco.cidade);
System.out.println("UF: " +endereco.uf);
System.out.println("Cep: " +endereco.cep);


System.out.println("\n Dados do Médico: \n");

System.out.println("Código: "+medico.codigo);
System.out.println("Nome: "+medico.nome);
System.out.println("Sexo: "+medico.sexo);
System.out.println("Especialização em:"+medico.especialidade);
System.out.println("Endereço: "+medico.endereco.rua+", "+medico.endereco.numero+ ", "+medico.endereco.complemento+", "+medico.endereco.bairro+", "+medico.endereco.cidade+", "+medico.endereco.uf+", "+medico.endereco.cep+".");



  }
}
