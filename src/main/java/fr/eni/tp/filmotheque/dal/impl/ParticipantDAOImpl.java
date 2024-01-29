package fr.eni.tp.filmotheque.dal.impl;

import fr.eni.tp.filmotheque.bo.Participant;
import fr.eni.tp.filmotheque.dal.ParticipantDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ParticipantDAOImpl implements ParticipantDAO {
    private final String INSERT = "INSERT INTO FILM(id, titre, annee, duree, synopsis, id_realisateur, id_genre) VALUES (:id, :titre, :annee, :duree, :synopsis, :id_realisateur, :id_genre)";
    private final String FIND_BY_ID = "SELECT titre, annee, duree, synopsis, id_realisateur, id_genre FROM FILM WHERE id = :id";
    private final String FIND_ALL = "SELECT titre, annee, duree, synopsis, id_realisateur, id_genre FROM FILM";
    private final String FIND_TITRE = "SELECT titre FROM FILM";

    @Autowired
    private NamedParameterJdbcTemplate jdbc;
    @Override
    public Participant read(long id) {
        //TODO
        return null;
    }

    @Override
    public List<Participant> findAll() {
        //TODO
        return null;
    }

    @Override
    public List<Participant> findActeurs(long idFilm) {
        //A NE PAS IMPLEMENTER
        return null;
    }

    @Override
    public void createActeur(long idParticipant, long idFilm) {
        //TODO
    }
}
