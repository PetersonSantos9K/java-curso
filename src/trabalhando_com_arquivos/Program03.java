package trabalhando_com_arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program03 {

    static void main(String[] args) {

        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
        String path = "/home/peterson/Documentos/CURSOS/Java-curso/Curso-Nelio-Alvez/src/trabalhando_com_arquivos/out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){

            for(String line : lines){
                bw.write(line);
                bw.newLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
