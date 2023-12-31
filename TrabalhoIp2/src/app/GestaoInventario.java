package app;

import java.util.Scanner;

import classes.Artigos;
import classes.Marca;
import classes.Tipo;

public class GestaoInventario {
    public transient Scanner sc;
    public final int TAM_FOR = 30;
    public Artigos artigos[];
    public int n_artigos;

    public GestaoInventario() {
        sc = new Scanner(System.in);
        artigos = new Artigos[TAM_FOR];
        n_artigos = 0;
    }

    public Artigos listarArtigosPorQuantidade(){
   
        Artgios[] listaArtigosOrdenada;
        int[] listaIndicesOrdenados;
        int[] quantidadesArtigos;
        
        
        
        
        
        
        for(int i = 0; i < n_artigos;i++){
    listaArtigosOrdenada[i].listarInformacaoArtigo;   
    } 
    }
    
    public boolean addArtigo(Scanner sc, GestaoFornecedores gf) {
        System.out.println("Digite o id do artigo");
        int id = Integer.parseInt(sc.nextLine());

        Artigos artigo = pesquisaArtigos(id);

        if (artigo == null) {

            artigo = new Artigos();
            artigo.id = id;
            artigos[n_artigos] = artigo;

            n_artigos++;


            System.out.println("Introduza o nome do artigo");
            artigo.nome = sc.nextLine();
            System.out.println("Introduza a quantidade do artigo");
            artigo.quantidade = Integer.parseInt(sc.nextLine());
            System.out.println("Introduza a que preço o artigo foi adquirido");
            artigo.preçoCompra = Double.parseDouble(sc.nextLine());
            System.out.println("Introduza a que preço o artigo será vendido");
            artigo.preçoVenda = Double.parseDouble(sc.nextLine());

            System.out.println("Qual é a marca do artigo?");
            System.out.println("1 - APPLE");
            System.out.println("2 - SAMSUNG");
            System.out.println("3 - HUAWEI");
            int opMarca = Integer.parseInt(sc.nextLine());

            switch (opMarca) {
                case 1: //caso escolha apple
                    artigo.marca = Marca.APPLE;
                    break;
                case 2: //caso escolha samsung
                    artigo.marca = Marca.SAMSUNG;
                    break;
                case 3: //caso escolha huawei
                    artigo.marca = Marca.HUAWEI;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Escolha inválida.");
                    break;
            }

            System.out.println("Qual é o tipo do artigo?");
            System.out.println("1 - TABLET");
            System.out.println("2 - TV");
            System.out.println("3 - PC");
            System.out.println("4 - TELEMOVEL");
            int opTipo = Integer.parseInt(sc.nextLine());

            switch (opTipo) {
                case 1: //caso escolha tablet
                    artigo.tipo = Tipo.TABLET;
                    break;
                case 2: //caso escolha tv
                    artigo.tipo = Tipo.TV;
                    break;
                case 3: //caso escolha pc
                    artigo.tipo = Tipo.PC;
                    break;
                case 4: //caso escolha telemovel
                    artigo.tipo = Tipo.TELEMOVEL;
                    break;

                case 0:
                    break;
                default:
                    System.out.println("Escolha inválida.");
                    break;

            }
            gf.listaFornecedores();
            System.out.println("Qual o id do fornecedor: ");
            int idFornecedor = Integer.parseInt(sc.nextLine());

            gf.pesquisaFornecedor(idFornecedor).addArtigo(artigo);
            return true;
        }
        return false;
    }

    public Artigos pesquisaArtigos(int id) {
        for (int i = 0; i < n_artigos; i++) {
            if (artigos[i].id == id) {
                return artigos[i];
            }
        }
        return null;
    }

