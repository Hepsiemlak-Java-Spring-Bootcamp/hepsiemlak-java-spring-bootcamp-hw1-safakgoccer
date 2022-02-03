public class Crocodile extends Walker implements Swim {
    public Crocodile(String name) {
        super(name);
    }




    @Override
    public void swim() {
        System.out.println(getName()+" can swim");
    }
}
