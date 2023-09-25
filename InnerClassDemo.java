import java.io.*;
class OuterClass
{
    static int Outer_x=10;
    int Outer_y=20;
    private int Outer_z=30;
    class InnerClass
    {
        void display()
        {
            System.out.println("Outer_x value is : "+Outer_x);
            System.out.println("Outer_y value is : "+Outer_y);
            System.out.println("Outer_z value is : "+Outer_z);
        }
    }
}
class InnerClassDemo
{
    public static void main(String args[])
    {
        OuterClass oc = new OuterClass();
        OuterClass.InnerClass ic=oc.new InnerClass();
        ic.display();
    }
}
