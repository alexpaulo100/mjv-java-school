package com.mjvschool.notificacao.util;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DataUtil {
    
    public static Date preparaData(String dataHora){
        SimpleDateFormat fmt = new SimpleDateFormat("YYYYMMDD HHMM");
        try {
            return fmt.parse(dataHora);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }        
    }

    public static String preparaData(Date data){
        SimpleDateFormat fmt = new SimpleDateFormat("DD/MM/YYYY");
        return fmt.format(data);
    }

    public static String preparaHora(Date data){
        SimpleDateFormat fmt = new SimpleDateFormat("HH:MM");
        return fmt.format(data);
    }
}
