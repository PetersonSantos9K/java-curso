package trabalhando_com_arquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program02 {

    static void main(String[] args) {

        String path = "/home/peterson/Documentos/CURSOS/Java-curso/Curso-Nelio-Alvez/src/trabalhando_com_arquivos/in.txt";


        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
