public class Questao4 {
  public static void main(String [] args)throws Exception {

    Post post = new Post("Different eyes see different things", " https://www.friv.com/ ");

System.out.println("\nLegenda: "+post.texto);
System.out.println("Link: "+post.link);

post.curtir(post.numeroCurtidas);
post.curtir(post.numeroCurtidas);
post.curtir(post.numeroCurtidas);

post.compartilhar(post.numeroCompartilhamentos);
post.compartilhar(post.numeroCompartilhamentos);

System.out.println("Numero de Curtidas: "+post.numeroCurtidas);
System.out.println("Numero de Compartilhamentos: "+post.numeroCompartilhamentos);
  }
}
