package com.example.ifpr.tccdaalana;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtils {

    public static String getDate() {
        SimpleDateFormat dataBD = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate  = dataBD.format(new Date());
        return formattedDate;
    }

    public static String getTime() {
        SimpleDateFormat horaBD = new SimpleDateFormat("HH:mm:ss");
        String formattedTime  = horaBD.format(new Date());
        return formattedTime;
    }
}
