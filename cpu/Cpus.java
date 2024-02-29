import java.util.Scanner;
class Cpu{
int price=123456;
class Prosessor{
int nocores=4;
String mf="intel core";
void display(){
 System.out.println("\n No of cores= " +nocores);
 System.out.println("Manufactures= " +mf);
 }
}
void display(){
Prosessor p = new Prosessor();
p.display();
System.out.println("Price= " +price);
}
static class Ram{
int memory=8;
String mnf="meta";
void display(){
System.out.println("Memory= " +memory);
System.out.println("manufacture= " +mnf);
}
}
}
class Cpus{

public static void main(String[] args)
{
Cpu c1 = new Cpu();
c1.display();
Cpu.Ram r1 = new Cpu.Ram();
r1.display();
}}
