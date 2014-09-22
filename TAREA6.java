
public class TAREA6 {

	public static void main(String[] args) {
	}
	
		//Realizar la siguiente funcion recursiva
		//ejercicio1(n) = ejercicio1(n-1) + ejercicio1(n-2)
		//Dados los siguientes caso base
		//ejercicio1(0)=0
		//ejercicio1(1)=1
		static int ejercicio1(int n)
		{
			int resul;
	                if (n == 0)
	                { 
	                   resul = 0;
	                }
	                if (n == 1)
	                {
	                   resul = 1;
	                }else 
	                {
	                   resul = ejercicio1(n-1) + ejercicio1(n-2);
	                }
	  
	                return resul;
	       
		}
		
		
		//Realizar la siguiente funcion recursiva
		//ejercicio2(n) = ejercicio2(n-1) - ejercicio2(n-2)
		//Dados los siguientes caso base
		//ejercicio2(0)=2
		//ejercicio2(1)=3
		static int ejercicio2(int n)
		{
		        int resul;
	                if (n == 0)
	                { 
	                   resul = 2;
	                }
	                if (n == 1)
	                {
	                   resul = 3;
	                }else 
	                {
	                   resul = ejercicio2(n-1) - ejercicio2(n-2);
	                }
	  
	                return resul;
		}
		
		//Realizar la siguiente funcion recursiva
		//ejercicio3(n) = ejercicio3(n-1) * ejercicio3(n-2) - ejercicio3(n-2) + 12
		//Dados los siguientes caso base
		//ejercicio3(0)=0
		//ejercicio3(1)=1
		//ejercicio3(2)=2
		static int ejercicio3(int n)
		{
			int resul;
	                if (n == 0)
	                { 
	                   resul = 0;
	                }
	                if ( n == 1)
	                {
	                   resul = 1;
	                } if (n == 2)
	                {
	                   resul = 2;
	                                      }else 
	                {
	                   resul = ejercicio3(n-1) * ejercicio3(n-2) - ejercicio3(n-2) + 12;
	                }
	  
	                return resul; 

		
	}

}
