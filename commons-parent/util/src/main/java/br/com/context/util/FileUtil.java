package br.com.context.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;

public class FileUtil {

    public static File escrever(String name, byte[] contents) throws IOException {
        File file = new File(diretorioRaizParaArquivos(), name);
        OutputStream out = new FileOutputStream(file);
        out.write(contents);
        out.close();
        return file;
    }

    public static void excluir(String name) throws IOException {
        File file = new File(diretorioRaizParaArquivos(), name);
        file.delete();
    }

    public static List<File> listar() {
        File dir = diretorioRaizParaArquivos();

        return Arrays.asList(dir.listFiles());
    }

    public static File diretorioRaizParaArquivos() {
        File dir = new File(diretorioRaiz(), "arquivos");

        if (!dir.exists()) {
            dir.mkdirs();
        }

        return dir;
    }

    public static File diretorioRaiz() {
        // Estamos utilizando um diretório dentro da pasta temporária. 
        // No seu projeto, imagino que queira mudar isso para algo como:
        // File dir = new File(System.getProperty("user.home"), "algaworks");
        File dir = new File(System.getProperty("java.io.tmpdir"), "arquivos");

        if (!dir.exists()) {
            dir.mkdirs();
        }

        return dir;
    }
}
