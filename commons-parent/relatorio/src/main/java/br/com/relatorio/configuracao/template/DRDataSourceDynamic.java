package br.com.relatorio.configuracao.template;

import net.sf.dynamicreports.report.datasource.DRDataSource;

public class DRDataSourceDynamic {

    private boolean isEmpty;
    private DataSource dataSource;
    private DRDataSource dRDataSource;
    
    public void add(Object... values){
        isEmpty = false;
        dRDataSource.add(values);
    }

    public DRDataSource getdRDataSource() {
        if(isEmpty){
            dRDataSource.add(new Object());
        }
        return dRDataSource;
    }
}
