public interface MovieInter {
    void setTitle(String title);
    void setCategory(MovieCategory category);
    void setYear(int year);

    String getTitle();
    MovieCategory getCategory();
    int getYear();

    String displayMovieData();
}
