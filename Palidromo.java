import java.util.Scanner;

public class Palidromo 
{
	public static void main(String[] args) {
	    
	     Scanner sc = new Scanner (System.in);
	     
	   System.out.println("Insira um valor :");
	    int a = sc.nextInt();
	    
	  if(a < 0 ){
	      System.out.println("Não é um palidromo");
	  }
	  
	  int original = a;
	  int invertido = 0;
	  
	  while( a > 0){
	      int digito = a % 10;
	       invertido = invertido * 10 + digito;
	      a = a / 10;
	  }
	 
	  if (original == invertido){
	      System.out.println("É um Palidromo");
	  }
	 
	   else{
	       System.out.println("Não é um Palidromo");
	   }
	}
}