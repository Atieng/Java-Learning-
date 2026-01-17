public class Main{
    // Static Method
    static void myMethod(){
        System.out.println("Jmabo");
    }
    // Public Method
    
    public void myPublicMethod(){
        System.out.println("Public methods");
    }
    
    public static void main(String[] args)
    {
        myMethod();
        Main myObj= new Main();
        myObj.myPublicMethod();
    }
}