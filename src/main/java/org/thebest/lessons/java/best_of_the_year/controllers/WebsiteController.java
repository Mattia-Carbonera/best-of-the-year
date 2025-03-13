package org.thebest.lessons.java.best_of_the_year.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.thebest.lessons.java.best_of_the_year.classes.Movie;
import org.thebest.lessons.java.best_of_the_year.classes.Song;


@Controller
@RequestMapping("/")
public class WebsiteController {
    
    // * index
        @GetMapping("/")
        public String home (@RequestParam("param") String name, Model model) {
            model.addAttribute("name", name);
            return new String("index");
        }

    // * movies
        @GetMapping("/movies")
        public String moviesn(Model model) {
            model.addAttribute("movies", getBestMovies());
            return new String("moviesPage");
        }

        @GetMapping("/movies/{id}")
        public String selectedMovie(@PathVariable("id") String movieId, Model model) {
            int intId = Integer.parseInt(movieId);
            model.addAttribute("movies", getBestMovies().get(intId));
            model.addAttribute("pageName", "movies");

            return new String("details");
        }
        

    // * songs
        @GetMapping("/songs")
        public String songs (Model model) {
            model.addAttribute("songs", getBestSongs());
            return new String("songsPage");
        }
        
        @GetMapping("/songs/{id}")
        public String getMethodName(@PathVariable("id") String songId, Model model) {
            int intId = Integer.parseInt(songId);
            model.addAttribute("songs", getBestSongs().get(intId));
            model.addAttribute("pageName", "songs");

            return new String("details");
        }
        



        
        private ArrayList<Movie> getBestMovies() {
            String[] castPlaceHolder = {"Attore Uno", "Attore Due", "Attore Tre", "Attore Quattro", "Attore Cinque"};
            ArrayList<Movie> moviesList = new ArrayList<>();
            Movie harryOne = new Movie(0, "Harry Potter e la pietra filosofale", 2001, castPlaceHolder);
            Movie harryFour = new Movie(1, "Harry Potter e il calic e di fuoco", 2005, castPlaceHolder);
            Movie lordOfRings = new Movie(2, "Il signore dedli anelli: le due torri", 2003, castPlaceHolder);
            Movie matrix = new Movie(3, "Matrix", 1999, castPlaceHolder);
            Movie centerOfEarth = new Movie(4, "Viaggio al centro della terra", 2009, castPlaceHolder);

            moviesList.add(harryOne);
            moviesList.add(harryFour);
            moviesList.add(lordOfRings);
            moviesList.add(matrix);
            moviesList.add(centerOfEarth);

            // moviesList.add("Harry Potter e la pietra filosofale");
            // moviesList.add("Harry Potter e il calic e di fuoco");
            // moviesList.add("Il signore dedli anelli: le due torri");
            // moviesList.add("Matrix");
            // moviesList.add("Viaggio al centro della terra");

            return moviesList;
        }

        private ArrayList<Song> getBestSongs() {
            ArrayList<Song> songsList = new ArrayList<>();
            Song highwayToHell = new Song(0, "AC/DC - highway to hell", 1979, "AC/DC");
            Song learnToFly = new Song(1, "Foo Fighters - Learn to fly", 1999, "Foo Fighters");
            Song sweetChildoMine = new Song(2, "Guns N' Roses - Sweet child o' mine", 1988, "Guns N' Roses");
            Song chopSuey = new Song(3, "System Of a Down - Chop suey!", 2001, "System Of a Down");
            Song twentyoneGuns = new Song(4, "Green Day - 21 guns", 2009, "Green Day");

            songsList.add(highwayToHell);
            songsList.add(learnToFly);
            songsList.add(sweetChildoMine);
            songsList.add(chopSuey);
            songsList.add(twentyoneGuns);

            // songsList.add("AC/DC - highway to hell");
            // songsList.add("Foo Fighters - Learn to fly");
            // songsList.add("Guns N' Roses - Sweet child o' mine");
            // songsList.add("System Of a Down - Chop suey!");
            // songsList.add("Green Day - 21 guns");

            return songsList;
        }
        
}


