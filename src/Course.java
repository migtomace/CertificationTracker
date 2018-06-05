import java.util.ArrayList;

public class Course {

    private String id;
    private String title;
    private String roomNumber;

    CertArray certArray = new CertArray();


    public Course(String cert, String title, String id, String roomNumber){
        this.title = title;
        this.id = id;
        this.roomNumber = roomNumber;
    }

    public String toString(){
        return this.title;
    }


}
