package com.thoughtworks.capability.gtb;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {
    public static long getDaysBetweenNextLaborDay(LocalDate date) {
        int nextYear=date.getMonthValue()>5?date.getYear() + 1:date.getYear();
        LocalDate nextLaborDay = LocalDate.of(nextYear, 5, 1);
        return nextLaborDay.toEpochDay()-date.toEpochDay();
    }
}
