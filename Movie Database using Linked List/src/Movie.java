public class Movie {
    public Movie(int movieId, String movieName, String movieDirector, String movieCategory, double movieIMDBBrate) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieDirector = movieDirector;
        this.movieCategory = movieCategory;
        this.movieIMDBBrate = movieIMDBBrate;
    }

    private int movieId;
    private String movieName;
    private String movieDirector;
    private String movieCategory;
    private double movieIMDBBrate;


    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }

    public String getMovieCategory() {
        return movieCategory;
    }

    public void setMovieCategory(String movieCategory) {
        this.movieCategory = movieCategory;
    }

    public double getMovieIMDBBrate() {
        return movieIMDBBrate;
    }

    public void setMovieIMDBBrate(double movieIMDBBrate) {
        this.movieIMDBBrate = movieIMDBBrate;
    }

}
