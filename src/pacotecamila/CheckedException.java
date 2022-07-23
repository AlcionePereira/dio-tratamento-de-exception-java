package pacotecamila;

import javax.swing.*;
import java.io.*;

public class CheckedException {
    private static String nomeDoArquivo;

    public static void main(String[] args) {
        String nomeDoArquivo = "romaces.txt";
        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Resive o nome do arquivo qu deseja imprimir");
        }finally {
            System.out.println("Chegou no finalyy");
        }

        System.out.println("Apesar da exception ou não, o programa contunua..");
    }

    public  static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        }while (line != null);
        bw.flush();
        br.close();

    }
}
