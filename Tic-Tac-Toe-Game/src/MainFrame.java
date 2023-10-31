import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class MainFrame extends JFrame {

    private  ArrayList<Players> players = new ArrayList<>();
    private  Random random = new Random();
    private JLabel mainLabel;
    private JPanel mainPanel = new JPanel(new BorderLayout());
    private JButton startButton = new JButton("START");
    private JButton newGameBtn = new JButton("New Game");
    private JButton inputButton1 = new JButton("");
    private JButton inputButton2= new JButton("");
    private JButton inputButton3= new JButton("");
    private JButton inputButton4= new JButton("");
    private JButton inputButton5= new JButton("");
    private  JButton inputButton6= new JButton("");
    private JButton inputButton7= new JButton("");
    private JButton inputButton8= new JButton("");
    private JButton inputButton9= new JButton("");
    private JPanel formPanel = new JPanel();;

    public void initialize() {

        add(mainPanel);
        setTitle("Tic-Tac-Toe Game");
        setSize(700, 700);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        Players playerX = new Players("X");
        Players playerO = new Players("O");

        players.add(playerX);
        players.add(playerO);

        int currentPlayerIndex = random.nextInt(players.size());
        mainLabel=new JLabel("It's player " + players.get(currentPlayerIndex).getSymbol() + "'s turn");
        int newCurrentPlayerIndex = (currentPlayerIndex + 1) % players.size(); // Toggle player turn

        formPanel.setLayout(new GridLayout(3, 3));

            inputButton1.setPreferredSize(new Dimension(30, 30));
            inputButton1.setHorizontalAlignment(JTextField.CENTER);
            Font largerFont = inputButton1.getFont().deriveFont(130f);
            inputButton1.setFont(largerFont);
            formPanel.add(inputButton1);
            inputButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (inputButton1.getText().isEmpty()) {
                    if (mainLabel.getText().contains( players.get(currentPlayerIndex).getSymbol())){
                        inputButton1.setText(players.get(currentPlayerIndex).getSymbol());
                    mainLabel.setText("It's player " + players.get(newCurrentPlayerIndex).getSymbol() + "'s turn");
                }else if (mainLabel.getText().contains( players.get(newCurrentPlayerIndex).getSymbol())){
                    inputButton1.setText(players.get(newCurrentPlayerIndex).getSymbol());
                    mainLabel.setText("It's player " + players.get(currentPlayerIndex).getSymbol() + "'s turn");
                }

                    
                    mainLabel.revalidate();
                    mainLabel.repaint();
                if(inputButton1.getText()==playerX.getSymbol()&& inputButton2.getText()==playerX.getSymbol()&&inputButton3.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerO.getSymbol()&& inputButton2.getText()==playerO.getSymbol()&&inputButton3.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton4.getText()==playerX.getSymbol()&& inputButton5.getText()==playerX.getSymbol()&&inputButton6.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton4.getText()==playerO.getSymbol()&& inputButton5.getText()==playerO.getSymbol()&&inputButton6.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton7.getText()==playerX.getSymbol()&& inputButton8.getText()==playerX.getSymbol()&&inputButton9.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton7.getText()==playerO.getSymbol()&& inputButton8.getText()==playerO.getSymbol()&&inputButton9.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerX.getSymbol()&& inputButton4.getText()==playerX.getSymbol()&&inputButton7.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerO.getSymbol()&& inputButton4.getText()==playerO.getSymbol()&&inputButton7.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton2.getText()==playerX.getSymbol()&& inputButton5.getText()==playerX.getSymbol()&&inputButton8.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton2.getText()==playerO.getSymbol()&& inputButton5.getText()==playerO.getSymbol()&&inputButton8.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton3.getText()==playerX.getSymbol()&& inputButton6.getText()==playerX.getSymbol()&&inputButton9.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton3.getText()==playerO.getSymbol()&& inputButton6.getText()==playerO.getSymbol()&&inputButton9.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerX.getSymbol()&& inputButton5.getText()==playerX.getSymbol()&&inputButton9.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerO.getSymbol()&& inputButton5.getText()==playerO.getSymbol()&&inputButton9.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton3.getText()==playerX.getSymbol()&& inputButton5.getText()==playerX.getSymbol()&&inputButton7.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton3.getText()==playerO.getSymbol()&& inputButton5.getText()==playerO.getSymbol()&&inputButton7.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}
            }
            }
            
        });

            inputButton2.setPreferredSize(new Dimension(30, 30));
            inputButton2.setHorizontalAlignment(JTextField.CENTER);
            inputButton2.setFont(largerFont);
            formPanel.add(inputButton2);
            inputButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (inputButton2.getText().isEmpty()) {
                    if (mainLabel.getText().contains( players.get(currentPlayerIndex).getSymbol())){
                        inputButton2.setText(players.get(currentPlayerIndex).getSymbol());
                    mainLabel.setText("It's player " + players.get(newCurrentPlayerIndex).getSymbol() + "'s turn");
                }else if (mainLabel.getText().contains( players.get(newCurrentPlayerIndex).getSymbol())){
                    inputButton2.setText(players.get(newCurrentPlayerIndex).getSymbol());
                    mainLabel.setText("It's player " + players.get(currentPlayerIndex).getSymbol() + "'s turn");
                }

                    mainLabel.revalidate();
                    mainLabel.repaint();
                if(inputButton1.getText()==playerX.getSymbol()&& inputButton2.getText()==playerX.getSymbol()&&inputButton3.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerO.getSymbol()&& inputButton2.getText()==playerO.getSymbol()&&inputButton3.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton4.getText()==playerX.getSymbol()&& inputButton5.getText()==playerX.getSymbol()&&inputButton6.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton4.getText()==playerO.getSymbol()&& inputButton5.getText()==playerO.getSymbol()&&inputButton6.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton7.getText()==playerX.getSymbol()&& inputButton8.getText()==playerX.getSymbol()&&inputButton9.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton7.getText()==playerO.getSymbol()&& inputButton8.getText()==playerO.getSymbol()&&inputButton9.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerX.getSymbol()&& inputButton4.getText()==playerX.getSymbol()&&inputButton7.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerO.getSymbol()&& inputButton4.getText()==playerO.getSymbol()&&inputButton7.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton2.getText()==playerX.getSymbol()&& inputButton5.getText()==playerX.getSymbol()&&inputButton8.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton2.getText()==playerO.getSymbol()&& inputButton5.getText()==playerO.getSymbol()&&inputButton8.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton3.getText()==playerX.getSymbol()&& inputButton6.getText()==playerX.getSymbol()&&inputButton9.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton3.getText()==playerO.getSymbol()&& inputButton6.getText()==playerO.getSymbol()&&inputButton9.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerX.getSymbol()&& inputButton5.getText()==playerX.getSymbol()&&inputButton9.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerO.getSymbol()&& inputButton5.getText()==playerO.getSymbol()&&inputButton9.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton3.getText()==playerX.getSymbol()&& inputButton5.getText()==playerX.getSymbol()&&inputButton7.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton3.getText()==playerO.getSymbol()&& inputButton5.getText()==playerO.getSymbol()&&inputButton7.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}
            }
            }
            
        });

            inputButton3.setPreferredSize(new Dimension(30, 30));
            inputButton3.setHorizontalAlignment(JTextField.CENTER);
            inputButton3.setFont(largerFont);
            formPanel.add(inputButton3);
            inputButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (inputButton3.getText().isEmpty()) {
                    if (mainLabel.getText().contains( players.get(currentPlayerIndex).getSymbol())){
                        inputButton3.setText(players.get(currentPlayerIndex).getSymbol());
                    mainLabel.setText("It's player " + players.get(newCurrentPlayerIndex).getSymbol() + "'s turn");
                }else if (mainLabel.getText().contains( players.get(newCurrentPlayerIndex).getSymbol())){
                    inputButton3.setText(players.get(newCurrentPlayerIndex).getSymbol());
                    mainLabel.setText("It's player " + players.get(currentPlayerIndex).getSymbol() + "'s turn");
                }

                    mainLabel.revalidate();
                    mainLabel.repaint();
                if(inputButton1.getText()==playerX.getSymbol()&& inputButton2.getText()==playerX.getSymbol()&&inputButton3.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerO.getSymbol()&& inputButton2.getText()==playerO.getSymbol()&&inputButton3.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton4.getText()==playerX.getSymbol()&& inputButton5.getText()==playerX.getSymbol()&&inputButton6.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton4.getText()==playerO.getSymbol()&& inputButton5.getText()==playerO.getSymbol()&&inputButton6.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton7.getText()==playerX.getSymbol()&& inputButton8.getText()==playerX.getSymbol()&&inputButton9.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton7.getText()==playerO.getSymbol()&& inputButton8.getText()==playerO.getSymbol()&&inputButton9.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerX.getSymbol()&& inputButton4.getText()==playerX.getSymbol()&&inputButton7.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerO.getSymbol()&& inputButton4.getText()==playerO.getSymbol()&&inputButton7.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton2.getText()==playerX.getSymbol()&& inputButton5.getText()==playerX.getSymbol()&&inputButton8.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton2.getText()==playerO.getSymbol()&& inputButton5.getText()==playerO.getSymbol()&&inputButton8.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton3.getText()==playerX.getSymbol()&& inputButton6.getText()==playerX.getSymbol()&&inputButton9.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton3.getText()==playerO.getSymbol()&& inputButton6.getText()==playerO.getSymbol()&&inputButton9.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerX.getSymbol()&& inputButton5.getText()==playerX.getSymbol()&&inputButton9.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerO.getSymbol()&& inputButton5.getText()==playerO.getSymbol()&&inputButton9.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton3.getText()==playerX.getSymbol()&& inputButton5.getText()==playerX.getSymbol()&&inputButton7.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton3.getText()==playerO.getSymbol()&& inputButton5.getText()==playerO.getSymbol()&&inputButton7.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}
            }
            }
            
        });

            inputButton4.setPreferredSize(new Dimension(30, 30));
            inputButton4.setHorizontalAlignment(JTextField.CENTER);
            inputButton4.setFont(largerFont);
            formPanel.add(inputButton4);
            inputButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            if (inputButton4.getText().isEmpty()) {
                    if (mainLabel.getText().contains( players.get(currentPlayerIndex).getSymbol())){
                        inputButton4.setText(players.get(currentPlayerIndex).getSymbol());
                    mainLabel.setText("It's player " + players.get(newCurrentPlayerIndex).getSymbol() + "'s turn");
                }else if (mainLabel.getText().contains( players.get(newCurrentPlayerIndex).getSymbol())){
                    inputButton4.setText(players.get(newCurrentPlayerIndex).getSymbol());
                    mainLabel.setText("It's player " + players.get(currentPlayerIndex).getSymbol() + "'s turn");
                }

                    mainLabel.revalidate();
                    mainLabel.repaint();
                if(inputButton1.getText()==playerX.getSymbol()&& inputButton2.getText()==playerX.getSymbol()&&inputButton3.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerO.getSymbol()&& inputButton2.getText()==playerO.getSymbol()&&inputButton3.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton4.getText()==playerX.getSymbol()&& inputButton5.getText()==playerX.getSymbol()&&inputButton6.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton4.getText()==playerO.getSymbol()&& inputButton5.getText()==playerO.getSymbol()&&inputButton6.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton7.getText()==playerX.getSymbol()&& inputButton8.getText()==playerX.getSymbol()&&inputButton9.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton7.getText()==playerO.getSymbol()&& inputButton8.getText()==playerO.getSymbol()&&inputButton9.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerX.getSymbol()&& inputButton4.getText()==playerX.getSymbol()&&inputButton7.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerO.getSymbol()&& inputButton4.getText()==playerO.getSymbol()&&inputButton7.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton2.getText()==playerX.getSymbol()&& inputButton5.getText()==playerX.getSymbol()&&inputButton8.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton2.getText()==playerO.getSymbol()&& inputButton5.getText()==playerO.getSymbol()&&inputButton8.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton3.getText()==playerX.getSymbol()&& inputButton6.getText()==playerX.getSymbol()&&inputButton9.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton3.getText()==playerO.getSymbol()&& inputButton6.getText()==playerO.getSymbol()&&inputButton9.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerX.getSymbol()&& inputButton5.getText()==playerX.getSymbol()&&inputButton9.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerO.getSymbol()&& inputButton5.getText()==playerO.getSymbol()&&inputButton9.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton3.getText()==playerX.getSymbol()&& inputButton5.getText()==playerX.getSymbol()&&inputButton7.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton3.getText()==playerO.getSymbol()&& inputButton5.getText()==playerO.getSymbol()&&inputButton7.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}
            }
            }
            
        });

            inputButton5.setPreferredSize(new Dimension(30, 30));
            inputButton5.setHorizontalAlignment(JTextField.CENTER);
            inputButton5.setFont(largerFont);
            formPanel.add(inputButton5);
            inputButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (inputButton5.getText().isEmpty()) {
                    if (mainLabel.getText().contains( players.get(currentPlayerIndex).getSymbol())){
                        inputButton5.setText(players.get(currentPlayerIndex).getSymbol());
                    mainLabel.setText("It's player " + players.get(newCurrentPlayerIndex).getSymbol() + "'s turn");
                }else if (mainLabel.getText().contains( players.get(newCurrentPlayerIndex).getSymbol())){
                    inputButton5.setText(players.get(newCurrentPlayerIndex).getSymbol());
                    mainLabel.setText("It's player " + players.get(currentPlayerIndex).getSymbol() + "'s turn");
                }

                    mainLabel.revalidate();
                    mainLabel.repaint();
                if(inputButton1.getText()==playerX.getSymbol()&& inputButton2.getText()==playerX.getSymbol()&&inputButton3.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerO.getSymbol()&& inputButton2.getText()==playerO.getSymbol()&&inputButton3.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton4.getText()==playerX.getSymbol()&& inputButton5.getText()==playerX.getSymbol()&&inputButton6.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton4.getText()==playerO.getSymbol()&& inputButton5.getText()==playerO.getSymbol()&&inputButton6.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton7.getText()==playerX.getSymbol()&& inputButton8.getText()==playerX.getSymbol()&&inputButton9.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton7.getText()==playerO.getSymbol()&& inputButton8.getText()==playerO.getSymbol()&&inputButton9.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerX.getSymbol()&& inputButton4.getText()==playerX.getSymbol()&&inputButton7.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerO.getSymbol()&& inputButton4.getText()==playerO.getSymbol()&&inputButton7.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton2.getText()==playerX.getSymbol()&& inputButton5.getText()==playerX.getSymbol()&&inputButton8.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton2.getText()==playerO.getSymbol()&& inputButton5.getText()==playerO.getSymbol()&&inputButton8.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton3.getText()==playerX.getSymbol()&& inputButton6.getText()==playerX.getSymbol()&&inputButton9.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton3.getText()==playerO.getSymbol()&& inputButton6.getText()==playerO.getSymbol()&&inputButton9.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerX.getSymbol()&& inputButton5.getText()==playerX.getSymbol()&&inputButton9.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerO.getSymbol()&& inputButton5.getText()==playerO.getSymbol()&&inputButton9.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton3.getText()==playerX.getSymbol()&& inputButton5.getText()==playerX.getSymbol()&&inputButton7.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton3.getText()==playerO.getSymbol()&& inputButton5.getText()==playerO.getSymbol()&&inputButton7.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}
            }
            }
            
        });

            inputButton6.setPreferredSize(new Dimension(30, 30));
            inputButton6.setHorizontalAlignment(JTextField.CENTER);
            inputButton6.setFont(largerFont);
            formPanel.add(inputButton6);
            inputButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            if (inputButton6.getText().isEmpty()) {
                    if (mainLabel.getText().contains( players.get(currentPlayerIndex).getSymbol())){
                        inputButton6.setText(players.get(currentPlayerIndex).getSymbol());
                    mainLabel.setText("It's player " + players.get(newCurrentPlayerIndex).getSymbol() + "'s turn");
                }else if (mainLabel.getText().contains( players.get(newCurrentPlayerIndex).getSymbol())){
                    inputButton6.setText(players.get(newCurrentPlayerIndex).getSymbol());
                    mainLabel.setText("It's player " + players.get(currentPlayerIndex).getSymbol() + "'s turn");
                }

                    mainLabel.revalidate();
                    mainLabel.repaint();
                if(inputButton1.getText()==playerX.getSymbol()&& inputButton2.getText()==playerX.getSymbol()&&inputButton3.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerO.getSymbol()&& inputButton2.getText()==playerO.getSymbol()&&inputButton3.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton4.getText()==playerX.getSymbol()&& inputButton5.getText()==playerX.getSymbol()&&inputButton6.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton4.getText()==playerO.getSymbol()&& inputButton5.getText()==playerO.getSymbol()&&inputButton6.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton7.getText()==playerX.getSymbol()&& inputButton8.getText()==playerX.getSymbol()&&inputButton9.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton7.getText()==playerO.getSymbol()&& inputButton8.getText()==playerO.getSymbol()&&inputButton9.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerX.getSymbol()&& inputButton4.getText()==playerX.getSymbol()&&inputButton7.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerO.getSymbol()&& inputButton4.getText()==playerO.getSymbol()&&inputButton7.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton2.getText()==playerX.getSymbol()&& inputButton5.getText()==playerX.getSymbol()&&inputButton8.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton2.getText()==playerO.getSymbol()&& inputButton5.getText()==playerO.getSymbol()&&inputButton8.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton3.getText()==playerX.getSymbol()&& inputButton6.getText()==playerX.getSymbol()&&inputButton9.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton3.getText()==playerO.getSymbol()&& inputButton6.getText()==playerO.getSymbol()&&inputButton9.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerX.getSymbol()&& inputButton5.getText()==playerX.getSymbol()&&inputButton9.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerO.getSymbol()&& inputButton5.getText()==playerO.getSymbol()&&inputButton9.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton3.getText()==playerX.getSymbol()&& inputButton5.getText()==playerX.getSymbol()&&inputButton7.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton3.getText()==playerO.getSymbol()&& inputButton5.getText()==playerO.getSymbol()&&inputButton7.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}
            }
            }
            
        });

            inputButton7.setPreferredSize(new Dimension(30, 30));
            inputButton7.setHorizontalAlignment(JTextField.CENTER);
            inputButton7.setFont(largerFont);
            formPanel.add(inputButton7);
            inputButton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (inputButton7.getText().isEmpty()) {
                    if (mainLabel.getText().contains( players.get(currentPlayerIndex).getSymbol())){
                        inputButton7.setText(players.get(currentPlayerIndex).getSymbol());
                    mainLabel.setText("It's player " + players.get(newCurrentPlayerIndex).getSymbol() + "'s turn");
                }else if (mainLabel.getText().contains( players.get(newCurrentPlayerIndex).getSymbol())){
                    inputButton7.setText(players.get(newCurrentPlayerIndex).getSymbol());
                    mainLabel.setText("It's player " + players.get(currentPlayerIndex).getSymbol() + "'s turn");
                }

                    mainLabel.revalidate();
                    mainLabel.repaint();
                if(inputButton1.getText()==playerX.getSymbol()&& inputButton2.getText()==playerX.getSymbol()&&inputButton3.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerO.getSymbol()&& inputButton2.getText()==playerO.getSymbol()&&inputButton3.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton4.getText()==playerX.getSymbol()&& inputButton5.getText()==playerX.getSymbol()&&inputButton6.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton4.getText()==playerO.getSymbol()&& inputButton5.getText()==playerO.getSymbol()&&inputButton6.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton7.getText()==playerX.getSymbol()&& inputButton8.getText()==playerX.getSymbol()&&inputButton9.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton7.getText()==playerO.getSymbol()&& inputButton8.getText()==playerO.getSymbol()&&inputButton9.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerX.getSymbol()&& inputButton4.getText()==playerX.getSymbol()&&inputButton7.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerO.getSymbol()&& inputButton4.getText()==playerO.getSymbol()&&inputButton7.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton2.getText()==playerX.getSymbol()&& inputButton5.getText()==playerX.getSymbol()&&inputButton8.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton2.getText()==playerO.getSymbol()&& inputButton5.getText()==playerO.getSymbol()&&inputButton8.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton3.getText()==playerX.getSymbol()&& inputButton6.getText()==playerX.getSymbol()&&inputButton9.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton3.getText()==playerO.getSymbol()&& inputButton6.getText()==playerO.getSymbol()&&inputButton9.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerX.getSymbol()&& inputButton5.getText()==playerX.getSymbol()&&inputButton9.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerO.getSymbol()&& inputButton5.getText()==playerO.getSymbol()&&inputButton9.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton3.getText()==playerX.getSymbol()&& inputButton5.getText()==playerX.getSymbol()&&inputButton7.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton3.getText()==playerO.getSymbol()&& inputButton5.getText()==playerO.getSymbol()&&inputButton7.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}
            }
            }
            
        });

            inputButton8.setPreferredSize(new Dimension(30, 30));
            inputButton8.setHorizontalAlignment(JTextField.CENTER);
            inputButton8.setFont(largerFont);
            formPanel.add(inputButton8);
            inputButton8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (inputButton8.getText().isEmpty()) {
                    if (mainLabel.getText().contains( players.get(currentPlayerIndex).getSymbol())){
                        inputButton8.setText(players.get(currentPlayerIndex).getSymbol());
                    mainLabel.setText("It's player " + players.get(newCurrentPlayerIndex).getSymbol() + "'s turn");
                }else if (mainLabel.getText().contains( players.get(newCurrentPlayerIndex).getSymbol())){
                    inputButton8.setText(players.get(newCurrentPlayerIndex).getSymbol());
                    mainLabel.setText("It's player " + players.get(currentPlayerIndex).getSymbol() + "'s turn");
                }

                    mainLabel.revalidate();
                    mainLabel.repaint();
                if(inputButton1.getText()==playerX.getSymbol()&& inputButton2.getText()==playerX.getSymbol()&&inputButton3.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerO.getSymbol()&& inputButton2.getText()==playerO.getSymbol()&&inputButton3.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton4.getText()==playerX.getSymbol()&& inputButton5.getText()==playerX.getSymbol()&&inputButton6.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton4.getText()==playerO.getSymbol()&& inputButton5.getText()==playerO.getSymbol()&&inputButton6.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton7.getText()==playerX.getSymbol()&& inputButton8.getText()==playerX.getSymbol()&&inputButton9.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton7.getText()==playerO.getSymbol()&& inputButton8.getText()==playerO.getSymbol()&&inputButton9.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerX.getSymbol()&& inputButton4.getText()==playerX.getSymbol()&&inputButton7.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerO.getSymbol()&& inputButton4.getText()==playerO.getSymbol()&&inputButton7.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton2.getText()==playerX.getSymbol()&& inputButton5.getText()==playerX.getSymbol()&&inputButton8.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton2.getText()==playerO.getSymbol()&& inputButton5.getText()==playerO.getSymbol()&&inputButton8.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton3.getText()==playerX.getSymbol()&& inputButton6.getText()==playerX.getSymbol()&&inputButton9.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton3.getText()==playerO.getSymbol()&& inputButton6.getText()==playerO.getSymbol()&&inputButton9.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerX.getSymbol()&& inputButton5.getText()==playerX.getSymbol()&&inputButton9.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerO.getSymbol()&& inputButton5.getText()==playerO.getSymbol()&&inputButton9.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton3.getText()==playerX.getSymbol()&& inputButton5.getText()==playerX.getSymbol()&&inputButton7.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton3.getText()==playerO.getSymbol()&& inputButton5.getText()==playerO.getSymbol()&&inputButton7.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}
            }
            }
            
        });

            inputButton9.setPreferredSize(new Dimension(30, 30));
            inputButton9.setHorizontalAlignment(JTextField.CENTER);
            inputButton9.setFont(largerFont);
            formPanel.add(inputButton9);
            inputButton9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (inputButton9.getText().isEmpty()) {
                    if (mainLabel.getText().contains( players.get(currentPlayerIndex).getSymbol())){
                        inputButton9.setText(players.get(currentPlayerIndex).getSymbol());
                    mainLabel.setText("It's player " + players.get(newCurrentPlayerIndex).getSymbol() + "'s turn");
                }else if (mainLabel.getText().contains( players.get(newCurrentPlayerIndex).getSymbol())){
                    inputButton9.setText(players.get(newCurrentPlayerIndex).getSymbol());
                    mainLabel.setText("It's player " + players.get(currentPlayerIndex).getSymbol() + "'s turn");
                }

                    mainLabel.revalidate();
                    mainLabel.repaint();
                if(inputButton1.getText()==playerX.getSymbol()&& inputButton2.getText()==playerX.getSymbol()&&inputButton3.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerO.getSymbol()&& inputButton2.getText()==playerO.getSymbol()&&inputButton3.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton4.getText()==playerX.getSymbol()&& inputButton5.getText()==playerX.getSymbol()&&inputButton6.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton4.getText()==playerO.getSymbol()&& inputButton5.getText()==playerO.getSymbol()&&inputButton6.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton7.getText()==playerX.getSymbol()&& inputButton8.getText()==playerX.getSymbol()&&inputButton9.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton7.getText()==playerO.getSymbol()&& inputButton8.getText()==playerO.getSymbol()&&inputButton9.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerX.getSymbol()&& inputButton4.getText()==playerX.getSymbol()&&inputButton7.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerO.getSymbol()&& inputButton4.getText()==playerO.getSymbol()&&inputButton7.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton2.getText()==playerX.getSymbol()&& inputButton5.getText()==playerX.getSymbol()&&inputButton8.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton2.getText()==playerO.getSymbol()&& inputButton5.getText()==playerO.getSymbol()&&inputButton8.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton3.getText()==playerX.getSymbol()&& inputButton6.getText()==playerX.getSymbol()&&inputButton9.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton3.getText()==playerO.getSymbol()&& inputButton6.getText()==playerO.getSymbol()&&inputButton9.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerX.getSymbol()&& inputButton5.getText()==playerX.getSymbol()&&inputButton9.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton1.getText()==playerO.getSymbol()&& inputButton5.getText()==playerO.getSymbol()&&inputButton9.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton3.getText()==playerX.getSymbol()&& inputButton5.getText()==playerX.getSymbol()&&inputButton7.getText()==playerX.getSymbol()){
    mainLabel.setText( "PLAYER " + playerX.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}else if(inputButton3.getText()==playerO.getSymbol()&& inputButton5.getText()==playerO.getSymbol()&&inputButton7.getText()==playerO.getSymbol()){
    mainLabel.setText( "PLAYER " + playerO.getSymbol()+ "  WON!!");
    mainLabel.revalidate();
    mainLabel.repaint();
}
            }
            }
            
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(4, 5, 5));
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
                
                inputButton1.setText("");
                inputButton2.setText("");
                inputButton3.setText("");
                inputButton4.setText("");
                inputButton5.setText("");
                inputButton6.setText("");
                inputButton7.setText("");
                inputButton8.setText("");
                inputButton9.setText("");
                mainLabel.setText("It's player " + players.get(currentPlayerIndex).getSymbol() + "'s turn");
            
        }
        });

        if (mainLabel.getText()=="PLAYER " + playerO.getSymbol()+ "  WON!!"){
            inputButton1.setEnabled(false);
        inputButton2.setEnabled(false);
        inputButton3.setEnabled(false);
        inputButton4.setEnabled(false);
        inputButton5.setEnabled(false);
        inputButton6.setEnabled(false);
        inputButton7.setEnabled(false);
        inputButton8.setEnabled(false);
        inputButton9.setEnabled(false);

        }else if(mainLabel.getText()=="PLAYER " + playerX.getSymbol()+ "  WON!!"){
            inputButton1.setEnabled(false);
        inputButton2.setEnabled(false);
        inputButton3.setEnabled(false);
        inputButton4.setEnabled(false);
        inputButton5.setEnabled(false);
        inputButton6.setEnabled(false);
        inputButton7.setEnabled(false);
        inputButton8.setEnabled(false);
        inputButton9.setEnabled(false);

        }
    

}

    public static void main(String[] args) throws Exception {
        MainFrame ticTacToeGame = new MainFrame();
        ticTacToeGame.initialize();
    }
}
