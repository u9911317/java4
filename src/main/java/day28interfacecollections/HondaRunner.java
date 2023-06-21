package day28interfacecollections;

public class HondaRunner {
    public static void main(String[] args) {
        Civic myCivic = new Civic();
        myCivic.cool(); //civic cool perfectly
        myCivic.run();
        myCivic.eco();

        Engine.stop();

        Accord myAccord = new Accord();
        myAccord.cool();//Accord cools super
        myAccord.run();//Engine runs super


        System.out.println("Ac Price  "+Ac.price);//2000
        System.out.println("Engine price "+Engine.price);//3000
        System.out.println("Securty price  "+Security.price);//5000






    }
}






