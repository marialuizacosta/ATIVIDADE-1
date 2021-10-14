public class Post{

public String texto;
public String link;
public int numeroCurtidas;
public int numeroCompartilhamentos;


public Post(String texto, String link){
  this.texto = texto;
  this.link = link;
  this.numeroCurtidas = 0;
  this.numeroCompartilhamentos = 0;

}

public void curtir(int numeroCurtidas){
 
this.numeroCurtidas =this.numeroCurtidas+ 1;
 
}

public void compartilhar(int numeroCompartilhamentos){
  
this.numeroCompartilhamentos =this.numeroCompartilhamentos+ 1;

}


}



