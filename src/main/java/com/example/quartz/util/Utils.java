package com.example.quartz.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
    public static String makeTimeId() {
        SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMddHHmmssSSS");
        return sdf.format(new Date()) + ((int) (Math.random() * 900) + 100);
    }
}
