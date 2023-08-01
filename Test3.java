public class Test3 {
    int a=10;
    static int b =20;
    
    public static void main(String[] args) {
        int c=30;

        Test obj1 =new Test();
        Test obj2=new Test(); 
        
        System.out.println(obj1.a);
        System.out.println(obj2.a);
       
        System.out.println(obj1.b);
        System.out.println(obj2.b);
        System.out.println(Test.b);
        System.out.println(b);
        System.out.println(c);


    }
}
