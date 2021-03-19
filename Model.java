
package com.mycompany.ihmprj;
import java.lang.String;

public class Model {
    private String Nom;
    private String Prenom;
    private String Pseudo;
    private String Email;
    private String Tele;
    private String MotPass;
    private String Confirmation;

    Model(String nom,String prenom,String pseudo,String email,String tele,String motpass,String Confi){
        this.Nom=nom;
        this.Prenom=prenom;
        this.Pseudo=pseudo;
        this.Email=email;
        this.Tele=tele;
        this.MotPass=motpass;
        this.Confirmation=Confi;
    }

    public Model() {    }
    public void setNom(String nom) {
        Nom = nom;
    }
    public void setPrenom(String prenom) {
        Prenom = prenom;
    }
    public void setPseudo(String pseudo) {
        Pseudo = pseudo;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public void setConfirmation(String confirmation) {
        Confirmation = confirmation;
    }
    public void setMotPass(String motPass) {
        MotPass = motPass;
    }
    public void setTele(String tele) {
        Tele = tele;
    }
    public String getNom() {
        return Nom;
    }
    public String getPrenom() {
        return Prenom;
    }
    public String getPseudo() {
        return Pseudo;
    }
    public String getEmail() {
        return Email;
    }
    public String getConfirmation() {
        return Confirmation;
    }
    public String getMotPass() {
        return MotPass;
    }
    public String getTele() {
        return Tele;
    }

    void DispObj(){
        System.out.println();
        System.out.println("Nom = \t"+this.Nom);
        System.out.println("Prenom = \t"+this.Prenom);
        System.out.println("Pseudo = \t"+this.Pseudo);
        System.out.println("Email = \t"+this.Email);
        System.out.println("Phone = \t"+this.Tele);
        System.out.print("Password = \t"+this.MotPass);
        System.out.println("\tConfirmation = \t"+this.Confirmation);
        System.out.println();
    }
}
class Node{
    private Model x;
    private Node Next;

    Node(Model a){
        this.x=a;
        this.Next=null;
    }
    public Model getX() {
        return x;
    }
    public Node getNext() {
        return Next;
    }
    public void setX(Model x) {
        this.x = x;
    }
    public void setNext(Node next) {
        Next = next;
    }
}
class List {
    private Node head;

    List(){
        head=null;
    }

    public Node getHead() {
        return head;
    }
    public void setHead(Node head) {
        this.head = head;
    }
    public boolean IsEmpty(){
        return this.head==null;
    }
    public List Push(Model a){
        if(this.IsEmpty())
            this.head=new Node(a);
        else{
            Node p;
            for ( p=this.head;p.getNext()!=null;p=p.getNext());
            p.setNext(new Node(a));
        }
        System.out.println("\nOperation success.");
        return this;
    }
    public void DisplayUserList(){
        if(this.IsEmpty())
            System.out.println("\nList Is Empty");
        else{
            Node p;int cpt=0;
            System.out.println();
            for ( p=this.head;p!=null;p=p.getNext()){
                System.out.println("\t User "+ ++cpt);
                p.getX().DispObj();
            }
        }
    }
    public int  VerifyExistance(String Pseudo,String Email){
        if(this.IsEmpty()) return 0;
        int pseudo=0,email=0;
        for(Node p=head;p!=null;p=p.getNext()){
            if (p.getX().getPseudo().equals(Pseudo)) pseudo=1;
            if (p.getX().getEmail().equals(Email)) email=2;
        }
        return pseudo+email;
    }
    public Boolean VerifyLogInRequest(String Email,String pseudo,String Password){
        if (Email==null&&pseudo==null||Password==null) return false;
        for(Node p=head;p!=null;p=p.getNext())
            if (p.getX().getPseudo().equals(pseudo) && p.getX().getEmail().equals(Email) && p.getX().getMotPass().equals(Password)) return true;
        return false;
    }
}