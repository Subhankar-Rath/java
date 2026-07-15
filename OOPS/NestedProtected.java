public class NestedProtected {

    protected class Dog {
        void sound() {
            System.out.println("Dog is barking");
        }
    }

    class Pet extends NestedProtected {

        void show() {
            Dog d = new Dog();
            d.sound();
        }
    }

    public static void main(String args[]) {

        NestedProtected np = new NestedProtected();
        NestedProtected.Pet p = np.new Pet();

        p.show();
    }
}