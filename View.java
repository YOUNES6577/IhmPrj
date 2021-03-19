package com.mycompany.ihmprj;
import javax.swing.*;
import java.awt.*;

public  interface View {
 public void SetupLayout(JFrame View);
}

class SignUPView  extends JFrame implements View {
    private JLabel NomLabel;
    private JTextField NomField;
    private JLabel PrenomLabel;
    private JTextField PrenomField;
    private JLabel PseudoLabel;
    private JTextField PseudoField;
    private JLabel EmailLabel;
    private JTextField EmailField;
    private JLabel TeleLabel;
    private JTextField TeleField;
    private JLabel PassLabel;
    private JPasswordField PassField;
    private JLabel ConfLabel;
    private JPasswordField ConfField;
    private JLabel PassMsg;
    private JLabel ConfPassMsg;
    private JButton ANNBtn;
    private JButton OKBtn;
    private JCheckBox BoxButton;
    private JCheckBox BoxButton1;
    private JLabel LoginLabel;
    private JLabel LoginLabel1;

    public JTextField getPrenomField() {
        return PrenomField;
    }
    public JTextField getNomField() {
        return NomField;
    }
    public JTextField getPseudoField() {
        return PseudoField;
    }
    public JTextField getEmailField() {
        return EmailField;
    }
    public JTextField getTeleField() {
        return TeleField;
    }
    public JPasswordField getPassField() {
        return PassField;
    }
    public JPasswordField getConfField() {
        return ConfField;
    }
    public JLabel getPassMsg() {
        return PassMsg;
    }
    public JLabel getConfPassMsg() {
        return ConfPassMsg;
    }
    public JButton getOKBtn() {
        return OKBtn;
    }
    public JButton getANNBtn() {
        return ANNBtn;
    }
    public JCheckBox getBoxButton() {
        return BoxButton;
    }
    public JCheckBox getBoxButton1() {
        return BoxButton1;
    }
    public JLabel getLoginLabel1(){
        return LoginLabel1;
    }

    public SignUPView(){
        this.setSize(550,600);
        this.setResizable(false);
        this.setTitle("Sign Up");
        NomLabel = new JLabel("Nom");
        NomField = new JTextField();        NomField.setBorder(null);
        PrenomLabel = new JLabel("Prenom");
        PrenomField = new JTextField();     PrenomField.setBorder(null);
        PseudoLabel = new JLabel("Pseudo");
        PseudoField = new JTextField();     PseudoField.setBorder(null);
        EmailLabel = new JLabel("Email");
        EmailField = new JTextField();      EmailField.setBorder(null);
        TeleLabel = new JLabel("Phone");
        TeleField = new JTextField();       TeleField.setBorder(null);
        PassLabel = new JLabel("Password");
        ConfLabel = new JLabel("Confirmation");
        ANNBtn = new JButton("Cancel"); //ANNBtn.setBorder(null);
        OKBtn = new JButton("Ok");      //OKBtn.setBorder(null);
        PassField = new JPasswordField();    PassField.setBorder(null);
        ConfField = new JPasswordField();    ConfField.setBorder(null);
        PassMsg= new JLabel();
        ConfPassMsg= new JLabel();
        BoxButton=new JCheckBox ("Show Password");
        BoxButton1=new JCheckBox ("Make Sure That You Read All Terms .");
        LoginLabel=new JLabel("You have an account ?");LoginLabel1=new JLabel("Login ");


        NomLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        PrenomLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        PseudoLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        EmailLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        TeleLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        PassLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        ConfLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        PassMsg.setFont(new Font("Verdana", Font.PLAIN, 10));
        ConfPassMsg.setFont(new Font("Verdana", Font.PLAIN, 10));
        ANNBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
        OKBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
        BoxButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        BoxButton1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        ANNBtn.setBackground(new Color(240,240,240));
        OKBtn.setBackground(Color.lightGray);
        OKBtn.setEnabled(false);
        LoginLabel.setFont(new Font("Tahoma", Font.PLAIN+Font.BOLD, 12));
        LoginLabel1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        LoginLabel1.setForeground(new Color(26, 140, 255));
        this.setVisible(true);
        SetupLayout(this);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation((int) ((dimension.getWidth() - this.getWidth()) / 2), (int) ((dimension.getHeight() - this.getHeight()) / 2));
    }
    @Override
    public void SetupLayout(JFrame View) {
       NomLabel.setBounds(50, 10, 150, 30);
       PrenomLabel.setBounds(280,10,150,30);
       /** */
       NomField.setBounds(50,40,220,35);
       PrenomField.setBounds(280,40,220,35);
       /** */
       PseudoLabel.setBounds(50, 90, 150, 25);
       PseudoField.setBounds(50, 120, 390, 35);
       /** */
       EmailLabel.setBounds(50, 165, 150, 25);
       EmailField.setBounds(50, 190,390, 35);
       /** */
       TeleLabel.setBounds(50, 235, 150, 25);
       TeleField.setBounds(50,270,390,35);
       /** */
       PassLabel.setBounds(50, 325, 150, 30);
       ConfLabel.setBounds(280, 325, 150, 30);
       /** */
       PassField.setBounds(50, 360, 210, 35);
       ConfField.setBounds(280, 360, 210, 35);
       /** */
       PassMsg.setBounds(50,390,210,35);
       ConfPassMsg.setBounds(280,390,210,35);
       BoxButton.setBounds(50,415,150,20);
       BoxButton1.setBounds(50,435,300,20);
        /** */
       ANNBtn.setBounds(70, 475, 135, 35);
       OKBtn.setBounds(320, 475, 135, 35);
       LoginLabel.setBounds(10,520,170,35);
       LoginLabel1.setBounds(180,520,50,35);
       /** */

        View.add(NomLabel);         View.add(PrenomLabel);
        View.add(NomField);         View.add(PrenomField);
        View.add(PseudoLabel);      View.add(PseudoField);
        View.add(EmailLabel);       View.add(EmailField);
        View.add(TeleLabel);        View.add(TeleField);
        View.add(PassLabel);        View.add(PassField);
        View.add(ConfLabel);        View.add(ConfField);
        View.add(PassMsg);          View.add(ConfPassMsg);
        View.add(ANNBtn);           View.add(OKBtn);
        View.add(BoxButton);        View.add(BoxButton1);
        View.add(LoginLabel);       View.add(LoginLabel1);

        setLayout(null);
    }
    public static void main(String args[]){
        new SignUPViewController(new Model(), new SignUPView());
    }
}

