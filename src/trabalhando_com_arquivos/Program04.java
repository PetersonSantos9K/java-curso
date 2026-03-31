package trabalhando_com_arquivos;

import java.io.File;
import java.util.Scanner;

public class Program04 {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        // -> /home/peterson/Documentos/CURSOS/Java-curso/Curso-Nelio-Alvez/src
        File path = new File(strPath.trim());
        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("FOLDERS:");
        for (File folder : folders){
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        for(File file : files){
            System.out.println(file);
        }

        boolean success = new File(strPath.trim() + "//program04CriaçãoPastaTest").mkdir();
        System.out.println("Directory creater of sucessfully: " + success);

        sc.close();
    }
}
