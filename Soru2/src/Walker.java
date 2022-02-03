public class Walker extends Animal {
    public Walker(String name) {
        super(name);
    }
    public void walk(){
        System.out.println(this.getName()+" can walk");
    }

}
