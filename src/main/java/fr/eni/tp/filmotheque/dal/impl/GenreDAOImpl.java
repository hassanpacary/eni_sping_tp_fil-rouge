package fr.eni.tp.filmotheque.dal.impl;

import fr.eni.tp.filmotheque.bo.Genre;
import fr.eni.tp.filmotheque.dal.GenreDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GenreDAOImpl implements GenreDAO {
    private final String FIND_BY_ID = "SELECT titre FROM GENRE WHERE id = :id";
    private final String FIND_ALL = "SELECT titre FROM GENRE";

    @Autowired
    private NamedParameterJdbcTemplate jdbc;

    @Override
    public Genre read(long id) {
        MapSqlParameterSource namedParameters = new MapSqlParameterSource();
        namedParameters.addValue("id", id);
        return jdbc.queryForObject(FIND_BY_ID, namedParameters, new BeanPropertyRowMapper<>(Genre.class));
    }

    @Override
    public List<Genre> findAll() {
        return jdbc.query(FIND_ALL, new BeanPropertyRowMapper<>(Genre.class));
    }
}
