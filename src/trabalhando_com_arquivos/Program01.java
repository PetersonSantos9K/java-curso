package trabalhando_com_arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program01 {

    static void main(String[] args) {

        File file = new File("/home/peterson/Documentos/CURSOS/Java-curso/Curso-Nelio-Alvez/src/trabalhando_com_arquivos/in.txt");

        Scanner sc = null;

        try{
            sc = new Scanner(file);

            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage() );
        } finally {
            if(sc != null) sc.close();
        }


    }

}
