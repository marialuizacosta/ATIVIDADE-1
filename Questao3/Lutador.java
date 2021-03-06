public class Lutador {
    public String nome;
    public int energia;
    public int forca;

    public Lutador(String nome, int energia, int forca) {
        this.nome = nome;
        this.energia = energia;
        this.forca = forca;
    }

    public void aplicarGolpe(Lutador oponente) {
        reduzirEnergia(oponente);
    }

    public void reduzirEnergia(Lutador oponente) {
        oponente.energia = oponente.energia - this.forca;
    }
    
}
