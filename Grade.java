import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Grade{
    
    public Grade(){

        JFrame J = new JFrame("PDEU 3rd SEM CGPA Calculator");
        J.setSize(1500,750);
        J.setLayout(null);

        J.getContentPane().setBackground(Color.decode("#E5DBA0")); 

        Font F0 = new Font("Arial Black",Font.BOLD,30);
        Font F1 = new Font("Times Of Roman",Font.BOLD,50);
        Font F = new Font("Arial",Font.PLAIN,20);

        //Theory Subject
        JLabel L01 = new JLabel("Theory Subjects",SwingConstants.CENTER);
        L01.setBounds(20, 20, 500, 35);
        L01.setFont(F0);
        L01.setForeground(Color.decode("#423C6B"));
        J.add(L01);

        //Lab
        JLabel L02 = new JLabel("Lab Subjects",SwingConstants.CENTER);
        L02.setBounds(20, 370, 500, 35);
        L02.setFont(F0);
        L02.setForeground(Color.decode("#423C6B"));
        J.add(L02);
 
        //Mid Sem, IA, End Sem
        JLabel L12 = new JLabel("Mid SEM",SwingConstants.CENTER);
        JLabel L13 = new JLabel("IA",SwingConstants.CENTER);
        JLabel L14 = new JLabel("End SEM",SwingConstants.CENTER);
        L12.setBounds(600, 20, 150, 30);
        L12.setFont(F0);
        L12.setForeground(Color.decode("#6D9496"));
        J.add(L12);
        L13.setBounds(800, 20, 150, 30);
        L13.setFont(F0);
        L13.setForeground(Color.decode("#6D9496"));
        J.add(L13);
        L14.setBounds(1000, 20, 150, 30);
        L14.setFont(F0);
        L14.setForeground(Color.decode("#6D9496"));
        J.add(L14);

        //File/Lab, Lab Exam
        JLabel L22 = new JLabel("File/Lab",SwingConstants.CENTER);
        JLabel L23 = new JLabel("Lab Exam",SwingConstants.CENTER);
        L22.setBounds(600, 370, 150, 30);
        L22.setFont(F0);
        L22.setForeground(Color.decode("#6D9496"));
        J.add(L22);
        L23.setBounds(785, 370, 200, 30);
        L23.setFont(F0);
        L23.setForeground(Color.decode("#6D9496"));
        J.add(L23);

        //DM 
        JLabel L1 = new JLabel("Discrete Mathematics :");
        L1.setBounds(20, 70, 500, 30);
        L1.setFont(F);
        J.add(L1);

        JTextField T11 = new JTextField();
        JTextField T12 = new JTextField();
        JTextField T13 = new JTextField();
        T11.setBounds(650, 70, 50, 30);
        T11.setFont(F);
        J.add(T11);
        T12.setBounds(855, 70, 50, 30);
        T12.setFont(F);
        J.add(T12);
        T13.setBounds(1050, 70, 50, 30);
        T13.setFont(F);
        J.add(T13);

        //DS
        JLabel L2 = new JLabel("Data Structures : ");
        L2.setBounds(20, 120, 500, 30);
        L2.setFont(F); 
        J.add(L2);

        JTextField T21 = new JTextField();
        JTextField T22 = new JTextField();
        JTextField T23 = new JTextField();
        T21.setBounds(650, 120, 50, 30);
        T21.setFont(F);
        J.add(T21);
        T22.setBounds(855, 120, 50, 30);
        T22.setFont(F);
        J.add(T22);
        T23.setBounds(1050, 120, 50, 30);
        T23.setFont(F);
        J.add(T23);

        //JAVA
        JLabel L3 = new JLabel("Object Oriented Programming With Java : ");
        L3.setBounds(20, 170, 500, 30);
        L3.setFont(F);
        J.add(L3);

        JTextField T31 = new JTextField();
        JTextField T32 = new JTextField();
        JTextField T33 = new JTextField();
        T31.setBounds(650, 170, 50, 30);
        T31.setFont(F);
        J.add(T31);
        T32.setBounds(855, 170, 50, 30);
        T32.setFont(F);
        J.add(T32);
        T33.setBounds(1050, 170, 50, 30);
        T33.setFont(F);
        J.add(T33);

        //DECO
        JLabel L4 = new JLabel("Digital Electronics and Computer Organization : ");
        L4.setBounds(20, 220, 500, 30);
        L4.setFont(F);
        J.add(L4);
        
        JTextField T41 = new JTextField();
        JTextField T42 = new JTextField();
        JTextField T43 = new JTextField();
        T41.setBounds(650, 220, 50, 30);
        T41.setFont(F);
        J.add(T41);
        T42.setBounds(855, 220, 50, 30);
        T42.setFont(F);
        J.add(T42);
        T43.setBounds(1050, 220, 50, 30);
        T43.setFont(F);
        J.add(T43);

        //MPI
        JLabel L5 = new JLabel("Microprocessor Programming and Interfacing : ");
        L5.setBounds(20, 270, 500, 30);
        L5.setFont(F);
        J.add(L5);
        
        JTextField T51 = new JTextField();
        JTextField T52 = new JTextField();
        JTextField T53 = new JTextField();
        T51.setBounds(650, 270, 50, 30);
        T51.setFont(F);
        J.add(T51);
        T52.setBounds(855, 270, 50, 30);
        T52.setFont(F);
        J.add(T52);
        T53.setBounds(1050, 270, 50, 30);
        T53.setFont(F);
        J.add(T53);

        //OE 
        JLabel L6 = new JLabel("Open Elective :");
        L6.setBounds(20, 320, 500, 30);
        L6.setFont(F);
        J.add(L6);

        JTextField T61 = new JTextField();
        JTextField T62 = new JTextField();
        JTextField T63 = new JTextField();
        T61.setBounds(650, 320, 50, 30);
        T61.setFont(F);
        J.add(T61);
        T62.setBounds(855, 320, 50, 30);
        T62.setFont(F);
        J.add(T62);
        T63.setBounds(1050, 320, 50, 30);
        T63.setFont(F);
        J.add(T63);


        //DS Lab
        JLabel L7 = new JLabel("Data Structures Lab : ");
        L7.setBounds(20, 420, 500, 30);
        L7.setFont(F);
        J.add(L7);
        
        JTextField T71 = new JTextField();
        JTextField T72 = new JTextField();
        T71.setBounds(650, 420, 50, 30);
        T71.setFont(F);
        J.add(T71);
        T72.setBounds(855, 420, 50, 30);
        T72.setFont(F);
        J.add(T72);

        //JAVA LAb 
        JLabel L8 = new JLabel("Object Oriented Programming With Java Lab: ");
        L8.setBounds(20, 470, 500, 30);
        L8.setFont(F);
        J.add(L8);
        
        JTextField T81 = new JTextField();
        JTextField T82 = new JTextField();
        T81.setBounds(650, 470, 50, 30);
        T81.setFont(F);
        J.add(T81);
        T82.setBounds(855, 470, 50, 30);
        T82.setFont(F);
        J.add(T82);

        //DECO lab
        JLabel L9 = new JLabel("Digital Electronics and Computer Organization Lab : ");
        L9.setBounds(20, 520, 500, 30);
        L9.setFont(F);
        J.add(L9);
        
        JTextField T91 = new JTextField();
        JTextField T92 = new JTextField();
        T91.setBounds(650, 520, 50, 30);
        T91.setFont(F);
        J.add(T91);
        T92.setBounds(855, 520, 50, 30);
        T92.setFont(F);
        J.add(T92);

        //MPI lab
        JLabel L10 = new JLabel("Microprocessor Programming and Interfacing Lab : ");
        L10.setBounds(20, 570, 500, 30);
        L10.setFont(F);
        J.add(L10);

        JTextField T101 = new JTextField();
        JTextField T102 = new JTextField();
        T101.setBounds(650, 570, 50, 30);
        T101.setFont(F);
        J.add(T101);
        T102.setBounds(855, 570, 50, 30);
        T102.setFont(F);
        J.add(T102);

        //Button CGPA
        JButton B1 = new JButton("Calculate CGPA");

        //label CGPA
        JLabel LCG1 = new JLabel("CGPA");

        B1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    double  y1 = (((Float.parseFloat(T11.getText()))/2) + (Float.parseFloat(T12.getText())) + ((Float.parseFloat(T13.getText()))/2));
                    double  y2 = (((Float.parseFloat(T21.getText()))/2) + (Float.parseFloat(T22.getText())) + ((Float.parseFloat(T23.getText()))/2));
                    double  y3 = (((Float.parseFloat(T31.getText()))/2) + (Float.parseFloat(T32.getText())) + ((Float.parseFloat(T33.getText()))/2));
                    double  y4 = (((Float.parseFloat(T41.getText()))/2) + (Float.parseFloat(T42.getText())) + ((Float.parseFloat(T43.getText()))/2));
                    double  y5 = (((Float.parseFloat(T51.getText()))/2) + (Float.parseFloat(T52.getText())) + ((Float.parseFloat(T53.getText()))/2));
                    double  y6 = (((Float.parseFloat(T61.getText()))/2) + (Float.parseFloat(T62.getText())) + ((Float.parseFloat(T63.getText()))/2));

                    int x1 = Math.round((float) y1);
                    int x2 = Math.round((float) y2);
                    int x3 = Math.round((float) y3);
                    int x4 = Math.round((float) y4);
                    int x5 = Math.round((float) y5);
                    int x6 = Math.round((float) y6);

                    double c1 = check(x1);
                    double c2 = check(x2);
                    double c3 = check(x3);
                    double c4 = check(x4);
                    double c5 = check(x5);
                    double c6 = check(x6);

                    double y7 = (Float.parseFloat(T71.getText()) + (Float.parseFloat(T72.getText())));
                    double y8 = (Float.parseFloat(T81.getText()) + (Float.parseFloat(T82.getText())));
                    double y9 = (Float.parseFloat(T91.getText()) + (Float.parseFloat(T92.getText())));
                    double y10 = (Float.parseFloat(T101.getText()) + (Float.parseFloat(T102.getText())));

                    int x7 = Math.round((float) y7);
                    int x8 = Math.round((float) y8);
                    int x9 = Math.round((float) y9);
                    int x10 = Math.round((float) y10);

                    double c7 = check(x7);
                    double c8 = check(x8);
                    double c9 = check(x9);
                    double c10 = check(x10);

                    double Result1 = (((4*c1)+(3*c2)+(3*c3)+(3*c4)+(2*c5)+(3*c6)+(1*c7)+(1*c8)+(1*c9)+(1*c10))/(4+3+3+3+2+3+1+1+1+1));
                    String Result2 = String.valueOf(Result1);
                    LCG1.setText(Result2);
                }
                catch(Exception ex){
                    JFrame J2 = new JFrame("Result");
                    J2.setSize(400,250);

                    Font FC1 = new Font("Arial",Font.PLAIN,25);

                    JLabel LC1 = new JLabel("Enter Proper Marks",SwingConstants.CENTER);
                    LC1.setFont(FC1);
                    J2.add(LC1);
                    
                    J2.setVisible(true);
                    J2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }
        });

        J.setVisible(true);
        J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        B1.setBounds(0, 660, 1500, 50);
        B1.setFont(F0);
        B1.setBackground(Color.decode("#6B6A3C")); 
        B1.setForeground(Color.decode("#B4E4EB")); 
        J.add(B1);

        LCG1.setBounds(1150, 480, 200, 50);
        LCG1.setFont(F1);
        LCG1.setForeground(Color.decode("#3C656B"));
        J.add(LCG1);

    }
    public static double check(double  x) {
        if (x >= 80){
            return 10;
        }
        else if ( x >= 70 && x <= 79 ){
            return 9;
        }
        else if ( x >= 60 && x <= 69 ){
            return 8;
        }
        else if ( x >= 55 && x <= 59 ){
            return 7;
        }
        else if ( x >= 50 && x <= 54 ){
            return 6;
        }
        else if ( x >= 45 && x <= 49 ){
            return 5;
        }
        else if ( x >= 40 && x <= 44 ){
            return 4;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        new Grade();
    }
}