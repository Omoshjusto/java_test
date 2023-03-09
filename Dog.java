
public class Dog {

    public Dog(String name, int size) {
        size = 27;
        name = "Fido";
        Dog myDog = new Dog(name, size);
        int x = size - 5;
        if (x<15) myDog.bark(8);
        
        

    }

    private void bark(int i) {
    }

}
