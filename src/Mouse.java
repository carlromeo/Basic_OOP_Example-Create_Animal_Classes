public class Mouse extends Animal {

        public Mouse() {
        super();
        System.out.println("NOT to be confused with a rat,");
    }
      @Override
    public String eat() {
        return "A mouse eats anything!";
    }
        @Override
        public String sleep() {
            return "They are nocturnal so, they do not sleep at night";
    }
    public String poor() {
        return "The ones that live in churches are very poor";
    }
}

