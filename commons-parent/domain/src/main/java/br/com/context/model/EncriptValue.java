package br.com.context.model;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;


//    @Column()
//    @Convert(converter = EncriptValue.class)
//    private String column;


@Converter()
public class EncriptValue implements AttributeConverter<String, String> {

    @Override
    public String convertToDatabaseColumn(String attribute) {
        return attribute;
    }

    @Override
    public String convertToEntityAttribute(String dbData) {
        return dbData;
    }
}
