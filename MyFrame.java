import java.awt.Color;

import java.awt.FlowLayout;

import java.awt.Font;

import java.text.SimpleDateFormat;

import java.util.Calendar;

import javax.swing.JFrame;

import javax.swing.JLabel;

 

 

public class MyFrame extends JFrame  {

      

       Calendar calendar;

       SimpleDateFormat timeFormat,dayFormat,dateFormat;

       JLabel timeLable,Name,Wish,dayLable,dateLable;

      

       String time;

      

      

 

       MyFrame(){

              this.setBackground(Color.black);

              this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

              this.setTitle("My Clock Program");

              this.setLayout(new FlowLayout());

              this.setSize(450,400);

              this.setResizable(true);

             

             

              timeFormat=new SimpleDateFormat("hh:mm:ss a");

              dayFormat=new SimpleDateFormat("EEEE");

              dateFormat=new SimpleDateFormat("MMMMM dd, YYYY");

             

              //Name Comes From Here

              Name=new JLabel();

              Name.setText("Hi Naina,");

           Name.setFont(new Font("Ink Free",Font.PLAIN,50));

              Name.setForeground(Color.MAGENTA);

 

 

              //Time Comes From Here

              timeLable=new JLabel();

              time = timeFormat.format(calendar.getInstance().getTime());

              timeLable.setText(time);

              timeLable.setFont(new Font("Verdana",Font.PLAIN,50));

              timeLable.setForeground(new Color(0x00ff00));

             

              //day reflects from here

              dayLable=new JLabel();

           dayLable.setFont(new Font("Ink Free",Font.PLAIN,50));

             

              //date comes from here

              dateLable=new JLabel();

              dateLable.setFont(new Font("Ink Free",Font.PLAIN,50));

             

             

              //Adding To The Frame Is Done Here

              this.add(Name);

              this.add(timeLable);

              this.add(dayLable);

              this.add(dateLable);

              this.setVisible(true);

              //System.out.println(time.substring(0,2));

              setTime();

             

             

             

             

       }

      

       public void setTime() {  

             

              while(true) {

                     time = timeFormat.format(calendar.getInstance().getTime());

                     timeLable.setText(time);

                    

                     String day = dayFormat.format(calendar.getInstance().getTime());

                     dayLable.setText("Its "+day+" Today");

                    

                     String date = dateFormat.format(calendar.getInstance().getTime());

                     dateLable.setText(date);

                    

                     try {

                           Thread.sleep(1000);

                     }

                     catch (InterruptedException e){

                           e.printStackTrace();

                          

                     }                   

              }

       }

}
