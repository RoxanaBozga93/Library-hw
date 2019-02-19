package sci;

public class ArtAlbum extends Book {

    private String calitateHartie;

    public String getCaliateHartie() {
        return calitateHartie;
    }

    public void setCaliateHartie(String caliateHartie) {
        this.calitateHartie = caliateHartie;
    }

    @Override
    public String toString()
    {
        return super.toString()+ ", calitate hartie: "+calitateHartie;
    }
}
