interface ATM{
     void balance();

}
 class kiran implements ATM{

    @Override
    public void balance() {
        System.out.println("Balance checked");
        
    }

}
class Coupling {
    public static void main(String[] args){
        ATM a=new kiran();
        a.balance();
    }
}
