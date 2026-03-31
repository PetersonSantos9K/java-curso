package trabalhando_com_arquivos.exercicio;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio {


    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // -> /home/peterson/Documentos/CURSOS/Java-curso/Curso-Nelio-Alvez/src/trabalhando_com_arquivos/exercicio/itensVendidos.csv
        System.out.println("Escreva o caminho do arquivo que deseja adicionar os itens: ");
        String path = sc.next();

        receberArquivos(sc, path);

        criarArquivosSomaItens(path);



        sc.close();

    }

    private static void receberArquivos(Scanner sc, String path){

        System.out.println("Quantos produtos deseja adicionar: ");
        int quantidadeParaAdicinar = sc.nextInt();
        if (quantidadeParaAdicinar < 1) {
            System.out.println("Quantidade invalida: a quantidade precisa ser maior que 0.");
            return;
        }

        Produto[] produtos = new Produto[quantidadeParaAdicinar];

        for(int i=0; i<quantidadeParaAdicinar; i++){

            System.out.println("Adicionar Itens: ");
            sc.nextLine();
            System.out.println("Nome: ");
            String nome = sc.nextLine();



            System.out.println("preco: ");
            double preco = sc.nextDouble();

            System.out.println("Quantidade: ");
            int quantidade = sc.nextInt();
            produtos[i] = new Produto(nome, preco, quantidade);
        }


        criarArquivoProduto(path, produtos);
    }

    private static void criarArquivoProduto(String path, Produto[] itensVendidos){

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){

            for(Produto itensVendido : itensVendidos){
                bw.write(itensVendido.nome()+","+itensVendido.preco()+","+itensVendido.quantidade());
                bw.newLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static List<ProdutoSoma> lerArquivosCriadosProdutos(String path) {

        List<ProdutoSoma> produtoSomas = new LinkedList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while (line != null){

                String[] valores = line.split(",");
                String nome = valores[0];
                double preco = Double.parseDouble(valores[1]);
                int quantidade = Integer.parseInt(valores[2]);
                Double soma = preco * quantidade;
                String somaFormatada = String.format(Locale.US, "%.2f", soma);
                produtoSomas.add(new ProdutoSoma(nome, Double.valueOf(somaFormatada)));

                line = br.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return produtoSomas;
    }

    private static void criarArquivosSomaItens(String path){

        File pathFile = new File(path);
        String newPath = pathFile.getParent() + "/out";

        String newPathFile = newPath + "/summary.csv";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(newPathFile, true))){

             for(ProdutoSoma produtoSoma : lerArquivosCriadosProdutos(path)){
                 bw.write(produtoSoma.nome() + "," + produtoSoma.valorTotal());
                 bw.newLine();
             }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}