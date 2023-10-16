class A extends Thread
{
   public void run()
{
for(int i=1;i<=5;i++)
{
   System.out.println("\t form threadA: i= " +i);
}
System.out.println("Exit form A");
}
}
class B extends Thread
{
   public void run()
{
for(int j=1;j<=5;j++)
{
   System.out.println("\t form threadB: j= " +j);
}
System.out.println("Exit form B");
}
}
class C extends Thread
{
   public void run()
{
for(int k=1;k<=5;k++)
{
   System.out.println("\t form threadC: k= " +k);
}
System.out.println("Exit form C");
}
}
class threadtest
{
   public static void main(String args[ ])
    {
          new A().start();
	      new B().start();
	      new C().start();
}
}
