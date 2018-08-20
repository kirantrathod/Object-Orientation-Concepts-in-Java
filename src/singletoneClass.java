class singleTone{
    int a,b;
    private static singleTone instance;
    private singleTone(){
        a=23;
        b=45;
    }
    public static singleTone getInstance(){
        if(instance==null){
            instance=new singleTone();
        }
        return instance;
    }


    public int add(int a,int b){
       return a+b;
    }
}
public class singletoneClass {
    public static void main(String[] args){
        System.out.println("Instance:"+singleTone.getInstance());
        singleTone singleToneInstance=singleTone.getInstance();
        int c=singleToneInstance.add(12,56);
        System.out.println("Sum :"+c);
        //singleTone singleTone=new singleTone();  =========================>> We cannot create more than one object of singletone classs
                                                                               // as constructor of singletone class declared as private to restrict
                                                                                // creation of second object.
    }
}
