package com.unit.mockito.service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Naveen K Wodeyaar,
 * @Date 13-Nov-2025
 */

public class SQLDataTypeMapper {

    // Inner class to represent a mapping
    public static class SQLType {
        private final String sqlType;
        private final String javaType;
        private final String useCase;

        public SQLType(String sqlType, String javaType, String useCase) {
            this.sqlType = sqlType;
            this.javaType = javaType;
            this.useCase = useCase;
        }

        public String getSqlType() {
            return sqlType;
        }

        public String getJavaType() {
            return javaType;
        }

        public String getUseCase() {
            return useCase;
        }
    }

    /** Returns a list of common SQL data types with mappings and examples. */
    public List<SQLType> getAllSQLTypes() {
        List<SQLType> sqlTypes = new ArrayList<>();

        sqlTypes.add(new SQLType("INT / INTEGER", "int / Integer", "Whole numbers (IDs, quantity, age)."));
        sqlTypes.add(new SQLType("BIGINT", "long / Long", "Large integer values (transaction IDs)."));
        sqlTypes.add(new SQLType("SMALLINT / TINYINT", "short / byte", "Small-range integers (ratings, flags)."));
        sqlTypes.add(new SQLType("DECIMAL / NUMERIC", "java.math.BigDecimal", "Precise numbers (salary, money, rates)."));
        sqlTypes.add(new SQLType("FLOAT / REAL / DOUBLE", "float / double", "Approximate numbers (scientific data)."));
        sqlTypes.add(new SQLType("CHAR(n)", "String", "Fixed-length text (country code, gender)."));
        sqlTypes.add(new SQLType("VARCHAR(n)", "String", "Variable-length text (names, emails)."));
        sqlTypes.add(new SQLType("TEXT / CLOB", "String", "Large text (descriptions, comments)."));
        sqlTypes.add(new SQLType("DATE", "java.sql.Date", "Date only (birth date, join date)."));
        sqlTypes.add(new SQLType("TIME", "java.sql.Time", "Time only (login/logout times)."));
        sqlTypes.add(new SQLType("TIMESTAMP / DATETIME", "java.sql.Timestamp", "Date and time (created_at, updated_at)."));
        sqlTypes.add(new SQLType("BOOLEAN / BIT", "boolean / Boolean", "True/false (status, flags)."));
        sqlTypes.add(new SQLType("BLOB", "byte[] / java.sql.Blob", "Binary data (images, files)."));
        sqlTypes.add(new SQLType("UUID", "java.util.UUID / String", "Unique identifiers for entities."));
        sqlTypes.add(new SQLType("JSON", "String", "Semi-structured data (config, metadata)."));

        return sqlTypes;
    }

    /** Prints the SQL data types in a formatted table. */
    public void printSQLTypes() {
        List<SQLType> sqlTypes = getAllSQLTypes();

        System.out.printf("%-25s %-30s %-80s%n", "SQL DATA TYPE", "JAVA DATA TYPE", "COMMON USE CASE");
        System.out.println("=".repeat(130));

        for (SQLType type : sqlTypes) {
            System.out.printf("%-25s %-30s %-80s%n",
                    type.getSqlType(), type.getJavaType(), type.getUseCase());
        }
    }

    public static void main(String[] args) {
        new SQLDataTypeMapper().printSQLTypes();
    }
}
