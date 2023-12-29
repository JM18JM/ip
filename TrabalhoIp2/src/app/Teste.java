package app;

import java.util.Scanner;

public class Teste {
    public static GestaoFornecedores gf;
    public static Scanner sc;
    public static GestaoInventario gi;
    public static GestaoUser gu;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        gf = new GestaoFornecedores();
        gi = new GestaoInventario();
        gu = new GestaoUser();
        TesteMenu();


    }

    public static void TesteMenu() {

        int op;
        do {
            System.out.println("1 - Adicionar artigo");
            System.out.println("2 - Alterar artigo");
            System.out.println("3 - Listar artigos");
            System.out.println("4 - remover artigo");
            System.out.println("5 - add fornecedor");
            System.out.println("6 - Lista fornecedores");
            System.out.println("7 - fornecedores c mais cenas");

            op = Integer.parseInt(sc.nextLine());


            switch (op) {
                case 1  : gi.addArtigo(sc,gf);
                            break;
                case 2: gi.alterarArtigos();
                            break;
                case 3: gi.removerArtigos();
                            break;
                case 4: gi.listaArtigos();
                            break;
                case 5: gf.addFornecedor(sc);
                            break;
                case 6: gf.listaFornecedores();
                            break;
                case 7: gf.top3Fornecedores();
                            break;
                default:
                    System.out.println("cala te");
                    break;
            }


        } while (op != 0);

    }

}
