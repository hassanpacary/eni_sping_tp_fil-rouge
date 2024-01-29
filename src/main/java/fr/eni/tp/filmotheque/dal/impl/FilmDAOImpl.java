package fr.eni.tp.filmotheque.dal.impl;

import fr.eni.tp.filmotheque.bo.Film;
import fr.eni.tp.filmotheque.bo.Genre;
import fr.eni.tp.filmotheque.dal.FilmDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FilmDAOImpl implements FilmDAO {
    private final String INSERT = "INSERT INTO FILM(id, titre, annee, duree, synopsis, id_realisateur, id_genre) VALUES (:id, :titre, :annee, :duree, :synopsis, :id_realisateur, :id_genre)";
    private final String FIND_BY_ID = "SELECT titre, annee, duree, synopsis, id_realisateur, id_genre FROM FILM WHERE id = :id";
    private final String FIND_ALL = "SELECT titre, annee, duree, synopsis, id_realisateur, id_genre FROM FILM";
    private final String FIND_TITRE = "SELECT titre FROM FILM";

    @Autowired
    private NamedParameterJdbcTemplate jdbc;

    @Override
    public void create(Film film) {
        MapSqlParameterSource namedParameters = new MapSqlParameterSource();
        namedParameters.addValue("id", film.getId());
        namedParameters.addValue("titre", film.getTitre());
        namedParameters.addValue("annee", film.getAnnee());
        namedParameters.addValue("duree", film.getDuree());
        namedParameters.addValue("synopsis", film.getSynopsis());
        namedParameters.addValue("id_realisateur", film.getRealisateur().getId());
        namedParameters.addValue("id_genre", film.getGenre().getId());

        jdbc.update(INSERT, namedParameters);
    }

    @Override
    public Film read(long id) {
        MapSqlParameterSource namedParameters = new MapSqlParameterSource();
        namedParameters.addValue("id", id);
        return jdbc.queryForObject(FIND_BY_ID, namedParameters, new BeanPropertyRowMapper<>(Film.class));
    }

    @Override
    public List<Film> findAll() {
        return jdbc.query(FIND_ALL, new BeanPropertyRowMapper<>(Film.class));
    }

    @Override
    public String findTitre(long id) {
        MapSqlParameterSource namedParameters = new MapSqlParameterSource();
        namedParameters.addValue("id", id);
        return jdbc.queryForObject(FIND_TITRE, namedParameters, new BeanPropertyRowMapper<>(String.class));
    }
}
