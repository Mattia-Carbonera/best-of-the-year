package org.thebest.lessons.java.best_of_the_year.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;


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

            return new String("moviesPage");
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

            return new String("songsPage");
        }
        



        
        private ArrayList<String> getBestMovies() {
            ArrayList<String> moviesList = new ArrayList<>();
            moviesList.add("Harry Potter e la pietra filosofale");
            moviesList.add("Harry Potter e il calic e di fuoco");
            moviesList.add("Il signore dedli anelli: le due torri");
            moviesList.add("Matrix");
            moviesList.add("Viaggio al centro della terra");

            return moviesList;
        }

        private ArrayList<String> getBestSongs() {
            ArrayList<String> songsList = new ArrayList<>();
            songsList.add("AC/DC - highway to hell");
            songsList.add("Foo Fighters - Learn to fly");
            songsList.add("Guns N' Roses - Sweet child o' mine");
            songsList.add("System Of a Down - Chop suey!");
            songsList.add("Green Day - 21 guns");

            return songsList;
        }
        
}


