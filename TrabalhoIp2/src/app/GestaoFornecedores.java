package app;

import classes.Fornecedores;
import classes.Morada;
import classes.Tipo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * A classe GestaoFornecedores gere fornecedores e as informações associadas a estes mesmos.
 */

public class GestaoFornecedores {
        /** Scanner */
        public transient Scanner sc;
        /** Número máximo de fornecedores. */
        public final int TAM_FOR = 10;
        /** Array para os objetos de fornecedores. */
        public Fornecedores fornecedores[];
        /** Array list */
        public ArrayList<Fornecedores> fornecedoresList;
        /** Número atual de fornecedores. */
        public int n_fornecedores;

        /**
        * Construtor da classe GestaoFornecedores. Neste construtor iniciamos o Scanner, o array de fornecedores, e o número de fornecedores.
        */
        
        public GestaoFornecedores() {
            sc = new Scanner(System.in);
            fornecedores = new Fornecedores[TAM_FOR];
            n_fornecedores = 0;
            fornecedoresList = new ArrayList<>();
            
        }

    /**
     * Adiciona um novo fornecedor ao sistema.
     * @param Scanner abrimos o scanner porque este é preciso para receber o id
     * @return true se o fornecedor for adicionado com sucesso, false se o fornecedor já existir.
     */
    public boolean addFornecedor(Scanner sc) {

        System.out.println("Insira o id do novo fornecedor.");
        int id = Integer.parseInt(sc.nextLine());
        
        Fornecedores fornecedor = pesquisaFornecedor(id);

        if(fornecedor == null){

            fornecedor = new Fornecedores();  
            fornecedor.morada = new Morada();
            fornecedor.id = id;
            fornecedores[n_fornecedores] = fornecedor; 
            
            n_fornecedores++;

            System.out.println("Digite o nome do fornecedor");
            fornecedor.nome = sc.nextLine();
            System.out.println("Digite a Morada do fornecedor");
            System.out.println("Qual é a cidade?");
            fornecedor.morada.cidade = sc.nextLine();
            System.out.println("Qual é o Distrito?");
            fornecedor.morada.distrito = sc.nextLine();
            System.out.println("Qual é a rua?");
            fornecedor.morada.rua = sc.nextLine();
            System.out.println("Qual é o número da porta?");
            fornecedor.morada.numeroPorta = Integer.parseInt(sc.nextLine());
            System.out.println("Qual é a primeira parte do código postal?");
            fornecedor.morada.cp1 = Integer.parseInt(sc.nextLine());
            System.out.println("Qual é a segunda parte do código de postal?");
            fornecedor.morada.cp2 = Integer.parseInt(sc.nextLine());
            
            
            System.out.println("Qual é o tipo de mercadoria que ele vende?");
            System.out.println("1 - Tablets");
            System.out.println("2 - TVs");
            System.out.println("3 - PCs");
            System.out.println("4 - Telemoveis");
            int op = Integer.parseInt(sc.nextLine());

            switch(op){
                case 1: //caso ele escolha tablet
                        fornecedor.tipo = Tipo.TABLET;
                        break;
                case 2: //caso ele escolha tvs
                        fornecedor.tipo = Tipo.TV;
                        break;
                case 3: //caso ele escolha PCs
                        fornecedor.tipo = Tipo.PC;
                        break;
                case 4: //caso ele escolha Telemoveis
                        fornecedor.tipo = Tipo.TELEMOVEL;
                        break;
                case 0: break;
                default: System.out.println("Escolha inválida.");
                        break;
            }
            return true;
        } else {
            return false;
        }
    }

