public class acremote {
    int temp=16;
    boolean pressmode=false; 
    
    
    void pow(){
        if(pressmode==true){
            pressmode=false;
            temp=16;
            System.out.println("power is on");
        }
        else{
            pressmode=true;
            System.out.println("power is off");
        }
        //
        
        System.out.println("power "+pressmode);
    }

    void inctemp(){
        if(pressmode && temp<=30){
        temp=temp+1;
        System.out.println("temp is "+temp);
    }
    else{
        System.out.println("pow is off");
    }}

    void decremp(){
        if(pressmode && temp>=18){
        temp=temp-1;
        System.out.println("temp is "+temp);}
    
    else{
        System.out.println("pow is off");
    }}

    public static void main(String[] args) {
        acremote vjit=new acremote();
        vjit.inctemp();
        vjit.pow();
        vjit.inctemp();
        vjit.pow();
        vjit.decremp();
        vjit.pow();
        vjit.inctemp();
    }
}
