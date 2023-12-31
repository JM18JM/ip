package classes;

public class Artigos {
    public int quantidade;
    public String nome;
    public int id;
    public double preçoVenda;
    public double preçoCompra;
    public Marca marca;
    public Tipo tipo;
    public Artigos() {

        
    }
public int getQuantidade(){
 return quantidade;   
}
    public void listarInformacaoArtigo (){
     System.out.println("quantidade"+quantidade);
     System.out.println("nome"+nome);
     System.out.println("id"+id);
     System.out.println("precovenda"+precovenda);
     System.out.println("precocompra"+precocompra);
     System.out.println("marca"+marca);
     System.out.println("tipo"+tipo);
     System.out.println("artigos"+artigo);
    }
}

