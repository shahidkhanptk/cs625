class Break2 {
public static void main (string args[])
throws java.io.IOException {
char ch;

for( ; ; ) {
ch=(cha)System.in.read();
if(ch=='q') break;
}
System.out.println(:You pressed q!");
}
}