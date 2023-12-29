package classes;

public class Morada {

    public int numeroPorta;
    public String rua;
    public int cp1;
    public int cp2;
    public String distrito;
    public String cidade;

    @Override
    public String toString() {
        return "Cidade: " + cidade +
               ", Distrito: " + distrito +
               ", Rua: " + rua +
               ", Número da Porta: " + numeroPorta +
               ", Código Postal: " + cp1 + "-" + cp2;
    }

}