    /**
     * Atualiza informações de um fornecedor existente.
     *
     * @return true se o fornecedor for atualizado com sucesso, false se o fornecedor não existir.
     */
    public boolean updFornecedor(){
        System.out.println("Qual é o id do fornecedor que quer atualizar?");
        int id = Integer.parseInt(sc.nextLine());

        Fornecedores fornecedor = pesquisaFornecedor(id);

        if(fornecedor == null){
            System.out.println("Este fornecedor não existe.");
            return false;
        }else{
               System.out.println("Digite o nome do fornecedor");
            fornecedor.nome = sc.nextLine();
            System.out.println("Digite a Morada do fornecedor");
            System.out.println("Qual é a cidade?");
            fornecedor.morada.cidade = sc.nextLine();
            System.out.println("Qual é o Distrito?");
            fornecedor.morada.distrito = sc.nextLine();
            System.out.println("Qual é a rua?");
            fornecedor.morada.rua = sc.nextLine();
            System.out.println("Qual é o número da porta?");
            fornecedor.morada.numeroPorta = Integer.parseInt(sc.nextLine());
            System.out.println("Qual é a primeira parte do código postal?");
            fornecedor.morada.cp1 = Integer.parseInt(sc.nextLine());
            System.out.println("Qual é a segunda parte do código de postal?");
            fornecedor.morada.cp2 = Integer.parseInt(sc.nextLine());
            
            
            System.out.println("Qual é o tipo de mercadoria que ele vende?");
            System.out.println("1 - Tablets");
            System.out.println("2 - TVs");
            System.out.println("3 - PCs");
            System.out.println("4 - Telemoveis");
            int op = Integer.parseInt(sc.nextLine());

            switch(op){
                case 1: //caso ele escolha tablet
                        fornecedor.tipo = Tipo.TABLET;
                        break;
                case 2: //caso ele escolha tvs
                        fornecedor.tipo = Tipo.TV;
                        break;
                case 3: //caso ele escolha PCs
                        fornecedor.tipo = Tipo.PC;
                        break;
                case 4: //caso ele escolha Telemoveis
                        fornecedor.tipo = Tipo.TELEMOVEL;
                        break;
                case 0: break;
                default: System.out.println("Escolha inválida.");
                        break;
            }
            return true;
        } 
           
        }
     /**
     * Procura a posição de um fornecedor no array
     *
     * @param id ID do fornecedor a ser procurado.
     * @return A posição do fornecedor no array ou -1 se não for encontrado.
     */
    public int pesquisaPosFornecedor(int id){
        int i;
        for(i=0; i<n_fornecedores; i++);
            if(fornecedores[i].id == id){
            return i;
            }else{
                return -1;

            }
    }

    /**
     * Procura um fornecedor 
     *
     * @param id ID do fornecedor a ser procurado.
     * @return O objeto do fornecedor se encontrado, caso contrário, retorna null.
     */
    public Fornecedores pesquisaFornecedor(int id) {
        int i;
        for (i=0; i < n_fornecedores; i++){
            if(fornecedores[i].id == id){
                return fornecedores[i];
            }
            
        }
        return null;
    }
     /**
     * Remove um fornecedor do sistema.
     *
     * @return true se o fornecedor for removido com sucesso, false se o fornecedor não existir.
     */
    public boolean removeFornecedor(){

        System.out.println("Insira o id do fornecedor que deseja remover");
        int id = Integer.parseInt(sc.nextLine());

        int posFornecedor = pesquisaPosFornecedor(id);

        if(posFornecedor == -1){
        return false;
         } else{
            if(this.n_fornecedores == posFornecedor){
                this.n_fornecedores--;
            }else{
                int i;
                for (i=posFornecedor; i < n_fornecedores - 1 ; i++)
                this.fornecedores[i] = this.fornecedores[i + 1];
                this.n_fornecedores--;
            } return true;
         }
    }
    /**
     * Lista informações sobre todos os fornecedores registados.
     */
    public void listaFornecedores() {
        for (int i = 0; i < n_fornecedores; i++) {
            Fornecedores fornecedor = fornecedores[i];

            if (fornecedor != null) {
                System.out.println("ID: " + fornecedor.id);
                System.out.println("Nome: " + fornecedor.nome);
                System.out.println("Morada: " + fornecedor.morada);
                System.out.println("Tipo: " + fornecedor.tipo);
                System.out.print("Lista de artigos: ");
                for (int j = 0; j < fornecedor.listaArtigos.length; j++){
                    System.out.print("["+fornecedor.listaArtigos[j]+"] ");
                }
                System.out.println(); 
            }
        }
    }
    /**
     * Lista fornecedores com zero artigos.
     */
    public void listaFornecedorNoArtigo(){
        System.out.println("Fornecedores com 0 artigos.");
        for(int i = 0; i < n_fornecedores; i++){
            Fornecedores fornecedor = fornecedores[i];
        
        if(fornecedor != null){
            if(fornecedor.qtArtigos == 0){
                System.out.println("ID: " + fornecedor.id);
                System.out.println("Nome: " + fornecedor.nome);
                System.out.println("Morada: " + fornecedor.morada);
                System.out.println("Tipo: " + fornecedor.tipo);
            }
        }
        }
    }
    
