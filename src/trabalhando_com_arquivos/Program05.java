package trabalhando_com_arquivos;

import java.io.File;
import java.util.Scanner;

public class Program05 {

    static void main(String[] args) {
        // -> /home/peterson/Documentos/CURSOS/Java-curso/Curso-Nelio-Alvez/src/trabalhando_com_arquivos/in.txt
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath.trim());

        System.out.println("getName: " + path.getName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getPath: " + path.getPath());


        sc.close();
    }
}
