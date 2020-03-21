package com.chubb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {

    // GUI
    private JPanel panelMain;
    private JPanel panelCont;
    private JPanel panelWelcome;
    private JPanel panelReport;
    private JPanel panelNotes;
    private JPanel panelCoverLetter;
    private JPanel panelPackages;

    private CardLayout cl = new CardLayout();

    private JButton coverLetterButton;
    private JButton notesButton;
    private JButton reportButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton buttonBack;
    private JButton buttonNext;

    // Variables for LaTeX file
    private String name;

    // Eventually get from online?
    private String[] packages = {"enumitem", "amsmath", "tabularx"};

    public App() {


        panelCont.setLayout(cl);


        panelCont.add(panelWelcome, "1");
        panelCont.add(panelReport, "2");
        panelCont.add(panelNotes, "3");
        panelCont.add(panelCoverLetter, "4");
        panelCont.add(panelPackages, "5");


        cl.show(panelCont, "1");


        reportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                buttonsOn();

                goToReportScreen();

            }
        });
        notesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                buttonsOn();

                goToNotesScreen();

            }
        });
        coverLetterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                buttonsOn();

                goToCoverLetterScreen();

            }
        });

    }


    private void buttonsOn() {

        buttonBack.setEnabled(true);
        buttonNext.setEnabled(true);

        buttonBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // if packages return to previous

                goToWelcomeScreen();

            }
        });

        buttonNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // check if all fields filled

                goToPackagesScreen();

            }
        });

    }

    private void goToWelcomeScreen(){

        cl.show(panelCont, "1");

        buttonNext.setEnabled(false);
        buttonBack.setEnabled(false);

    }

    private void goToReportScreen() {

        cl.show(panelCont, "2");


    }

    private void goToNotesScreen() {

        cl.show(panelCont, "3");

    }

    private void goToCoverLetterScreen() {

        cl.show(panelCont, "4");

    }

    private void goToPackagesScreen() {

        cl.show(panelCont, "4");

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
