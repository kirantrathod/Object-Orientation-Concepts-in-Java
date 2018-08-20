class person{
    String Name;

    person(){
        this("kiran");
    }
    person(String Name){
        this.Name=Name;

    }
}
class Address{
    String houseNo;

}
public class useOfSuperAndThisKeyword extends person{
     static Address add;
     //Costructor
    public useOfSuperAndThisKeyword()
    {

    }
    //Paramertiezed constructor
   public useOfSuperAndThisKeyword(String Name){
        super(Name);

    }
    //parameterized constructor
    public useOfSuperAndThisKeyword(int key){
        this();
    }
    //main method
    public static void main(String arg[]){
        useOfSuperAndThisKeyword u=new useOfSuperAndThisKeyword(21);
        //Use of 'instanceof' =================
        boolean result=u instanceof Object;
        //by using 'instanceof' we can get boolean value as true or false
        //As we know every class has super class names 'Object'.
        // there we can check whether subclass is a instance of superclass and of Object class
        System.out.println("result is:"+result);

        //===========Aggregatio===================
        add.houseNo="12/545";


    }
}


/*
In Constructor there is always a super keyword invoked by JVM when that class has parent class.
If there is no "this' keyword then compiler puts it by itself to goto another constructor withing same class.
But if it want to goto parent class's constructor then compiler puts 'super' keyword at first line of constructor.





NOTE----IN EACH CONSTRUCTOR THERE IS PLACEMENT OF 'this' or 'super'.
 */
