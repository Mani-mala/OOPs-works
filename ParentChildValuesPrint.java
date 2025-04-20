public class ParentChildValuesPrint {
    public static void main(String[] args)
    {
        Child obj=new Child();
        obj.display();
    }
}
class Parent{
    int a=10;
}
class Child extends Parent{
    int a=5;
    void display()
    {
        System.out.println("Child class a : "+a);
        System.out.println("Parent class a : "+super.a);
    }
}
