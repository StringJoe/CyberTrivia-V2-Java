import javax.swing.*;
import java.awt.*;

public class Display extends JFrame{
    public void setupGUI() {
        // set the title and window size for the game
        setTitle("Cyber Trivia");
        setSize(1200, 800);

        // grab the content pane and set it to a border layout
        Container content = getContentPane();
        content.setLayout(new BorderLayout());

        // create the main menu for the game
        // get the screen size and pass it to the main menu panel
        Dimension screenSize = getSize();
        MainMenu mainMenu = new MainMenu(screenSize);

        // add the panel to the frame
        content.add(mainMenu, BorderLayout.CENTER);
    }

    public Display() {
        setupGUI();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
