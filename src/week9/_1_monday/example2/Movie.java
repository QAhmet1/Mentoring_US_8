package week9._1_monday.example2;

public class Movie {
    //        An instance of class Movie represents a film. This class
//            has the following three class variables:
//            ● title, which is a String representing the title of the movie
//            ● studio, which is a String representing the studio that made the movie
//            ● rating, which is a String representing the rating of the movie

//                Write a constructor for the class Movie, which takes a String representing the title of the
//                movie, a String representing the studio, and a String representing the rating as its
//                arguments, and sets the respective class variables to these values.

//                Write a second constructor for the class Movie, which takes a String representing the title
//                of the movie and a String representing the studio as its arguments, and sets the respective
//                class variables to these values, while the class variable rating is set to "PG".

//                Write a piece of code that creates an instance of the class Movie with the title “Casino
//                Royale”, the studio “Eon Productions”, and the rating “PG-13”.

    String title;
    String studio;
    String rating;
    Movie [] movies;

    public Movie(String title,String studio,String rating){
        this.title=title;
        this.studio=studio;
        this.rating=rating;
    }

    public Movie(String title,String studio){
        this.title=title;
        this.studio=studio;
        this.rating="PG";
    }

    public void getMovies(Movie [] mArr){
        for (int i = 0; i <mArr.length ; i++) {
            System.out.println("*****   movie "+(i+1));
            System.out.println("Title is : "+mArr[i].title);
            System.out.println("Studio is : "+mArr[i].studio);
            System.out.println("Rating is : "+mArr[i].rating);

        }
//        int count=1;
//        for(Movie m:mArr){
//            System.out.println("*****   movie "+count);
//            System.out.println("Title is : "+m.title);
//            System.out.println("Studio is : "+m.studio);
//            System.out.println("Rating is : "+m.rating);
//            count++;
        }


    }


