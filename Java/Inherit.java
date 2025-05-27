class Animal{
    void makeSound(){
        System.out.println("I am an animal ");
    }
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("I am a dog Bark Bark !!");
    }
}
class Inherit{
    public static void main(String args[]){
        Animal a=new Animal();
        Dog d=new Dog();
        a.makeSound();
        d.makeSound();
    }
}