    public boolean alterarArtigos() {
        System.out.println("Digite o id do artigo que deseja alterar");
        int id = Integer.parseInt(sc.nextLine());

        Artigos artigo = pesquisaArtigos(id);
        if (artigo == null) {//caso o artigo nao exista
            System.out.println("O artigo nao se encontra registado no sistema");
            return false;

        } else {//caso exista
            System.out.println("Introduza o nome do artigo");
            artigo.nome = sc.nextLine();
            System.out.println("Introduza a quantidade do artigo");
            artigo.quantidade = Integer.parseInt(sc.nextLine());
            System.out.println("Introduza a que preço o artigo foi adquirido");
            artigo.preçoCompra = Double.parseDouble(sc.nextLine());
            System.out.println("Introduza a que preço o artigo será vendido");
            artigo.preçoVenda = Double.parseDouble(sc.nextLine());

            System.out.println("Qual é a marca do artigo?");
            System.out.println("1 - APPLE");
            System.out.println("2 - SAMSUNG");
            System.out.println("3 - HUAWEI");
            int opMarca = Integer.parseInt(sc.nextLine());

            switch (opMarca) {
                case 1: //caso escolha apple
                    artigo.marca = Marca.APPLE;
                    break;
                case 2: //caso escolha samsung
                    artigo.marca = Marca.SAMSUNG;
                    break;
                case 3: //caso escolha huawei
                    artigo.marca = Marca.HUAWEI;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Escolha inválida.");
                    break;
            }

            System.out.println("Qual é o tipo do artigo?");
            System.out.println("1 - TABLET");
            System.out.println("2 - TV");
            System.out.println("3 - PC");
            System.out.println("3 - TELEMOVEL");
            int opTipo = Integer.parseInt(sc.nextLine());

            switch (opTipo) {
                case 1: //caso escolha tablet
                    artigo.tipo = Tipo.TABLET;
                    break;
                case 2: //caso escolha tv
                    artigo.tipo = Tipo.TV;
                    break;
                case 3: //caso escolha pc
                    artigo.tipo = Tipo.PC;
                    break;
                case 4: //caso escolha telemovel
                    artigo.tipo = Tipo.TELEMOVEL;
                    break;

                case 0:
                    break;
                default:
                    System.out.println("Escolha inválida.");
                    break;
            }
            return true;
        }
    }

    public int pesquisaPosArtigos(int id){
        int i;
        for(i=0; i<n_artigos; i++)
            if(artigos[i].id == id)
                return i;
            
        return -1;     
    }

    public boolean removerArtigos(){

        System.out.println("Digite o id do artigo a remover");
        int id = Integer.parseInt(sc.nextLine());

        int posArtigos = pesquisaPosArtigos(id);

        if (posArtigos == -1){//nao existe um artigo com este id
            System.out.println("Nao existe nenhum artigo registado com o id: "+id);
            return false;

        }else{//caso exista
            if(this.n_artigos == posArtigos){//ultima posiçao do array
                this.n_artigos--;

            }else{
                int i;
                for (i=posArtigos; i < n_artigos - 1 ; i++)//posiçao intermédia do array
                this.artigos[i] = this.artigos[i + 1];
                this.n_artigos--;
            } return true;
        }
    }

    public void listaArtigos(){
        for (int i = 0; i < n_artigos; i++) {
            Artigos artigo = artigos[i];
            if (artigo != null) {
                System.out.println("ID: " + artigo.id);
                System.out.println("Nome: " + artigo.nome);
                System.out.println("Marca: " + artigo.marca);
                System.out.println("Tipo: " + artigo.tipo);
                System.out.println("Quantidade: " + artigo.quantidade);
                System.out.println("Preço de compra: " + artigo.preçoCompra);
                System.out.println("Preço de venda: " + artigo.preçoVenda);
            }
        }
    }

    public void profitArtigos(){
        System.out.println("Digite o id do artigo que deseja analisar o profit");
        int id = Integer.parseInt(sc.nextLine());

        Artigos artigo = pesquisaArtigos(id);
        
        double profit = artigo.preçoVenda - artigo.preçoCompra;

        System.out.println("O profit do artigo selecionado é de: "+profit+" euros");
 
    }

    public void cmpArtigos(){
        System.out.println("Digite o id do artigo que deseja analisar o custo medio ponderado");
        int id= Integer.parseInt(sc.nextLine());
        
        System.out.println("selecione tipo moeda \n1-euro \n2-libra \n3-dollar");
        int escolha= Integer.parseInt(sc.nextLine());
        
        Artigos artigo = pesquisaArtigos(id);

        if (artigo != null && artigo.quantidade > 0) {
                double cmp = ((artigo.preçoCompra*artigo.quantidade)/artigo.quantidade);
            if (escolha == 2){
                cmp *= cmp*0.87; 
            } else if(escolha ==3){
                cmp *= cmp*1.1;
            }
            
                System.out.println("O custo medio ponderado do artigo selecionado é: "+cmp);
            }else if(artigo.quantidade <= 0)
                System.out.println("A quantidade do artigo é zero, não é possível calcular o CMP.");                                     
    } 
    
    public void valorInventário(){
        double valorInventário=0;
        
        for (int i = 0; i < n_artigos; i++) {

            double preçoArtigoTotal = artigos[i].preçoVenda * artigos[i].quantidade;

            valorInventário += preçoArtigoTotal;   
        }

        System.out.println("O valor do inventario e: "+valorInventário);   
    }   
}
