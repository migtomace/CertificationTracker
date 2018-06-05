import java.util.ArrayList;
import java.util.Iterator;

public class Certification {


    private String title;
    public static ArrayList<String> certifications = new ArrayList<>();


    public Certification(String title){
        this.title = title;
        if(!Advisor.certArray.checkCertArray(title)){
            Advisor.createCerts(title);
        }
    }

    public String toString(){
        return this.title;
    }

}
