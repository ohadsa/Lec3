package Lec3.models;

public class Media {
    protected final Integer id;
    protected final String original_title;
    private final String title;

    private final String name;

    public Media(Integer id, String original_title, String title, String name) {
        this.id = id;
        this.original_title = original_title;
        this.title = title;
        this.name = name;
    }


    @Override
    public String toString() {
        return ( original_title==null ? "SERIES : " : "MOVIE" )  +
                "\nid=" + id +
                "\n" + (original_title==null ? "name="+name : "originalTitle="+original_title ) + '\'' +
                 (title==null ? "" : "\ntitle=" + title ) + '\'' +
                '}' + "\n---------------------------------\n";
    }

}
