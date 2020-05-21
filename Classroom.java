

public class Classroom {

    public static void main(String[] args) {

        // riri receives a reference to a new instance of the Duck class
        Wilder w1 = new Wilder("JCVD", true); 
        Wilder w2 = new Wilder("jules", false); 
        
        System.out.println(w1.whoAmI());
        System.out.println(w2.whoAmI());
           
    }
}
