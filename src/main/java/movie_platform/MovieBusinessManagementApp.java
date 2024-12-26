package movie_platform;

public class MovieBusinessManagementApp {
        public static void main(String[] args) {
            // Инициализация менеджеров

            PremiereManager premiereManager = new PremiereManager();

            // Добавление примера фильма
            // Movie movie = new Movie(1, "Movie 1", "Drama", "2024-01-01", "2024-12-01", MovieStatus.PLANNED);
            // movieManager.addMovie(movie);

            // Добавление премьеры
            Premiere premiere = new Premiere(1, "Movie 1", "2024-12-01", "Los Angeles", 100);
            premiereManager.addPremiere(premiere);


            premiereManager.generatePremiereReport();

        }
    }
