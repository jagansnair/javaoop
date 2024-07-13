import java.io.*;
class readfile2{
public static void main(String [] args){
FileInputStream f=new FileInputStream("numbers.txt");
FileOutputStream f2=new FileOutputStream("odd.txt");
FileOutputStream f3=new FileOutputStream("even.txt");
int c;
while((c=f.read()!=-1)
{
if(c%2==0){
f3.write(c);
}
else
{
f2.write(c);
}
System.out.println((char)c);
}
f.close();
f2.close();
f3.close();
System.out.println("Contents of odd.txt :");
try(FileInputStream oddfile=new FileInputStream("odd.txt")){
while(c=oddfile.read())!=-1){
System.out.println((char)c);
}
}
System.out.println("Contents of even.txt :");
try(FileInputStream evenfile=new FileInputStream("even.txt")){
while(c=evenfile.read())!=-1){
System.out.println((char)c);
}
}
