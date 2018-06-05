import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class CertArray {

    public static HashMap<String, ArrayList<Course>> map = new HashMap<>();
    public static ArrayList<Course> getArray;

    public void createCertArray(String certification){
        ArrayList<Course> certArray = new ArrayList<>();
        map.put(certification, certArray);
    }

    public void deleteCertArray(String certification){
        map.forEach((key, value) -> {
            if (key == certification){
                map.remove(key, value);
            }
        });
    }

    public boolean checkCertArray(String certification){
        AtomicBoolean bool = new AtomicBoolean(false);
        map.forEach((key, value) -> {
            if (key == certification){
                bool.set(true);
            }
        });

        return bool.get();
    }

    public static ArrayList<Course> getCertArray(String certification){

        map.forEach((key, value) -> {
            if (key == certification){
                getArray = value;
            }
        });
        return getArray;
    }

//    public String toString(){
//        String result = "[ ";
//        for (Course course : map.get("Programming")){
//            result += course.toString() + ", ";
//        }
//        result += "]";
//        return result;
//    }


}
