package com.example.hellopractice1.repository;


import javax.sql.DataSource;
import javax.xml.crypto.Data;
//import org.springframework.jdbc.datasource.DataSourceUtils;

public class JdbcMemberRepository implements MemberRepository {

    private final DataSource dataSource;

    public JdbcMemberRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }



}
