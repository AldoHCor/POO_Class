import java.util.Scanner;

public class Main {
    public Main(){}
    public static void menu(){
        System.out.println("Menu");
        System.out.println("1. Crear catalogo.");
        System.out.println("2. Borrar entrada por codigo.");
        System.out.println("3. Mostrar entradas de un autor.");
        System.out.println("4. Salir.");
    }

    public static void main(String[] args){

        int opc1, opc2;
        String co, ti;
        int ye;
        boolean av;
        String pl, fo;
        String au, pa;

        Scanner keyboard = new Scanner(System.in);
        Catalog MyCatalog = new Catalog();

        do {
            menu();
            opc1 = keyboard.nextInt();

            switch (opc1) {
                case 1:
                    System.out.println("1. libro \n2. Musica");
                    opc2 = keyboard.nextInt();

                    if (opc2 == 1) {

                        System.out.println("\tLibro");
                        System.out.println("Codigo: ");
                        co = keyboard.nextLine();
                        System.out.println("Titulo: ");
                        ti = keyboard.nextLine();
                        System.out.println("Año: ");
                        ye = keyboard.nextInt();
                        System.out.println("Disponible: ");
                        av = keyboard.nextBoolean();
                        System.out.println("Autor: ");
                        au = keyboard.nextLine();
                        System.out.println("Numero de paginas: ");
                        pa = keyboard.nextLine();

                        Article MyBook = new Book(co, ti, ye, av, au, pa);
                        MyCatalog.addArticle(MyBook);
                    }

                    if (opc2 == 2) {

                        System.out.println("\tMusica");
                        System.out.println("codigo: ");
                        co = keyboard.nextLine();
                        System.out.println("Titulo: ");
                        ti = keyboard.nextLine();
                        System.out.println("Año: ");
                        ye = keyboard.nextInt();
                        System.out.println("Disponibilidad: ");
                        av = keyboard.nextBoolean();
                        System.out.println("Interprete: ");
                        pl = keyboard.nextLine();
                        System.out.println("Formato: ");
                        fo = keyboard.nextLine();

                        Article MyMusic = new Music(co, ti, ye, av, pl, fo);
                        MyCatalog.addArticle(MyMusic);
                        break;
                    }

                case 2:

                    System.out.println("Codigo del articulo a borrar ");
                    co = keyboard.nextLine();
                    MyCatalog.eraseArticle(co);
                    break;

                case 3:

                    System.out.println("Nombre del author: ");
                    au = keyboard.nextLine();
                    MyCatalog.showAuthor(au);

            }
        } while (opc1 != 4);
    }
}