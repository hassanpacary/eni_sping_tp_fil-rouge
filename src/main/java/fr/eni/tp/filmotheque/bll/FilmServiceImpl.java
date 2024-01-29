package fr.eni.tp.filmotheque.bll;

import fr.eni.tp.filmotheque.bo.Avis;
import fr.eni.tp.filmotheque.bo.Film;
import fr.eni.tp.filmotheque.bo.Genre;
import fr.eni.tp.filmotheque.bo.Participant;

import java.util.List;

public class FilmServiceImpl implements FilmService{
    //Attention aux conflit de bean
    //Utiliser @bean
    //RAPPEL - Un film dépend de son genre, de son réalisateur
    //       - Pour l’affichage du détail le film dépend en plus de ses acteurs et des avis
    @Override
    public List<Film> consulterFilms() {
        //TODO
        return null;
    }

    @Override
    public Film consulterFilmParId(long id) {
        return null;
    }

    @Override
    public List<Genre> consulterGenres() {
        //TODO
        return null;
    }

    @Override
    public List<Participant> consulterParticipants() {
        //TODO
        return null;
    }

    @Override
    public Genre consulterGenreParId(long id) {
        //TODO
        return null;
    }

    @Override
    public Participant consulterParticipantParId(long id) {
        //TODO
        return null;
    }

    @Override
    public void creerFilm(Film film) {

    }

    @Override
    public String consulterTitreFilm(long id) {
        //TODO
        return null;
    }

    @Override
    public void publierAvis(Avis avis, long idFilm) {

    }

    @Override
    public List<Avis> consulterAvis(long idFilm) {
        return null;
    }
}
