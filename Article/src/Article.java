public class Article {
    protected String code, title;
    protected int year;
    protected boolean available;

    public Article () {
        code = title = "";
        year = 0;
        available = false;
    }
    public Article (String co, String ti, int ye, boolean av){
        code = co;
        title = ti;
        year = ye;
        available = av;
    }
    public String getCode(){
        return code;
    }
    public void setCode(String co){
        code = co;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String ti){
        title = ti;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int ye){
        year = ye;
    }
    public boolean isAvailable(){
        return available;
    }
    public void setAvailable(boolean av){
        available = av;
    }
    // equals obj return boolean
    public String toString(){
        return "Code: " + code + "/nTitle: " + title + "/nYear: " + year + "/nAvailability: "+ available ;
    }
}
