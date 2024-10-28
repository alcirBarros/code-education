package br.com.relatorio.configuracao.template;

import static net.sf.dynamicreports.report.builder.DynamicReports.stl;
import net.sf.dynamicreports.report.builder.style.StyleBuilder;
import net.sf.dynamicreports.report.constant.HorizontalAlignment;
import net.sf.dynamicreports.report.constant.VerticalAlignment;

public class DynamicReportStyles {
    
    public static final StyleBuilder title1StyleBold = stl.style().setAlignment(HorizontalAlignment.CENTER, VerticalAlignment.MIDDLE).setFontSize(11).bold();
    public static final StyleBuilder title2Style = stl.style().setAlignment(HorizontalAlignment.CENTER, VerticalAlignment.MIDDLE).setFontSize(9);

}
