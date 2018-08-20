
/*@KIRAN RATHOD
In abstraction,a class is declared abstract using 'abstract' keyword.
If a class is declared as abstract,then there is no explicit need to have all methods to be abstract.
But in any class if we declare method as abstract then that class must be declared as abstract,otherwise we will
get  ompilation error.

If a method is declared as abstract then there is no need of defining method,just declare method and
if you want to implement/define that abstract method then we have to create a sub-class which extend that abstract class and then
only can implement that method in sub-class.


MOST IMPORTANT:::
1)Object of abstract class cannot be created.if we want to create object of abstract class then we have create
   a sub-class which extends this abstract class then by creating refrence variable which will point to object of sub-class.
   e.g.
      abstract class Test
      {
      abstract void show();
      }
      class child extends Test{
      void show(){}
      }
      class main()
      {
      public static void main(String[] arg)
      {
      Test t=new child()        ////////////// this is called UPCASTING.
      t.show();
      }
     }


2)Abstraction is a combination of upcasting and method overriding to abstract method's implementation(polymorphism).


 */

abstract class abstractClass{
/*
    abstractClass(){
        System.out.println("Inside Abstractclass's constructor");
    }
*/
    abstract void show();
    public int add(int a,int b){
        return a+b;
    }
    }
class childClass extends abstractClass{
    childClass(){
        System.out.println("chilld's constructor");
    }
    @Override
    void show() {
        System.out.println("This is from child overrided method");
    }

}

public class Abstraction {
public static void main(String[] agrs){
    abstractClass ab=new childClass();
   int add= ab.add(12,21);
   System.out.println("addition is:"+add);
    ab.show();
}
}
