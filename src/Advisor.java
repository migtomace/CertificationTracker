import java.util.ArrayList;

public class Advisor {

    public static CertArray certArray = new CertArray();

    public static void createCerts(String certification){
        //check to see if cert already exists
        //add cert to list if does not exist
        if (!checkCert(certification)){
            Certification.certifications.add(certification);
            certArray.createCertArray(certification);
        }
    }

    public void deleteCerts(String certification){
        //if cert exists then delete
        for (String cert : Certification.certifications){
            if (cert == certification){
                Certification.certifications.remove(Certification.certifications.indexOf(cert));
                certArray.deleteCertArray(cert);
            }
        }
    }

    public void replaceCert(String cert, String newCert){
        //if cert exists replace with new cert
        for (String certification : Certification.certifications){
            if (certification == cert){
                Certification.certifications.set(Certification.certifications.indexOf(cert), newCert);
                certArray.deleteCertArray(cert);
                certArray.createCertArray(newCert);
            }
        }
    }

    public static boolean checkCert(String certification){
        //if cert exists return true
        boolean bool = false;
        for(String cert : Certification.certifications){
            if (cert == certification){
                bool = true;
            }
        }
        return bool;
    }


    public void addCertCourse(String cert, Course course){
        ArrayList<Course> list = certArray.map.get(cert);
        list.add(course);
    }

    public void removeCertCourse(String cert, Course course){
        ArrayList<Course> list = certArray.map.get(cert);
        list.remove(course);

    }

    public void replaceCertCourse(String cert, Course oldCourse, Course newCourse){
        ArrayList<Course> list = certArray.map.get(cert);
        for (Course course : list){
            if(course == oldCourse){
                int ind = list.indexOf(course);
                list.set(ind, newCourse);
            }
        }
    }

    public void clearAllCourses(String cert){
        ArrayList<Course> list = certArray.map.get(cert);
        list.clear();
    }



}
