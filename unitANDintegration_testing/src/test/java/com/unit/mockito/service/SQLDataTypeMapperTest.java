package com.unit.mockito.service;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Naveen K Wodeyaar,
 * @Date 13-Nov-2025
 */

public class SQLDataTypeMapperTest {

    @Test
    void testSQLTypeListIsNotEmpty() {
        SQLDataTypeMapper mapper = new SQLDataTypeMapper();
        List<SQLDataTypeMapper.SQLType> list = mapper.getAllSQLTypes();
        assertNotNull(list, "List should not be null");
        assertFalse(list.isEmpty(), "List of SQL data types should not be empty");
    }

    @Test
    void testEachSQLTypeHasValidFields() {
        SQLDataTypeMapper mapper = new SQLDataTypeMapper();
        for (SQLDataTypeMapper.SQLType type : mapper.getAllSQLTypes()) {
            assertNotNull(type.getSqlType(), "SQL type name must not be null");
            assertNotNull(type.getJavaType(), "Java type mapping must not be null");
            assertNotNull(type.getUseCase(), "Use case must not be null");
            assertFalse(type.getSqlType().isBlank(), "SQL type name must not be blank");
        }
    }

    @Test
    void testContainsCommonMappings() {
        SQLDataTypeMapper mapper = new SQLDataTypeMapper();
        List<SQLDataTypeMapper.SQLType> list = mapper.getAllSQLTypes();

        boolean hasVarchar = list.stream().anyMatch(t -> t.getSqlType().toUpperCase().contains("VARCHAR"));
        boolean hasDate = list.stream().anyMatch(t -> t.getSqlType().toUpperCase().contains("DATE"));
        boolean hasBoolean = list.stream().anyMatch(t -> t.getSqlType().toUpperCase().contains("BOOLEAN"));

        assertTrue(hasVarchar, "Should contain VARCHAR mapping");
        assertTrue(hasDate, "Should contain DATE mapping");
        assertTrue(hasBoolean, "Should contain BOOLEAN mapping");
    }
}
