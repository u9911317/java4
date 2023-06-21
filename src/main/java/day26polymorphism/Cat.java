package day26polymorphism;

public class Cat extends Animal {

    public void meow() {
        System.out.println("Cats meow....");
    }

    @Override
    public void eat() {
      //Child daki override edilmis eat() methoduna "Overriding Method" denir
        System.out.println("Cats eat ..");
    }

    @Override//Override Annotation : Override kurallarinin java tarafindan kontrol edilmesini saglar
    public void drink() {
        System.out.println("Cats drink..");
    }

    @Override
    public Animal create() {
        return new Cat();
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public Integer multply(Integer a, Integer b) {
        return a*b;
    }

}




























