package QuizApp;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    	Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name+" Read The Instructions" );
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("times new roman", Font.PLAIN, 16));
        rules.setText(
            "<html>"+ 
                "1. You’ve got 15 minutes to conquer these questions—make every second count." + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answe.r" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory." + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. No peeking! Keep your eyes on your own screen—integrity is everything." + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions." + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted." + "<br><br>" +
                "8. Check if you made it to the top. If not, there’s always the next round!." + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}