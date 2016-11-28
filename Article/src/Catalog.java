public class Catalog  extends Article{
     private int index;
     private Article articles[];
    private int size = 10;

    public Catalog (){
        index = 0;
        articles = new Article[size];
        for (int  i = 0; i < size; i++)
            articles[i] = null;
    }

    public void addArticle(Article art) {
        if (index < size) {
            articles[index] = art;
            index++;
        } else
            System.out.println("No se puede agregar");
    }

    public void eraseArticle (String cod){
        int i = 0, j = 0;
        boolean enc = false;

        while (i < size && !enc){
            if (getCode().equals(cod)){
                enc = true;
                j = i;
            }
            i ++;
            if (enc){
                for ( i = j ; i < 49 ; i++)
                    articles[i] = articles[i+1];
            }
            else
                System.out.println("Articulo no encontrado");
        }
    }

    public void showAuthor(String aut){
        int i;

        for (i = 0; i < size; i++){

            if (articles[i] instanceof Book){
                Book aux1 = (Book)articles[i];

                if (aux1.getAuthor().equals(aut) ) {
                    System.out.println(aux1.toString());
                    i++;
                }
            }
        }
    }

}