package Projects;

import javax.swing.*;

public class Main {

    //public String creatureName;
    public static final String[] deepThings = {"Squid", "Jellyfish"};
    public static Boolean OK = true;
    public static String jmoniker;
    public static Integer jtentacles;
    public static Boolean jstingInk;
    public static Integer jcunning;
    public static Double jspeed;

    public static void main(String[] args) {

        //WateryGUI  thing = new WateryGUI();
       // System.out.println("The object just created is called " + thing.getcreatureName());

        //http://alvinalexander.com/java/joptionpane-showinputdialog-examples
        //Combo box by A Alexander

        JFrame frame = new JFrame("Input Dialog Example 3");
        String favouriteCreature = (String) JOptionPane.showInputDialog(frame,
                "Choose a creature?",
                "",
                JOptionPane.QUESTION_MESSAGE,
                null,
                deepThings,
                deepThings[0]);
        // favouriteCreature will be null if the user clicks Cancel
        //System.out.println("Favourite creature is " +  favouriteCreature);

        if (favouriteCreature == "Squid"){

            //String squidName = thing.getcreatureName();
            DeepSquid  squid1 = new DeepSquid();

            String squidName = JOptionPane.showInputDialog(null, "Enter a name for the Squid");
            squid1.setMoniker(squidName);
           //System.out.println("The SQUID just created is called " + squid1.getMoniker());

            jmoniker = squid1.getMoniker();
            jtentacles = squid1.getTentacles();
            jstingInk = squid1.getInk();
            jcunning = squid1.getCunning();
            jspeed = squid1.getSpeed();
        }

        if (favouriteCreature == "Jellyfish"){

            DeepJellyfish  jellyfish1 = new DeepJellyfish();

            String jellyfishName = JOptionPane.showInputDialog(null, "Enter a name for the Jellyfish");
            jellyfish1.setMoniker(jellyfishName);
            //System.out.println("The JELLYFISH just created is called " + jellyfish1.getMoniker());

            jmoniker = jellyfish1.getMoniker();
            jtentacles = jellyfish1.getTentacles();
            jstingInk = jellyfish1.getSting();
            jcunning = jellyfish1.getCunning();
            jspeed = jellyfish1.getSpeed();

        } //Output everything via the GUI?
        //System.out.println("the sting or Ink is " + jstingInk );
        //pass the jellyfish to constructor for battling
        Battle someBattle = new Battle(jmoniker, jtentacles, jstingInk, jcunning ,jspeed );

        JOptionPane.showMessageDialog( //Brings up a message.
                null, "The name is: " + jmoniker, "",
                JOptionPane.PLAIN_MESSAGE);

        JOptionPane.showMessageDialog( //Brings up a message.
                null, "The number of tentacles: " + jtentacles, "",
                JOptionPane.PLAIN_MESSAGE);

        JOptionPane.showMessageDialog( //Brings up a message.
                null, "Sting or Ink is: " + jstingInk, "",
                JOptionPane.PLAIN_MESSAGE);

        JOptionPane.showMessageDialog( //Brings up a message.
                null, "The cunning level is: " + jcunning, "",
                JOptionPane.PLAIN_MESSAGE);

        JOptionPane.showMessageDialog( //Brings up a message.
                null, "The speed is: " + jspeed, "",
                JOptionPane.PLAIN_MESSAGE);
    }
}