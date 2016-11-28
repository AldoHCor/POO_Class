public class Book extends Article{
    private String author;
    private String page_num;

    public  Book (String co, String ti, int ye, boolean av, String au, String pa){
        super(co, ti, ye, av);
        author = au;
        page_num = pa;
    }
    public String getAuthor(){

        return author;
    }
    public void setAuthor(String au){
        author = au;
    }
    public String getPage_num(){
        return page_num;
    }
    public void  setPage_num(String pa){
        page_num = pa;
    }
    public String toString(){
        return "Code: " + code + "/nTitle: " + title + "/nYear: " + year + "/nAvailability: " + available + "/nAutor: " + author + "/nNum pages: " + page_num;
    }


}