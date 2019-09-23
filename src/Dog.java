public class Dog extends Animal{

    public Dog() {
        super();
        System.out.println("Every Dog has it's day");
    }

    @Override
    public String sleep() {
        return "A dog also sleeps";
    }

    @Override
    public String eat() {
        return "A dog eats too";
    }

    public String bark() {
        return "woof! woof!!";
    }
}
