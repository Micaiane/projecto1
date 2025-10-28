/*public class Primitivos{
public static void main(String[] args){
			int num1 = 10;
			int num2 = 5;
			int valor = (num1 + num2) / 2;
			
			System.out.println("O valor é: " + valor);
}
}

public class Primitivos{
	public static void main(String[] args){
		int num1 = 5;
		double num2 = 10.2;
	    String nome = "Ricardina Micaiane";
		
		System.out.println("Esse é o numero inteiro: " +num1);
		System.out.println("Esse é o double: " +num2);
		System.out.println("O meu nome é: " +nome);
		
	}
}

//Exemplo de um codigo simples usando switch case
public class Primitivos{
public static void main(String[] args){
		String Curso = "Java";
		switch (Curso){
			case "PHP":
			System.out.println("Bem vindo ao curso PHP");
			break;
				case "Python":
			System.out.println("Bem vindo ao curso Python");
			break;
				case "Java":
			System.out.println("Bem vindo ao curso Java");
			break;
			default:
			System.out.println("Invalido");
			
		}
	}
}

//Operadores de comparacao
public class Primitivos{
	public static void main(String[] args){
		int num1 = 20;
		int num2 = 2;
		
		System.out.println(num1 == num2); //Verificando se sao iguais
		System.out.println(num1 / num2); //fazendo a divisao
		System.out.println(num1 % num2); //Verificando o resto da divisao
		System.out.println(num1 > num2); //Verificando o maior numero
		System.out.println(num1 < num2); //Verificando o menor numero
		System.out.println(num1 <= num2); //Verificando o maior ou igual
		System.out.println(num1 >= num2); //Verificando o menor ou igual
		
	}
}

//Exemplo de codigo simples usando o For
public class Primitivos{
	public static void main(String[] args){
		
		for (int i = 0; i < 10; i++){
			System.out.println("O numero e " +i);
			i++;
		}
	}
}
import java.util.Scanner;
public class Primitivos{
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite o seu nome: ");
		String nome = scan.nextLine();

		Scanner scann = new Scanner (System.in);
		System.out.println("Digite a sua idade: ");
		int idade = scann.nextInt();
		System.out.println("Ola " + nome);
		System.out.println("A sua idade e " + idade);
		
		Scanner scannn = new Scanner (System.in);
		System.out.println("Digite o sua nota: ");
		
		
		Scanner valor = new Scanner (System.in);
		float n1 = valor.nextFloat();
		float n2 = valor.nextFloat();
		float n3 = valor.nextFloat();
		float media = (n1 + n2 + n3) / 3;
		System.out.println("O valor da media e " + media);
		if(media > 9){
			System.out.println("Parabens, voce foi aprovado");
		} else {
			System.out.println("Voce foi reprovado");
	}
}
}

public class Primitivos{
	public static void main(String[] args){
	double n1 = 1_2_34;
	System.out.print(+ n1);
	}
}

//2
public class Primitivos{
	public static void main(String[] args){
byte x = 5;
byte y = 10;
int z = x + y;
System.out.println(+z);
}
}
public class Primitivos{
	public static void main (String[] args){
		int x = 0;
		while(x++ < 10){}
		String message = x > 10 ? "Greater than" : false;
		System.out.println(message+","+x);
	}
}

//4
public class Primitivos{
	public static void main(String[] args){
		long x = 10;
		long y = 2 * x;
		System.out.println(+y);
}
}

//D-4
public class Primitivos {
    public static void main(String[] args) {
        long x = 10;
        int y = (int)(2 * x);
        System.out.println(+y);
    }
}
//B-4
public class Primitivos {
    public static void main(String[] args) {
        long x = 10;
        int y = 2 * (int)x;
        System.out.println(+y);
    }
}
public class Primitivos{
	public static void main(String[] args){
		java.util.List<Integer>
		list = new java.util.ArrayList<Integer>();
		list.add(10);
		list.add(14);
		for(int x : list){
			System.out.println(x + ", ");
			break;
		}
	}
}
 

//6
public class Primitivos{
	public static void main(String[] args){
		int x = 4;
		long y = x * 4 - x++;
		if (y<10) System.out.println("Too Low");
		else System.out.println("Just right");
	    else System.out.println("Too High");
	}
}


//7
public class Primitivos{
	public static void main(String[] args){
		int x = 5;
		System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);
	}
}
*/
//8

public class Primitivos{
	public static void main(String[] args){
		boolean x = true, z = true;
		int y = 20;
		x = (y != 10) ^ (z=false);
		System.out.println(x+", "+y+", "+z);
	}
}
/*
//9
public class Primitivos{
	public static void main(String[] args){
		for(int i=0; i<10;){
			i = i++;
			System.out.println("Hello");
		}
	}
}

//10

public class Primitivos{
	public static void main(String[] args){
		byte a = 40, b = 50;
		byte sum = (byte) a + b;
		System.out.println(sum);
	}
}

//11

public class Primitivos{
	public static void main(String[] args){
		int x = 5 * 4 % 3;
		System.out.println(x);
	}
}

//12
public class Primitivos{
	public static void main(String[] args){
		int x = 0;
		String s = null;
		if(x == s) System.out.println("Sucess");
		else System.out.println("Faiture");
	}
}
//13
public class Primitivos{
	public static void main (String[] args){
int x1 = 50, x2 = 75;
boolean b = x1 >= x2;
if (b = true) System.out.println("Sucess");
else System.out.println("Faiture");
	}
}

//14
public class Primitivos{
	public static void main (String[] args){
		int c = 7, result = 4;
		result += ++c;
		System.out.println(result);
	}
}

//15
public class Primitivos{
	public static void main (String[] args){
		int x = 1, y = 15;
		while (x < 10);
		y--;
		x++;
		System.out.println(+x", "+y);
	}
}


//16
public class Primitivos{
	public static void main (String[] args){
		
		
			do {
					int y = 1;
			System.out.println(y++ + " ");
		} while (y <= 10);
	}
}
/*
//17
public class Primitivos{
	public static void main (String[] args){
		boolean keepGoing = true;
		int result = 15, i = 10;
		do{
			i--;
			if(i==8) keepGoing = false;
			result -= 2;
		} while (keepGoing);
		System.out.println(result);
	}
}

//18
public class Primitivos{
	public static void main (String[] args){
		int count = 0;
		ROW_LOOP: for(int row = 1; row <=3; row++)
			for(int col = 1; col <=2; col++){
				if(row * col % 2 == 0) continue ROW_LOOP;
				count++;
			}
			System.out.println(count);
	}
}
//19
public class Primitivos{
	public static void main (String[] args){
		int m = 9, n = 1, x = 0;
		while(m > n){
			m--;
			n += 2;
			x =+ m + n;
		}
		System.out.println(x);
	}
}


//20
public class Primitivos{
	public static void main (String[] args){
		final char a = 'A', d = 'D';
		char grade = 'B';
		switch(grade){
			case a:
			case 'B': System.out.print("great");
			case 'C': System.out.print("good"); break;
			case d:
			case 'F': System.out.print("not good");
		}
	}
}
*/
