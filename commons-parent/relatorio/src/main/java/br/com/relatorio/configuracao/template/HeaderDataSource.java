package br.com.relatorio.configuracao.template;

import java.util.ArrayList;
import java.util.List;
import net.sf.dynamicreports.report.builder.column.ColumnBuilder;
import net.sf.dynamicreports.report.builder.column.TextColumnBuilder;

public class HeaderDataSource {

    private List<TextColumnBuilder> textColumnBuilderList = new ArrayList<>();

    public void addHeader(TextColumnBuilder values) {
        textColumnBuilderList.add(values);
    }

    public ColumnBuilder[] columDynamic() {
        return textColumnBuilderList.toArray(new ColumnBuilder[textColumnBuilderList.size()]);
    }

    public String[] getHeaderArray() {
        return textColumnBuilderList.stream().map(x -> x.getName()).toArray(String[]::new);
    }

    public List<TextColumnBuilder> getTextColumnBuilderList() {
        return textColumnBuilderList;
    }

}
