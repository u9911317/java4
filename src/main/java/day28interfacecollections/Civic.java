package day28interfacecollections;

public class Civic implements Ac,Engine,Security {
    @Override
    public void cool() {
        System.out.println("civic cool perfectly");
    }

    @Override
    public void run() {
        System.out.println("Ac runs super");

    }
    //Interface







}
