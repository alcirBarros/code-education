package br.com;

import java.io.File;
import java.util.Date;
import org.beanio.BeanIOConfigurationException;
import org.beanio.BeanIOException;
import org.beanio.BeanWriter;
import org.beanio.StreamFactory;
import org.beanio.builder.FixedLengthParserBuilder;
import org.beanio.builder.StreamBuilder;

public class GerarArquivoMapeado {

    public static final String DELIMITADOR_FIM_LINHA = new StringBuilder().append((char) 13).append((char) 10).toString();

    public static void main(String[] args) {
        try {
            File file = new CriarArquivo().criarArquivoBpa("arquivo.txt");

            StreamFactory factory = createBuilder();

            BeanWriter beanWriter = factory.createWriter("bpa", file);

            beanWriter.write(new RegistroLinha(1111,"aaaaa", "aaaaaaa", "2345678ddd", new Date(), "011", "1111", "aaaaaa"));

            beanWriter.flush();
            beanWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public static StreamFactory createBuilder() throws BeanIOException {
        StreamBuilder builder = new StreamBuilder("bpa")
                .format("fixedlength")
                .parser(new FixedLengthParserBuilder().recordTerminator(DELIMITADOR_FIM_LINHA))
                .addRecord(RegistroLinha.class);

        StreamFactory factory = StreamFactory.newInstance();
        factory.define(builder);
        return factory;
    }
}
