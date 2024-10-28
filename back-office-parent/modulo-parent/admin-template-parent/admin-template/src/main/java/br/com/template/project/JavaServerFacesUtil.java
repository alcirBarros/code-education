package br.com.template.project;

import br.com.context.model.Entidade;
import br.com.template.scoped.ConfigurableBeanFactory;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class JavaServerFacesUtil {

    private <T> Stream<T> addItem(Stream<T> stream, T elem) {
        List<T> result = stream.collect(Collectors.toList());
        result.add(0, elem);
        return result.stream();
    }

    public List<SelectItem> getSelectItems(Entidade[] entidadeArray, boolean exibeItemVazio) {
        List<Entidade> entidadeList = Arrays.asList(entidadeArray);
        return getSelectItems(entidadeList, exibeItemVazio);
    }

    public <T extends Entidade, Y extends Entidade> List<SelectItem> getSelectItems(Map<T, List<Y>> entidadeMap, boolean b) {

        List<Entry<T, List<Y>>> entidadeMapList = getEntidadeMapList(entidadeMap);

        List<SelectItem> collect = new ArrayList();
        for (Map.Entry<T, List<Y>> entry : entidadeMapList) {

            T key = entry.getKey();
            List<Y> value = entry.getValue();

            String display = key.getDisplay();
            SelectItemGroup selectItemGroup = new SelectItemGroup(display);

            List<SelectItem> selectItems = getSelectItems((List<Entidade>) value, false);
            SelectItem[] toArray = selectItems.stream().toArray(SelectItem[]::new);
            selectItemGroup.setSelectItems(toArray);
            collect.add(selectItemGroup);
        }

        return collect;
    }

    public List<SelectItem> getSelectItems(List<Entidade> lista, boolean exibeItemVazio) {
        try {
            List<Entidade> list = Optional.ofNullable(lista).orElseGet(Collections::emptyList);

            Collections.sort(list, new Comparator<Entidade>() {
                @Override
                public int compare(Entidade entidade1, Entidade entidade2) {

                    if (entidade1.getOrderBy() != null && entidade2.getOrderBy() != null) {

                        if (entidade1.getOrderBy() instanceof Integer && entidade2.getOrderBy() instanceof Integer) {
                            return Integer.valueOf(entidade1.getOrderBy().toString()).compareTo(Integer.valueOf(entidade2.getOrderBy().toString()));
                        } else {
                            return entidade1.getOrderBy().toString().compareToIgnoreCase(entidade2.getOrderBy().toString());
                        }

                    } else {
                        return String.valueOf(entidade1.getRandomId()).compareToIgnoreCase(String.valueOf(entidade2.getRandomId()));
                    }
                }
            });

            Stream<SelectItem> map = list.stream().map(item -> {

                Entidade entidade = ((Entidade) item);
                String display = (entidade != null && entidade.getDisplay() != null) ? entidade.getDisplay().toUpperCase() : "";
                return new SelectItem(item, display);

            });
            if (exibeItemVazio) {
                SelectItem selectItem = new SelectItem(null, "Selecione");
                map = addItem(map, selectItem);
            }

            List<SelectItem> collect = map.collect(Collectors.toList());

            return collect;
        } catch (Exception e) {
            throw e;
        }
    }

    public <T extends Entidade, Y extends Entidade> List<Entry<T, List<Y>>> getEntidadeMapList(Map<T, List<Y>> entidadeMap) {
        Set<Entry<T, List<Y>>> set = entidadeMap.entrySet();
        List<Entry<T, List<Y>>> list = new ArrayList<Entry<T, List<Y>>>(set);
        Collections.sort(list, new Comparator<Map.Entry<T, List<Y>>>() {
            public int compare(Map.Entry<T, List<Y>> entidade1, Map.Entry<T, List<Y>> entidade2) {
                if (entidade1.getKey().getOrderBy() != null && entidade1.getKey().getOrderBy() != null) {
                    return entidade1.getKey().getOrderBy().toString().compareToIgnoreCase(entidade2.getKey().getOrderBy().toString());
                } else {
                    return String.valueOf(entidade1.getKey().getRandomId()).compareToIgnoreCase(String.valueOf(entidade2.getKey().getRandomId()));
                }
            }
        });
        return list;
    }

}
