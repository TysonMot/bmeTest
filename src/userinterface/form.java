package userinterface;
import Fibonacci.Fibonaccis;
import primes.prime;
import toasts.notifications;
import javax.swing.*;
import java.awt.*;
import java.util.Locale;

public class form {
    public static void userGui(){

        ///constructor methods for prime , fibonacci and error messages
        prime prime = new prime();
        notifications notify = new notifications();
        Fibonaccis fibonaccis = new Fibonaccis();

        //frame creation
        JPanel panel = new JPanel();
        JFrame frame = new JFrame("Calculator");
        frame.setSize(580,420);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        //j options and display label
        String options[] = { "Prime", "Fibonacci","Calculate prime and fibonacci" };
        JLabel heading = new JLabel("",JLabel.CENTER);

        //header
        JLabel label = new JLabel("A mini calculator".toUpperCase(Locale.ROOT));
        label.setBounds(50, 20, 700, 15);
        label.setForeground(Color.black);
        label.setFont(new Font("Robot",Font.BOLD,15));

        //text filed/ input field
        JTextField value = new JTextField();
        value.setBounds(250,60, 100,40);


        //button for calculation
        JButton calculate = new JButton("Calculate");
        calculate.setBounds(350,60,150,40);
        calculate.setForeground(Color.white);
        calculate.setBackground(Color.black);

        //combo box for dropdown selection
        JComboBox comboBox =  new JComboBox(options);
        comboBox.setBounds(50,60,200,40);

        //text area rendering/displaying calculated values
        JTextArea textArea = new JTextArea("Calculated results will be displayed here....");
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(Color.cyan);

        //new scroller to wrap text area
        JScrollPane areaScrollPane = new JScrollPane(textArea);
        areaScrollPane.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        areaScrollPane.setBounds(50,120,450,200);

        //add event listener/anonymous function to a button to calculate both prime, fibonacci and do some validations
        calculate.addActionListener(e -> {
           if(value.getText().isEmpty()){
                notify.setmsg("Please enter number to calculate prime, fibonacci");
                notify.warning();
           }else {
               //try and catch method for validation
               try {
                   int number = Integer.parseInt(value.getText());
                   if(comboBox.getSelectedItem() == "Prime"){
                       textArea.setText("Prime numbers \n" + prime.values(number));
                   }else if (comboBox.getSelectedItem() == "Fibonacci"){
                       textArea.setText("Fibonacci numbers : \n" + fibonaccis.Fibonacci(number));
                   }else {
                       textArea.setText("Prime numbers \n\n" + prime.values(number) + "\n\n Fibonacci numbers : \n\n" + fibonaccis.Fibonacci(number));
                   }
               }catch (NumberFormatException exception) {
                   notify.setmsg("Only integer numbers are allowed, Example: 1, 2 , 5");
                   notify.errorMsg();
                   value.setText("");
                   textArea.setText("");
               }
           }
        });

        ///adding items to the panel for rendering
        panel.add(label);
        panel.add(heading);
        panel.add(areaScrollPane);
        panel.add(calculate);
        panel.add(value);
        panel.add(comboBox);
        frame.setVisible(true);
    }
}
