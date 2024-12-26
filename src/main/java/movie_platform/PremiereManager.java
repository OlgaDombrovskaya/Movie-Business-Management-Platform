package movie_platform;

import java.util.ArrayList;
import java.util.List;

public class PremiereManager {
    private List<Premiere> premieres;

    public PremiereManager() {
        this.premieres = new ArrayList<>();
    }

    public void addPremiere(Premiere premiere) {
        premieres.add(premiere);
    }

    public void removePremiere(int premiereId) {
        premieres.removeIf(premiere -> premiere.getId() == premiereId);
    }

    public Premiere getPremiere(int premiereId) {
        return premieres.stream().filter(premiere -> premiere.getId() == premiereId).findFirst().orElse(null);
    }

    public List<Premiere> getAllPremieres() {
        return new ArrayList<>(premieres);
    }

    public void generatePremiereReport() {
        // Код для генерации отчета о премьере
    }
}