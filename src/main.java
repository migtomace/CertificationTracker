import java.util.ArrayList;

public class main {

    public static void main(String [] args){

        Certification programming = new Certification("Programming");
//
//        certifications.viewCerts();
//        System.out.println();
//
//        certifications.deleteCerts("Networking");
//
//        certifications.viewCerts();
//        System.out.println();
//
//        certifications.createCerts("Physics");
//
//        certifications.viewCerts();
//        System.out.println();
//
//        certifications.replaceCert("Mechanical Engineer", "Networking");
//
//        certifications.viewCerts();
//        System.out.println();


//        CertArray certArray = new CertArray();
//        Course course = new Course();
//        course.addCertCourse("Programming", "ITC155");
//        course.addCertCourse("Programming", "ITC162");
//        course.addCertCourse("Programming", "ITC255");
//        course.addCertCourse("Programming", "ITC230");
//        System.out.println(certArray.getCertArray("Programming"));

        CertArray certArray = new CertArray();
        ArrayList<Course> list = certArray.map.get("Programming");
        Course itc155 = new Course("Programming", "itc155", "12345", "BE3145");
        Course itc162 = new Course("Programming", "itc162", "12345", "BE3145");
        Course itc255 = new Course("Programming", "itc255", "12345", "BE3145");
        Course itc230 = new Course("Programming", "itc230", "12345", "BE3145");

        System.out.println(list);

        list.remove(itc155);
        System.out.println(list);
        User student1 = new User("Miguel", "Acevedo", "migtomace@gmail.com", "1234 main st", "2067999240", "1234567890", "Student");

        ArrayList<User> userList = User.userMap.get("Student");
        System.out.println(userList);
    }
}
