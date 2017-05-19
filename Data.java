package Conta;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Data {
    public static void main(String[] args) {
        List<String> dates = new ArrayList<String>();
        String timeStamp ="";
        for(int i=0; i<3;) // Pode mudar esse 3 pro numero em segundos que vc quer
        {
            try {
                Thread.sleep(1000); // Por quanto tempo ela dorme
                timeStamp = new SimpleDateFormat("yyyy/MM/dd - HH:mm:ss").format(Calendar.getInstance().getTime());
                dates.add(timeStamp);
                i++;
            } catch (InterruptedException e) {
                //e.printStackTrace();    // Isso aqui eh coisa da linguagem
            }
        }
        for (String date: dates)
        {
            System.out.println(date);
        }

    }

}