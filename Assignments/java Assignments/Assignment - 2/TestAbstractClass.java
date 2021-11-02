class DriverMain
{
    public static void main(String[] args) {
        //    below line will show you an error , because abstract class cannot be instantiate.

        //    TestAbstractClass tc = new TestAbstractClass();


    }
}
public abstract class TestAbstractClass {

    //  class should also be abstract if you have any abstract method in it,
    //  otherwise it will show you an error.
    // an abstract class cannot be private and final .

    public abstract void sayHello(String name);


}

class SubclassOfTest extends TestAbstractClass{

    // if you extends any abstract class then you have to implement all its methods to the sub class.

    @Override
    public void sayHello(String name) {
        System.out.println("Helllo "+ name);
    }
}

abstract class NoMethodIsAbstract{

    public void say(){
        System.out.println("An abstract Class with no abstract method.");
    }
}


