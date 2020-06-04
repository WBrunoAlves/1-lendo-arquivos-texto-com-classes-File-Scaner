import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		File file = new File("//home//wds//java-u//atividades//9-trabalhando-arquivos-java//"
				+ "1-lendo-arquivos-texto-com-classes-File-Scaner//in.txt");//cria o objeto do tipo FILE / com o caminho do arquivo
		Scanner sc =  null; // inicia o objeto sc com nulo
		
		try {
			sc = new Scanner(file);//instancia o objeto sc passando o file do Scanner
			while (sc.hasNextLine()) {//enquanto existir nextLine no arquivo...
				System.out.println(sc.nextLine()); // printe-o
				
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage() );//trata a excepção caso houver
		}
		finally {
			if (sc != null) {//dá continuidade ao código com o sc.close do Scanner
				sc.close();
			}
		}

	}

}
