package classes;



public class Fornecedores{
    public int id;
    public String nome;
    public Morada morada;
    public int qtArtigos;
    public int[] listaArtigos;
    public Artigos artigo;
    public Tipo tipo;


    public Fornecedores() {
        qtArtigos = 0;
        listaArtigos = new int[10];
        morada = new Morada();
    }


    public boolean addArtigo(Artigos artigo){
        if(this.qtArtigos == this.listaArtigos.length){
            System.out.println("Array de Produtos cheio.");
            return false;
        }else{
             this.listaArtigos[qtArtigos] = artigo.id;
            qtArtigos++;
            return true;
        }
    }

    @Override
    public String toString() {
        return "Fornecedores{" +
               "id=" + id +
               ", nome='" + nome + '\'' +
               ", morada='" + morada + '\'' +
               ", tipo='" + tipo + '\'' +
               ", qtArtigos=" + qtArtigos +
               '}';
    }

}

