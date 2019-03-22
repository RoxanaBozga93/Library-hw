/**
 * Drama extinde clasa Book
 * @author Roxana Bozga
 */
package sci;

public class Science extends Book {
    private String domeniu;

    public String getDomeniu() {
        return domeniu;
    }

    public void setDomeniu(String domeniu) {
        this.domeniu=domeniu;
    }

    @Override
    public String toString()
    {
        return super.toString()+ ", domeniu: "+domeniu;
    }

}
