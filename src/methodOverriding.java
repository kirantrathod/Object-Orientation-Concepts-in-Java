/* @KIRAN RATHOD
In method Overriding method is created in sub-class having same name,return type and
sequence of arguments(paramters) of superclass(parentclass) for better behaviour
======================NOTE:==========================
IF WHILE METHOD OVERRIDING,WE CHANGED THE RETURN TYPE OR CHANGED THE PARAMETER LIST
OR SEQUENCE OF PARAMETERS THEN IT WILL BE CASE
OF METHOD OVERLOADING.
=====================================================
while overriding method there is one term called 'UPCASTING'(Upcasting means JVM will undergo 'Dynamic method Dispatch')
 i.e.===>> ParentclassReference pcr=new ChildClassObject();
e.g
        class Animal{
        public void show(){}
        }
        class Dog extends Animal{
        @overrride   // it is optional to write
        public void show(){}
        }
        class main(){
        public static void main(String args[]){

        Animal a=new Animal();
        Dog d=new Dog()
        Animal a1=new Dog();  ////////////  IT IS CALLED 'UPCASTNG' (viceversa of it is not allowed i.e.  'Dog d1=new Animal()')
        a.show();           //      Goes to Animal class's show()
        d.show();           // goes to Dogs class's show()
        a1.show();          /////////////////HERE REFERENCE IS OF ANIMAL CLASS BUT IT IS INITIALIZED AS CLASS DOG,
                            /////////////////HENCE IT WILL REFER TO DOG'S SHOW()
         }
        }
 */
 class Game
{
     public void type()
    {  System.out.println("Indoor & outdoor"); }
}

class Cricket extends Game {
    @Override                 //@override is not complusary to write for overridding method.
                                // it is only to notify that method is getting overridding.
    public void type() {
        System.out.println("outdoor game");
    }

}
public class methodOverriding{

        public static void main(String[] args)
        {
        Game gm = new Game();
        Cricket ck = new Cricket();
        gm.type();
        ck.type();
        gm=ck;      //gm refers to Cricket object
        gm.type();  //calls Cricket's version of type
        }
        }

