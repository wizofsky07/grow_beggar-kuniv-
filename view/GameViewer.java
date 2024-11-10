package source.view;

import javax.swing.JFrame;
import source.controller.GameController;

public class GameViewer extends JFrame{
    private GameController controller;

    public GameViewer(GameController controller){
        this.controller = controller;
    }

    //gui 구현
}
