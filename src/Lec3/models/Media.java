package Lec3.models;

public class Media {
    protected final Integer id;
    protected final String original_title;
    private final String title;

    public Media(Integer id, String original_title, String title) {
        this.id = id;
        this.original_title = original_title;
        this.title = title;
    }

    @Override
    public String toString() {
        return "media{" +
                "\nid=" + id +
                "\noriginalTitle='" + original_title + '\'' +
                "\ntitle='" + title + '\'' +
                '}' + "\n---------------------------------\n";
    }


}
