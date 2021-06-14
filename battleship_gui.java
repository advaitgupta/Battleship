import java.net.URL;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class battleship_gui implements ActionListener
{ 
    int i=0;
    int j=280;
    int l=100;
    int e=0;
    int aa=0;
    int pp=0;
    int f1=0;
    int g1=0;
    int click=0;
    int q1=0;
    int to=0;
    int colo=0;
    int jhola=0;
    private String name1="";
    private String name2="";
    
    
    private String v[]=new String[90];
    
    private Color blue =new Color(119, 150, 199);
    private Color blue1 =new Color(197, 214, 240);
    private Color blue2 =new Color(30, 30, 30);
   
    private int clicks = 0;
    
    
    private JTextArea area5=new JTextArea("  ADMIRAL");  
    private JButton button50=new JButton("  NAME");  
    private JTextArea area6=new JTextArea("  ADMIRAL");  
    
    String imgLocation500 = "/pics/LOGO.jpg";
    URL imageURL500 = getClass().getResource(imgLocation500);
    ImageIcon zoomInIcon500 = new ImageIcon(imageURL500);

    private JTextArea area=new JTextArea("  WELCOME ADMIRAL");  
    private JTextArea area50=new JTextArea("  CHOICES LEFT: 5");  
    String imgLocation50 = "/pics/title.jpg";
URL imageURL50 = getClass().getResource(imgLocation50);
ImageIcon zoomInIcon50 = new ImageIcon(imageURL50);
    private JButton b50=new JButton(zoomInIcon50);  
   
    private JButton[] b=new JButton[90];  
    String imgLocation17 = "/pics/name.jpg";
URL imageURL17 = getClass().getResource(imgLocation17);
ImageIcon zoomInIcon17 = new ImageIcon(imageURL17);
    private JButton b5=new JButton(zoomInIcon17);  
    String imgLocation18 = "/pics/Battleship2.jpg";
URL imageURL18 = getClass().getResource(imgLocation18);
ImageIcon zoomInIcon18 = new ImageIcon(imageURL18);
    private JButton b6=new JButton(zoomInIcon18);   
    
    
    private JFrame f=new JFrame("Battleship"); 
    
    String imgLocation = "/pics/Battleship.jpg";
URL imageURL = getClass().getResource(imgLocation);
ImageIcon zoomInIcon = new ImageIcon(imageURL);

    private JButton b1=new JButton(zoomInIcon);

    String imgLocation100 = "/pics/p1.jpg";
URL imageURL100 = getClass().getResource(imgLocation100);
ImageIcon zoomInIcon100 = new ImageIcon(imageURL100);

    private JButton b10=new JButton(zoomInIcon100);
    String imgLocation101 = "/pics/p2.jpg";
    URL imageURL101 = getClass().getResource(imgLocation101);
    ImageIcon zoomInIcon101 = new ImageIcon(imageURL101);
    
        private JButton b11=new JButton(zoomInIcon101);

    public battleship_gui()
    {
        for(colo=0;colo<90;colo++)
    {
    v[colo]="0";
}
f.setIconImage(zoomInIcon500.getImage());
        b1.setBounds(0,0,980,730);
        
        b1.addActionListener(this);
        String ss="Start";
        b1.setName(ss);
        f.add(b1);
        f.setSize(980,730);    
    f.setLayout(null);    
    f.setVisible(true);    
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.getContentPane().setBackground(blue);
    }
    public void game()
    {    
        
       



    for(int k=1;k<10;k++)
    {
    for(i=0;i<10;i++)
    {
        String imgLocation1 = "/pics/a.jpg";
URL imageURL1 = getClass().getResource(imgLocation1);
ImageIcon zoomInIcon1 = new ImageIcon(imageURL1);
        b[e]=new JButton(zoomInIcon1);
        b[e].setBounds(j,l,70,70);
        f.add(b[e]);
        b[e].addActionListener(this);
        String s=String.valueOf(e);
        b[e].setName(s);
        
        
        j=j+70;
        e++;


    }
    j=280;
    l=l+70;
}

b5.setBounds(0,100,280,145);
f.add(b5);
        
        
        
        b6.setBounds(0,385,280,90);
        
        
        
        f.add(b6);


    
    
    

   
    
   
    f.add(area);

    area.setEditable(false);
    area.setBounds(10,475,270,255);
    
    area.setFont(new Font("Helvetica", Font.PLAIN, 30));
    area.setLineWrap(true);
    area.setBackground(blue);
        area.setWrapStyleWord(true);
        area.setForeground(blue1);

        f.add(area50);
    
    area50.setEditable(false);
    area50.setBounds(10,255,270,130);
    
    area50.setFont(new Font("Helvetica", Font.PLAIN, 30));
    area50.setLineWrap(true);
    area50.setBackground(blue);
        area50.setWrapStyleWord(true);
        area50.setForeground(blue1);


        b50.setBounds(0,0,980,100);
        
        f.add(b50);
        
        
        
        
        
        
            
            b5.add(button50);
            button50.setFont(new Font("Helvetica", Font.BOLD, 12));
            button50.setOpaque(false);
            button50.setBorderPainted(false);
            button50.setContentAreaFilled(false);
            button50.setForeground(Color.WHITE);
            button50.setBounds(16,185,86,25);
            button50.setVisible(true);

  
   
   

    
    
    f.setSize(980,730);    
    f.setLayout(null);    
    f.setVisible(true);    
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    name1 = JOptionPane.showInputDialog(f,
    "What is your name?", null);
    if(name1==null)
    name1="ANONYMOUS";
    
    area.setText("  WELCOME ADMIRAL "+name1+"!");
    button50.setText(name1);
    
           
    }

    public void last_page()
    {
       area50.setVisible(false);
                    
                    area.setVisible(false);
                    b50.setVisible(false);
                    button50.setVisible(false);
                    b5.setVisible(false);
                    b6.setVisible(false);
                    f.remove(area50);
                    f.remove(b50);
                    f.remove(button50);
                 
                    f.remove(b5);
                    f.remove(b6);
                    f.remove(area);
                    for(int yuhu=0;yuhu<90;yuhu++)
                    {
                        b[yuhu].setVisible(false);
                        f.remove(b[yuhu]);
                    }
        b10.setBounds(0,0,980,127);
        
        
        String ss1="END";
        
        b11.setBounds(0,292,980,408);
        
        b11.addActionListener(this);
        
        b11.setName(ss1);

        
    
    area5.setEditable(false);
    area6.setEditable(false);
    area5.setLineWrap(true);
    
        area5.setWrapStyleWord(true);
        area6.setLineWrap(true);
    
        area6.setWrapStyleWord(true);
        
        area5.setBounds(0,127,490,165);
    area5.setFont(new Font("Avenir", Font.BOLD, 30));
    area6.setBounds(490,127,490,165);
    area6.setFont(new Font("Avenir", Font.BOLD, 30));
    area5.setBackground(blue2);
    area6.setBackground(blue2);
    
    area5.setForeground(Color.WHITE);
    area6.setForeground(Color.WHITE);
    
    
    
    if(jhola==1)
    {
    area5.setText("ADMIRAL " +name1+" WON");
    area6.setText("ADMIRAL "+name2+" LOST");
    }
    else if(jhola==2)
    {
        area5.setText("ADMIRAL "+name2+" WON");
    area6.setText("ADMIRAL "+name1+" LOST");
    }
    
    f.add(area5);
    f.add(area6);
        
        f.add(b10);
        
        f.add(b11);
        
       
        

    }
        
        public void actionPerformed(ActionEvent e) 
        {
            JButton o6 = (JButton)e.getSource();
    String na6 = o6.getName();
    if(na6=="END")
    {
        System.exit(0);
    }
            JButton o2 = (JButton)e.getSource();
    String na2 = o2.getName();
    if(na2=="Start")
    {
        b1.setVisible(false);
        f.remove(b1);
    game();
}
          else
          {  
            click++;
           if(aa==0)
           {
            clicks++;
            
            
            JButton o = (JButton)e.getSource();
    String name = o.getName();
    
    
    int q=Integer.parseInt(name);
    if(v[q]=="1")
    clicks--;
    
    
            if((clicks==1)&&((q>5&&q<10)||(q>15&&q<20)||(q>25&&q<30)||(q>35&&q<40)||(q>45&&q<50)||(q>55&&q<60)||(q>65&&q<70))){
                area.setText("ADMIRAL! PLEASE START FROM LATITUDE 6°E OR EARLIER!");
                
                clicks=0;
                click=0;
                
            }
            
            else if(v[q]!="1"){

                v[q]="1";
                if(q>=0&&q<10)
                {
                    int pos1=q+1;
                    String pos=String.valueOf(pos1);
                    area.setText("Ship set at  "+pos+"°E  1°S");

                }
                else if(q>=10&&q<20)
                {
                    int pos1=q-10+1;
                    String pos=String.valueOf(pos1);
                    area.setText("Ship set at  "+pos+"°E  2°S");

                }
                else if(q>=20&&q<30)
                {
                    int pos1=q-20+1;
                    String pos=String.valueOf(pos1);
                    area.setText("Ship set at  "+pos+"°E  3°S");

                }
                else if(q>=30&&q<40)
                {
                    int pos1=q-30+1;
                    String pos=String.valueOf(pos1);
                    area.setText("Ship set at  "+pos+"°E  4°S");

                }
                else if(q>=40&&q<50)
                {
                    int pos1=q-40+1;
                    String pos=String.valueOf(pos1);
                    area.setText("Ship set at  "+pos+"°E  5°S");

                }
                else if(q>=50&&q<60)
                {
                    int pos1=q-50+1;
                    String pos=String.valueOf(pos1);
                    area.setText("Ship set at  "+pos+"°E  6°S");

                }
                else if(q>=60&&q<70)
                {
                    int pos1=q-60+1;
                    String pos=String.valueOf(pos1);
                    area.setText("Ship set at  "+pos+"°E  7°S");

                }
                else if(q>=70&&q<80)
                {
                    int pos1=q-70+1;
                    String pos=String.valueOf(pos1);
                    area.setText("Ship set at  "+pos+"°E  8°S");

                }
                else if(q>=80&&q<90)
                {
                    int pos1=q-80+1;
                    String pos=String.valueOf(pos1);
                    area.setText("Ship set at  "+pos+"°E  9°S");

                }

           
            if(clicks==1)
            {
                
                String imgLocation2 = "/pics/w1.png";
URL imageURL2 = getClass().getResource(imgLocation2);
ImageIcon zoomInIcon2 = new ImageIcon(imageURL2);
             b[q].setIcon(zoomInIcon2);
             f1=q;

            }
            else if(clicks==2)
            {
                String imgLocation3 = "/pics/w2.png";
URL imageURL3 = getClass().getResource(imgLocation3);
ImageIcon zoomInIcon3 = new ImageIcon(imageURL3);
            b[q].setIcon(zoomInIcon3);
            }
            else if(clicks==3)
            {
                String imgLocation4 = "/pics/w3.png";
                URL imageURL4 = getClass().getResource(imgLocation4);
                ImageIcon zoomInIcon4 = new ImageIcon(imageURL4);
                            b[q].setIcon(zoomInIcon4);
            }
            else if(clicks==4)
            {
                String imgLocation5 = "/pics/w4.png";
                URL imageURL5 = getClass().getResource(imgLocation5);
                ImageIcon zoomInIcon5 = new ImageIcon(imageURL5);
                            b[q].setIcon(zoomInIcon5);
            }
            else if(clicks==5)
            {
                String imgLocation6 = "/pics/w5.png";
                URL imageURL6 = getClass().getResource(imgLocation6);
                ImageIcon zoomInIcon6 = new ImageIcon(imageURL6);
                            b[q].setIcon(zoomInIcon6);
            }
        }
        
            if(clicks<5)
            area50.setText("  CHOICES LEFT: " + (5-clicks));
            else
            area50.setText("  Selection Done  " );
            if(clicks==5)
            {
            int optionType = JOptionPane.OK_CANCEL_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Selection Complete! Click 'OK' to continue or click 'Cancel' to exit", "Message", optionType);
            if(result == JOptionPane.CANCEL_OPTION)
            System.exit(0);
            else if (result == JOptionPane.OK_OPTION) 
            {
                aa=1;
                clicks=0;
                pp=0;
                area50.setText("  CHOICES LEFT: 10");
            }
          }
        }
    }
                if(aa==1)
                {
                    
                    
                    
                    if(pp==0)
                    {
                    button50.setText("NAME");
                    
                for(int q1=f1;q1<(f1+5);q1++)
                {
                    String imgLocation7 = "/pics/a.jpg";
                URL imageURL7 = getClass().getResource(imgLocation7);
                ImageIcon zoomInIcon7 = new ImageIcon(imageURL7);
                    b[q1].setIcon(zoomInIcon7);
                }
                area.setText("  WELCOME ADMIRAL!");

                name2 = JOptionPane.showInputDialog(f,"What is your name?", null);
                if(name2==null||name2=="")
                name2="ANONYMOUS";
                button50.setText(name2);
                area.setText("  WELCOME ADMIRAL "+name2+"!");
                pp=1;
            }
            if((pp==1)&&(click>5))
            {
                clicks++;
                area50.setText("  CHOICES LEFT: " +(10-clicks));
                JButton o1 = (JButton)e.getSource();
                String na = o1.getName();
                int q1=Integer.parseInt(na);
                int so=q1/10;
                int east=q1%10+1;
                if(v[q1]!="1")
                area.setText("No Ship found at "+east+"°E "+so+"°S");
                
                if(v[q1]=="1")
                {
                    v[q1]="0";
                    g1++;
                    area.setText("Boom! Ship part found and detonated at "+east+"°E "+so+"°S");
                    if(q1==f1)
                    {
                        String imgLocation8 = "/pics/blast-1.jpg";
                    URL imageURL8 = getClass().getResource(imgLocation8);
                    ImageIcon zoomInIcon8 = new ImageIcon(imageURL8);
                    b[q1].setIcon(zoomInIcon8);
                    
                    }
                    else if(q1==(f1+1))
                    {
                        String imgLocation9 = "/pics/blast-2.jpg";
                        URL imageURL9 = getClass().getResource(imgLocation9);
                        ImageIcon zoomInIcon9 = new ImageIcon(imageURL9);
                        b[q1].setIcon(zoomInIcon9);
                    }
                    else if(q1==(f1+2))
                    {
                        String imgLocation10 = "/pics/blast-3.jpg";
                        URL imageURL10 = getClass().getResource(imgLocation10);
                        ImageIcon zoomInIcon10 = new ImageIcon(imageURL10);
                        b[q1].setIcon(zoomInIcon10);
                    }
                    else if(q1==(f1+3))
                    {
                        String imgLocation11 = "/pics/blast-4.jpg";
                        URL imageURL11 = getClass().getResource(imgLocation11);
                        ImageIcon zoomInIcon11 = new ImageIcon(imageURL11);
                        b[q1].setIcon(zoomInIcon11);
                    }
                    else if(q1==(f1+4)){
                        String imgLocation12 = "/pics/blast-5.jpg";
                        URL imageURL12 = getClass().getResource(imgLocation12);
                        ImageIcon zoomInIcon12 = new ImageIcon(imageURL12);
                        b[q1].setIcon(zoomInIcon12);

                }
            }
                if(g1==5)
                {
                    jhola=2;
                    
                    area50.setText("  Thanks for Playing");
                    last_page();
                    
                    


                   
                
                
                }
                else if(clicks==10)
                {
                    jhola=1;
                    area50.setText("  Thanks for Playing");
                    last_page();
                    
                    
                
                

                }




                
            }
                }
            
    
        
             
            
        }
      
        
        public static void main(String[] args)
        {
            
        new battleship_gui();   
        }
}
    
    