public class Music extends Article {
    private String player;
    private String format;

    public  Music (String co, String ti, int ye, boolean av, String pl, String fo){
        super(co, ti, ye, av);
        player = pl;
        format = fo;
    }
    public String getPlayer(){
        return player;
    }
    public  void setPlayer(String pl){
        player = pl;
    }
    public String getFormat(){
        return format;
    }
    public void setFormat(String fo){
        format = fo;
    }
    public String toString(){
        return "Code: " + code + "/nTitle: " + title + "/nYear: " + year + "/nAvailability: " + available + "/nPlayer: "+ player +"/nFormat: " + format;
    }
}
