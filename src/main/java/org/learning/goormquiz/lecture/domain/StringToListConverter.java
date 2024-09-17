package org.learning.goormquiz.lecture.domain;

import jakarta.persistence.AttributeConverter;
import java.util.Arrays;
import java.util.List;

public class StringToListConverter implements AttributeConverter<List<String>, String> {

    private static final String SPLIT_CHAR = "\\|";
    private static final String JOIN_CHAR = "|";

    @Override
    public String convertToDatabaseColumn(List<String> stringList) {
        if (stringList == null || stringList.isEmpty()) {
            return "";
        }
        return String.join(JOIN_CHAR, stringList);
    }

    @Override
    public List<String> convertToEntityAttribute(String dbData) {
        if (dbData == null || dbData.isEmpty()) {
            return List.of();
        }
        return Arrays.stream(dbData.split(SPLIT_CHAR))
            .map(String::trim)
            .toList();
    }
}

