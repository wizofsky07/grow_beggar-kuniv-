package source;

import javax.swing.SwingUtilities;

import source.controller.GameController;
import source.model.Poor;
import source.model.store.StoreService;
import source.repository.ColleagueRepository;
import source.repository.ItemRepository;
import source.view.GameViewer;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StoreService storeService = new StoreService(new ItemRepository(), new ColleagueRepository());
            GameController controller = new GameController(new Poor(), storeService);
            new GameViewer(controller);
        });
    }
}
