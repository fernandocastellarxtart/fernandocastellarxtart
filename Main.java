import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("INTRODUCE 3 NÚMEROS.");

int n1= 0;
int n2 = 0;
int n3 = 0;

for(int i=1;i<=3;i++){
    System.out.print("Introduce el número " +i+ ": ");
    if(i==1){
        n1 = sc.nextInt();
    } else if (i==2) {
        n2 = sc.nextInt();
    } else{
        n3 = sc.nextInt();
    }
}
/*
System.out.print("Introduce el primer número: ");
int n1 = sc.nextInt();

System.out.print("Introduce el segundo número: ");
int n2 = sc.nextInt();

System.out.print("Introduce el tercer número: ");
int n3 = sc.nextInt();
*/
if (n1 + n2 == n3)
    System.out.println("La suma de los 2 primeros números corresponden al 3er número.");
else
    System.out.println("La suma de los 2 primeros números no corresponden al 3er número.");



    }
}