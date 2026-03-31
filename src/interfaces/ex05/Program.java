package interfaces.ex05;

import interfaces.ex05.model.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        String path = "/home/peterson/Documentos/CURSOS/Java-curso/Curso-Nelio-Alvez/src/interfaces/ex05/in.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String employeeCsv = br.readLine();
            while(employeeCsv != null){

                String[] value = employeeCsv.split(",");
                list.add(new Employee(value[0], Double.parseDouble(value[1])));

                employeeCsv = br.readLine();
            }

            Collections.sort(list);
            for(Employee s : list){
                System.out.println(s.getName() + ", " + s.getSalary());
            }



        } catch (IOException error){
            error.fillInStackTrace();
            System.out.println(error.getMessage());
        }

    }
}
