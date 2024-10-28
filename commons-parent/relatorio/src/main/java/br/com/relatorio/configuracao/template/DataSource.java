package br.com.relatorio.configuracao.template;

import java.util.Optional;
import net.sf.dynamicreports.report.datasource.DRDataSource;

public class DataSource {

    private boolean isEmpty = true;
    
    private HeaderDataSource headerDataSource = new HeaderDataSource();

    private DRDataSource dRDataSource;


    public DataSource(HeaderDataSource headerDataSource) {
        this.headerDataSource = Optional.ofNullable(headerDataSource).orElse(new HeaderDataSource());
        dRDataSource = new DRDataSource(this.headerDataSource.getHeaderArray());
    }

    public void add(Object... values) {
        dRDataSource.add(values);
        isEmpty = false;
    }

    public DRDataSource dRDataSource() {
        if (isEmpty) {
            dRDataSource.add(new Object[headerDataSource.getTextColumnBuilderList().size()]);
        }
        return dRDataSource;
    }
}
