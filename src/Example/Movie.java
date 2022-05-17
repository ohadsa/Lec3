package Example;

public class Movie {

    private final Integer id;
    private final String original_title;
    private final String title;

    public Movie(Integer id, String original_title, String title) {
        this.id = id;
        this.original_title = original_title;
        this.title = title;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "\nid=" + id +
                "\noriginalTitle='" + original_title + '\'' +
                "\ntitle='" + title + '\'' +
                '}' + "\n---------------------------------\n";
    }
}
