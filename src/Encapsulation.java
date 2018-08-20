class Secret{
   private String Name;
  private   int rollNo;
   private String girlFriendName="Not Yet";
   public String getName(){
       return this.Name;
   }
   public void setName(String Name){

           this.Name=Name;

   }
    public String getGirlFriendName(){

            return this.girlFriendName;

    }
    public void setGirlFriendName(String girlFriendName){

        if(girlFriendName!="ABC"){
            this.girlFriendName=girlFriendName;
        }
        else{
            System.out.println("You have wrong information about "+getName());
        }
    }
    public int getRollNo(){
        return this.rollNo;
    }
    public void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }
}
class Encapsulation {
    public static void main(String args[]){
    Secret sc=new Secret();
    sc.setName("kiran");
    sc.setGirlFriendName("ABC");
    sc.setRollNo(15141246);
    System.out.println(sc.getName()+ "'s GF which is supposed to be:"+sc.getGirlFriendName()+"\nhis roll no is:"+sc.getRollNo());

    }

}


/*
ENCAPSULATION is the important feature of object orientation in which we can control how the bahavior of class members/variables according to
our convinence.
e.g.
    Let assume you have created a class and that class is getting used by all your colleages in office,but you don't like how they are using your created class
    variables.then if we want to change code the we have to change code either of that colleages or your class.


   Lets make it simple..........Assume I have created a class in which name of girl friend is shown and assigned by users.But I don't want to
   people assign any other girl name which i don't like so i can restrict access to direct access to girlfriend variable by making it private
   and making that avriable accessible only through methos such as setGirlFriendNamr annd getGirlFriendName which we declare public.
 */
