import javax.swing.*;
import java.awt.*;

public class MainMenu extends JPanel {
    public MainMenu(Dimension screenSize) {
        setLayout( new BoxLayout(this, BoxLayout.Y_AXIS));

        // create the buttons for the menu
        JButton soloGame = new JButton("Solo Game");
        JButton createGame = new JButton("Create Game");
        JButton joinGame = new JButton("Join Game");
        JButton createQuestions = new JButton("Create Questions");
        JButton exitGame = new JButton("Exit Game");

        // add the buttons to the panel and add 50 pixels of space in between each button
        // change the size of the buttons as well
        // BoxLayout only honors setMinimumSize and setMaximumSize.
        // it will also honor setPreferredSize but only for the axis being used (e.g., new BoxLayout(menuPane, BoxLayout.Y_AXIS) or new BoxLayout(menuPane, BoxLayout.X_AXIS)
        soloGame.setMaximumSize(new Dimension(200, 50));
        add(soloGame);
        add(Box.createRigidArea(new Dimension(0, 50)));

        createGame.setMaximumSize(new Dimension(200, 50));
        add(createGame);
        add(Box.createRigidArea(new Dimension(0, 50)));

        joinGame.setMaximumSize(new Dimension(200, 50));
        add(joinGame);
        add(Box.createRigidArea(new Dimension(0, 50)));

        createQuestions.setMaximumSize(new Dimension(200, 50));
        add(createQuestions);
        add(Box.createRigidArea(new Dimension(0, 50)));

        exitGame.setMaximumSize(new Dimension(200, 50));
        add(exitGame);

        // get the size of the first button and window size
        Dimension buttonSize = soloGame.getPreferredSize();
        //Dimension screenSize = getSize();

        // after use the size values to adjust buttons based on frame size
        setBorder(BorderFactory.createEmptyBorder(screenSize.height / 5,screenSize.width / 2 - buttonSize.width,10,10));
    }
}
