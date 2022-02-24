package com.mjvschool.atracao.util;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DataUtil {
    public static String preparaData(Date data){
        SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
        return fmt.format(data);
    }

    public static String preparaHora(Date data){
        SimpleDateFormat fmt = new SimpleDateFormat("HHMM");
        return fmt.format(data);
    }
}
