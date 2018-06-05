import javax.print.attribute.HashAttributeSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class User {

    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phoneNumber;
    private String password;
    private String position;

    public static HashMap<String, ArrayList<User>> userMap = new HashMap<>();
    public static ArrayList<User> userArrayList = new ArrayList<>();



    public User(String fn, String ln, String e, String a, String pn, String lp, String pos){
        this.setFirstName(fn);
        this.setLastName(ln);
        this.setEmail(e);
        this.setAddress(a);
        this.setPhoneNumber(pn);
        this.setLoginPassword(lp);
        this.setPosition(pos);
        userMap.forEach((key, value) -> {
            if (key != pos){
                userMap.put(pos, userArrayList);
            }
        });
        if (!checkUser(pos, e)){
            userMap.get(pos).add(this);
        }
    }

    //check that user doesn't already exist
    public boolean checkUser(String position, String email){
        AtomicBoolean bool = new AtomicBoolean(false);
        userMap.forEach((key, value) -> {
            if(key == position){
                for(User user : userMap.get(key)){
                    if(user.email == email){
                        bool.set(true);
                    }
                }
            }
        });
        return bool.get();
    }

    public void viewCerts(){
        for(String cert : Certification.certifications){
            System.out.println(cert);
        }
    }

    private void setPosition(String position) {
        this.position = position;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setLoginPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString(){

        return this.lastName + ", " + this.firstName;
    }
}
