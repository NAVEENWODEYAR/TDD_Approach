package com.unit.mockito.service;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

/**
 * @author Naveen K Wodeyaar,
 * @Date 27-Feb-2026
 */

public class ShareMarketStatus {

    public static void main(String[] args) {

        // Get current date and time in Indian Standard Time
        LocalDateTime now = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
        DayOfWeek today = now.getDayOfWeek();
        LocalTime currentTime = now.toLocalTime();

        // Market timings
        LocalTime marketOpen = LocalTime.of(9, 15);
        LocalTime marketClose = LocalTime.of(15, 30);

        boolean isWeekend = (today == DayOfWeek.SATURDAY || today == DayOfWeek.SUNDAY);

        if (isWeekend) {
            System.out.println("Market is CLOSED (Weekend)");
        } 
        else if (currentTime.isAfter(marketOpen) && currentTime.isBefore(marketClose)) {
            System.out.println("Market is OPEN");
        } 
        else {
            System.out.println("Market is CLOSED (Outside trading hours)");
        }

        System.out.println("Current IST Time: " + now);
    }
}