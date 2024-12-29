package movie_platform;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    private int id;
    private String title;
    private String genre;
    private String status;
    private int budget;
    private List<String> movieActors;

    public Movie(int id, String title, String genre, String status, int budget) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.status = status;
        this.budget = budget;
        this.movieActors = new ArrayList<>();
    }

    public void addActor(String actorName) {
        if (!movieActors.contains(actorName)) {
            movieActors.add(actorName);
            System.out.println("Актер добавлен: " + actorName);
        } else {
            System.out.println("Актер уже существует: " + actorName);
        }
    }

    public void updateStatus(String newStatus) {
        if (newStatus.equals("планируется") || newStatus.equals("в производстве") || newStatus.equals("завершен")) {
            this.status = newStatus;
            System.out.println("Статус обновлен: " + newStatus);
        } else {
            System.out.println("Некорректный статус: " + newStatus);
        }
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", status='" + status + '\'' +
                ", budget=" + budget +
                ", movieActors=" + movieActors +
                '}';
    }
}
