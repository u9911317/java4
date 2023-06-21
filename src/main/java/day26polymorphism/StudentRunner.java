package day26polymorphism;

public class StudentRunner {

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.getStdId());
        System.out.println(s1.getNotOrt());
        System.out.println(s1.isSuccesful());


        s1.setNotOrt(4.99);
        System.out.println(s1.getNotOrt());

        System.out.println("**************");

        s1.setStdId("Mui387495958");
        s1.setNotOrt(4.99);
        s1.setSuccesful(true);
        System.out.println(s1.getNotOrt());
        System.out.println(s1.getStdId());
        System.out.println(s1.isSuccesful());


    }
}
