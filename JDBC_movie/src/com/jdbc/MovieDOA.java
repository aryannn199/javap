package com.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class MovieDOA {
    
    public JdbcTemplate jdbctemplate;

    public void setJdbctemplate(JdbcTemplate jdbctemplate)
    {
        this.jdbctemplate = jdbctemplate;
    }
    
    //To insert data in movie table
    public int insertMovie(Movie m)
    {
        String query = "insert into movie values("+m.getId()+",'"+m.getName()+"')";
        return jdbctemplate.update(query);
    }
    
    //To update data in movie table
    public int updateMovie(Movie m)
    {
        String query = "update movie set name='"+m.getName()+"' where id="+m.getId();
        return jdbctemplate.update(query);
    }
    
    //To delete data in movie table
        public int deleteMovie(Movie m)
        {
            String query="delete from movie where id="+m.getId();
            return jdbctemplate.update(query);
        }
    
    
}