    /**
     * Lista fornecedores com stock extremamente baixo.
     */
    public void listaFornecedorArtigoBaixo(){
        System.out.println("Fornecedores com stock extremamente baixo.");
        for(int i = 0; i < n_fornecedores; i++){
            Fornecedores fornecedor = fornecedores[i];

            if(fornecedor!=null && fornecedor.qtArtigos < 2){
                    System.out.println("ID: " + fornecedor.id);
                    System.out.println("Nome: " + fornecedor.nome);
                    System.out.println("Morada: " + fornecedor.morada);
                    System.out.println("Tipo: " + fornecedor.tipo);
                    System.out.print("Lista de artigos: ");
                for (int j = 0; j < fornecedor.listaArtigos.length; j++){
                    System.out.print("["+fornecedor.listaArtigos[j]+"] ");
                }
                System.out.println(); 
            }
            }
        }

            /**
            * Lista os 3 fornecedores com mais artigos.
            */
        /**public void top3Fornecedores(){
            *System.out.println("Top 3 fornecedores com mais artigos.");
            *Fornecedores t1 = null, t2 = null, t3 = null;
            
            *for(int i = 0; i<n_fornecedores; i++){
                
                *Fornecedores fornecedor = fornecedores[i];

                *if (t1 == null || (fornecedor != null && fornecedor.qtArtigos > t1.qtArtigos)) {
                    *t3 = t2;
                    *t2 = t1;
                    *t1 = fornecedor;
                *} else if (t2 == null || (fornecedor != null && fornecedor.qtArtigos > t2.qtArtigos)) {
                    *t3 = t2;
                    *t2 = fornecedor;
                *} else if (t3 == null || (fornecedor != null && fornecedor.qtArtigos > t3.qtArtigos)) {
                 *   t3 = fornecedor;
                *}
             
                *}

                
                *System.out.println(t1);
                *System.out.println(t2);
                *System.out.println(t3);
            *}

        }*/
    /**
    * Lista os 3 fornecedores com mais artigos.
    */
        public void top3Fornecedores() {
        System.out.println("Top 3 fornecedores com mais artigos.");
        // Step 1: Preenche fornecedoresList com os elementos do array fornecedores
        for(int k=0; k < fornecedores.length; k++){
            fornecedoresList.add(fornecedores[k]);
     }
     int n = fornecedoresList.size();
     // Step 2: Utiliza-se um bubblesort para ordenar os fornecedores com mais artigos
     for (int i = 0; i < n - 1; i++) {
         for (int j = 0; j < n - 1 - i; j++) {
            // Step 2.1: Procura fornecedor1 e fornecedor2 para os comparar
             Fornecedores fornecedor1 = fornecedoresList.get(j);
             Fornecedores fornecedor2 = fornecedoresList.get(j + 1);
            // Step 2.2: Verifica valores nulos antes de os comprarar
             if (fornecedor1 != null && fornecedor2 != null) {
                // Step 2.3: Compara fornecedor1 e fornecedor2 com base em qtArtigos
                 if (fornecedor1.qtArtigos < fornecedor2.qtArtigos) {
                     // Passo 2.4: Troca fornecedor1 e fornecedor2, se for preciso
                     Collections.swap(fornecedoresList, j, j + 1);
                 }
             }
         }
     }
 
        // Passo 3: Imprime os 3 fornecedores com mais Artigos
        for (int i = 0; i < Math.min(3, fornecedoresList.size()); i++) {
            System.out.println(fornecedoresList.get(i)); }
}
}
  


    

