
/*@KIRAN RATHOD
Interface is nothing but whatever functionalites we want to implemented into our system/program then it can be declared into an interface
and then make a class implement all declared methods.


Interface supports multiple inheritance but classes don't support multiple inheritance
interfaeces can assure you that whatever functionality must be in our program can be included only by interfacing.

Class must implement all methods or functionality available in interface to which it implement.
 */


interface printer{
     String Name="Epson";
    void print();
    void scan();
}
/*
Above interface is converted by JVM at compiletime as:
interface printer
{
  public static final String Name;
  public abstract void print();
  public abstract void scan();
}
 */

interface scanner {
    void print();
}
/*
Above interface is converted by JVM at compiletime as:
interface scanner
{
  public abstract void print();
}
 */
class HPPrinter implements  scanner,printer{
    @Override
    public void print() {
        System.out.println("This is implemented inside hp");
    }

    @Override
    public void scan() {
        System.out.println("This is implemented inside hp");
    }

}
public class Interfaces  {

    public static void main(String arg[]){
        HPPrinter hp=new HPPrinter();
        hp.print();
        hp.scan();
        //if want to create object of interfaces or abstract classes then it can be done as follow:
        printer p=new printer() {
            @Override
            public void print() {
                System.out.println("This is implemented by printer interface obj");
            }

            @Override
            public void scan() {
                System.out.println("This is implemented by scanner interface obj");
            }
        };
        p.print();
        p.scan();

    }

}

