interface Animal{

 void sound();
 default void sleep(){
     System.out.println("sleep");
 }
 default void eat(){
     System.out.println("eat");
 }


}

class Bird implements Animal{
    public void sound(){
        System.out.println("Tweet Tweet");
    }
}
class Cow implements Animal{
    public void sound(){
        System.out.println("Moo Moo");
    }
}




class Application {
    public static void main(String[] args) {

        Animal bird = new Bird();
        Animal cow = new Cow();

        bird.sound();
        bird.eat();
        bird.sleep();
        cow.sound();
        cow.eat();
        cow.sleep();

        }
    }