class LogInView extends JFrame implements View{
    private JLabel title;
    private JLabel EmailLabel;
    private JTextField EmailField;
    private JLabel PasswordLabel;
    private JPasswordField PasswordField;
    private JButton ConnectButton;
    private JLabel inscription;
    private JCheckBox BoxButton;
    private JLabel SignUP;

    public JLabel gettitle() {
        return title;
    }

//    public JLabel getEmailLabel() {
//        return EmailLabel;
//    }

    public JTextField getEmailField() {
        return EmailField;
    }

//    public JLabel getPasswordLabel() {
//        return PasswordLabel;
//    }

    public JPasswordField getPasswordField() {
        return PasswordField;
    }

    public JButton getConnectButton() {
        return ConnectButton;
    }

    public JCheckBox getBoxButton() {
        return BoxButton;
    }

    public JLabel getSignUP() {
        return SignUP;
    }

    public LogInView(){
        this.setSize(500,450);
        this.setLayout(null);
        this.setResizable(false);

        title=new JLabel("Sign Up");
        EmailLabel=new JLabel("Email ou Pseudo");
        EmailField=new JTextField();
        PasswordLabel=new JLabel("Password");
        PasswordField=new JPasswordField();
        BoxButton=new JCheckBox ("Show Password");
        ConnectButton=new JButton("Sign up");
        SignUP=new JLabel("SignUP");
        SetupLayout(this);
        this.setVisible(true);
        ConnectButton.setBackground(new Color(240,240,240));
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation((int) ((dimension.getWidth() - this.getWidth()) / 2), (int) ((dimension.getHeight() - this.getHeight()) / 2));
    }
    @Override
    public void SetupLayout(JFrame View){
        title.setFont(new Font("Serif", Font.BOLD, 20));

        title.setBounds(200,50,100,30);
        EmailLabel.setBounds(120,100,100,30);
        EmailField.setBounds(120,130,250,30);
        PasswordLabel.setBounds(120,160,70,30);
        PasswordField.setBounds(120,190,250,30);
        BoxButton.setBounds(120,220,120,30);
        ConnectButton.setBounds(200,270,100,30);
        SignUP.setBounds(140,330,50,30);

        View.add(title);        View.add(EmailLabel);
        View.add(EmailField);        View.add(PasswordLabel);
        View.add(PasswordField);        View.add(BoxButton);
        View.add(ConnectButton);        View.add(SignUP);
        setLayout(null);
    }
    public static void main(String[] args) {
        new LogInView();
    }
}