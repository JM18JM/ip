package app;
import java.util.Scanner;

import classes.User;

public class Main {
        public static GestaoFornecedores gf;
        public static Scanner sc;
        public static GestaoInventario gi;
        public static GestaoUser gu;



        public static void main(String[] args) {
            sc = new Scanner(System.in);
            gf = new GestaoFornecedores();
            gi = new GestaoInventario();
            gu = new GestaoUser();

            menuLogin();

        }


        public static void menuLogin(){
            int op;
            User u = null;

            do{
                System.out.println("Login");
                System.out.println("Escolha uma opção:");
                System.out.println("1 - Login");
                System.out.println("2 - Registar utilizador");
                System.out.println("0 - Sair");

                op = Integer.parseInt(sc.nextLine());
                switch(op){
                    case 1: //fazer o login
                            break;
                    case 2: //fazer o registo
                            break;
                    case 0: System.out.println("A sair.");
                        break;
                    default: System.out.println("Operação inválida.");
                }




            } while(op != 0);

        }



        public static void MenuPrincipal(User u){
            int op;
            do{
                
                System.out.println("OptiStock - O Melhor amigo de qualquer gestor de stock!");
                System.out.println("Bem-Vindo ao Menu da OptiStock");
                System.out.println("1 - Menu de Gestão de Utilizador.");
                System.out.println("2 - Menu de Gestão de Inventário.");
                System.out.println("3 - Menu de Gestão de Fornecedores");
                System.out.println("0 - Sair.");
                op = Integer.parseInt(sc.nextLine());

                switch(op){
                    case 1: MenuUtilizadores(u);
                    break;
                    case 2: MenuInventario(u);
                    break;
                    case 3: MenuFornecedores(u);
                    break;

                    case 0: System.out.println("A sair.");
                    break;
                    default: System.out.println("Selecione uma opção válida.");
                    break;
                }

            }while(op!=0);
        }

        public static void MenuUtilizadores(User u){
            int op;
            do{
                System.out.println("OptiStock - O Melhor amigo de qualquer gestor de stock!");
                System.out.println("Bem-Vindo ao Menu da OptiStock");
                System.out.println("1 - Alterar username");
                System.out.println("2 - Alterar password");
                System.out.println("3 - Cancelar conta");
                System.out.println("4 - Listar minha informação");
                System.out.println("5 - Menu de administração...");
                System.out.println("0 - Sair");

                op = Integer.parseInt(sc.nextLine());
                switch(op){
                case 1: //alterar user
                        break;
                case 2: //alterar pass
                        break;
                case 3: //cancelar conta / remover
                        break;
                case 4: //listar informação
                        break;
                case 5: // menu admin
                        break;
                case 0: System.out.println("A Sair.");
                        break;
                default: System.out.println("Selecione uma opção válida.");
                        break;
                }
            }while(op!=0);
        }

        public static void MenuInventario(User u){
            int op;
            do{
                System.out.println("OptiStock - O Melhor amigo de qualquer gestor de stock!");
                System.out.println("Bem-Vindo ao Menu da OptiStock");
                System.out.println("1 - Criar um novo Stock");
                System.out.println("2 - Alterar o stock");
                System.out.println("3 - Remover Stock");
                System.out.println("4 - Listar o stock");
                System.out.println("5 - Verificar o profit");
                System.out.println("6 - Fazer o Custo Médio Ponderado");
                System.out.println("7 - Alterar a moeda de um preço");
                System.out.println("8 - Listar o valor de inventário.");
                System.out.println("9 - Listar o stock em minoria.");
                System.out.println("0 - A Sair.");

                op = Integer.parseInt(sc.nextLine());

                switch(op){
                    case 1  : gi.addArtigo(sc, gf);
                            break;
                    case 2: gi.alterarArtigos();
                            break;
                    case 3: gi.removerArtigos();
                            break;
                    case 4: gi.listaArtigos();
                            break;
                    case 5: gi.profitArtigos();
                            break;
                    case 6: gi.cmpArtigos();
                            break;
                    case 7: //alterar moeda
                            break;
                    case 8: gi.valorInventário();
                            break;
                    case 9: //listar o stock em minoria
                            break;
                    case 0: System.out.println("A sair.");
                            break;
                    default: System.out.println("Opção inválida.");
                            break;
                }
            }while(op!=0);
        }


        public static void MenuFornecedores(User u){

            int op;
            do{
                System.out.println("OptiStock - O Melhor amigo de qualquer gestor de stock!");
                System.out.println("Bem-Vindo ao Menu da OptiStock");
                System.out.println("1 - Adicionar um novo fornecedor");
                System.out.println("2 - Listar os dados de um fornecedor");
                System.out.println("3 - Remover um fornecedor");
                System.out.println("4 - Atualizar os dados de um fornecedor.");
                System.out.println("5 - Listar fornecedores sem artigos.");
                System.out.println("6 - Listar o top 3 de fornecedores com mais artigos");
                System.out.println("7 - Listar fornecedores com artigos em baixo");
                System.out.println("8 - Listar a informação de um artigo fornecido pelo este mesmo.");
                System.out.println("0 - Sair");

                op = Integer.parseInt(sc.nextLine());

                switch(op){
                    case 1: gf.addFornecedor(sc);
                        break;
                    case 2: gf.removeFornecedor();
                        break;
                    case 3: gf.listaFornecedores();
                        break;
                    case 4: gf.updFornecedor();
                        break;
                    case 5: gf.listaFornecedorNoArtigo();
                        break;
                    case 6: gf.top3Fornecedores();
                        break;
                    case 7: gf.listaFornecedorArtigoBaixo();
                        break;
                    case 8: //listar informação de um artigo fornecido por este mesmo.
                        break;
                    case 0: System.out.println("A sair.");
                        break;
                    default: System.out.println("Opção inválida.");
                        break;





                }

            }while(op!=0);
            
        }
}


