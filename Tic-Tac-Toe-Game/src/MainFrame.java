import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class MainFrame extends JFrame {
    private JButton[] inputButtons;  
    private  Random random = new Random();
    private JLabel mainLabel;
    private JPanel mainPanel = new JPanel(new BorderLayout());
    private JButton startButton = new JButton("START");
    private JButton newGameBtn = new JButton("New Game");
    private JButton confirmPlay = new JButton("Confirm");

    public void initialize() {
        ArrayList<Players> players = new ArrayList<>();

        Players player1 = new Players("X");
        Players player2 = new Players("O");

        players.add(player1);
        players.add(player2);

        int currentPlayerIndex = random.nextInt(players.size());
        mainLabel=new JLabel("Its player "+currentPlayerIndex+" turn");

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(3, 3));
        inputButtons = new JButton[9];

        for (int inputButton = 0; inputButton < 9; inputButton++) {
            inputButtons[inputButton] = new JButton();
            inputButtons[inputButton].setPreferredSize(new Dimension(30, 30));
            inputButtons[inputButton].setHorizontalAlignment(JTextField.CENTER);
            Font largerFont = inputButtons[inputButton].getFont().deriveFont(130f);
            inputButtons[inputButton].setFont(largerFont);
            formPanel.add(inputButtons[inputButton]);

            inputButtons[inputButton].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // if (inputButtons[inputButton] == currentPlayerIndex) { 
                //     inputButtons[inputButton].setText(players.get(currentPlayerIndex).getSymbol());
                //     int currentPlayerIndex = random.nextInt(players.size());
                //     currentPlayerIndex = (currentPlayerIndex + 1) % players.size(); // Toggle player turn
                //     mainLabel.setText("It's player " + players.get(currentPlayerIndex).getSymbol() + "'s turn");
                // }
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(4, 5, 5));
        buttonPanel.add(confirmPlay);
        buttonPanel.add(newGameBtn);

        mainPanel.add(startButton, BorderLayout.CENTER);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.remove(startButton);
                mainPanel.add(mainLabel,BorderLayout.NORTH);
                mainPanel.add(formPanel, BorderLayout.CENTER);
                mainPanel.add(buttonPanel, BorderLayout.SOUTH);
                mainPanel.revalidate();
                mainPanel.repaint();
            }
        });

        newGameBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Clear the text in all input boxes
                for (JButton inputButton : inputButtons) {
                    inputButton.setText("");
                }int currentPlayerIndex = random.nextInt(players.size());
                currentPlayerIndex = random.nextInt(players.size());
                mainLabel.setText("It's player " + players.get(currentPlayerIndex) + "'s turn");
            }
        });

        add(mainPanel);
        setTitle("Tic-Tac-Toe Game");
        setSize(700, 700);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    }
    public static void main(String[] args) throws Exception {
        MainFrame myFrame = new MainFrame();
        myFrame.initialize();
    }
}
