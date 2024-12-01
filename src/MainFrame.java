
import javax.swing.JFrame;

public class MainFrame {
    private int rowCount = 21;
    private int columnCount = 19;
    private int titleSize = 32;
    private int boardWidth = columnCount * titleSize;
    private int boardHeight = rowCount * titleSize;

    public MainFrame() {
        JFrame frame = new JFrame("Pac Man");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(boardWidth, boardHeight);


        frame.setVisible(true);

    }


}
