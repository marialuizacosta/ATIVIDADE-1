public class Questao3 {
    public static void main(String[] args) throws Exception {
   

        Lutador lutador1 = new Lutador("Ryu",100,10);
        Lutador lutador2 = new Lutador("bison",100,12);
        lutador1.aplicarGolpe(lutador2);
        lutador1.aplicarGolpe(lutador2);
        lutador1.aplicarGolpe(lutador2);

      
        System.out.println("\nEnergia Ryu: "+lutador1.energia);
    System.out.println("\nEnergia Bison: " +lutador2.energia);

   
        lutador2.aplicarGolpe(lutador1);
        lutador2.aplicarGolpe(lutador1);
        lutador2.aplicarGolpe(lutador1);
        lutador2.aplicarGolpe(lutador1);
        lutador2.aplicarGolpe(lutador1);
        lutador2.aplicarGolpe(lutador1);
        lutador2.aplicarGolpe(lutador1);
        lutador2.aplicarGolpe(lutador1);
        
      System.out.println("\nEnergia Ryu: "+lutador1.energia);
    System.out.println("\nEnergia Bison: " +lutador2.energia);
    }
}
