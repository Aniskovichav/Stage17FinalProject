package by.itstep.aniskovich.java.stage17.lunchdelivery.util;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleService {
//    private WeeklyStatementService weeklyStatementService;
//    private ScheduledExecutorService scheduler;
//
//    public ScheduleService(WeeklyStatementService weeklyStatementService) {
//        this.weeklyStatementService = weeklyStatementService;
//        this.scheduler = Executors.newScheduledThreadPool(1);
//    }
//
//    public void startWeeklyStatementGeneration() {
//        // Определение времени запуска (четверг, 00:00)
//        LocalDateTime now = LocalDateTime.now();
//        LocalDateTime nextThursday = now.with(DayOfWeek.THURSDAY).with(LocalTime.MIDNIGHT);
//        if (now.compareTo(nextThursday) > 0) {
//            nextThursday = nextThursday.plusWeeks(1);
//        }
//
//        // Вызов метода формирования актов сверки каждый четверг
//        long initialDelay = nextThursday.until(now, TimeUnit.SECONDS.toChronoUnit());
//        scheduler.scheduleAtFixedRate(weeklyStatementService::generateWeeklyStatements,
//                initialDelay, TimeUnit.DAYS.toSeconds(7), TimeUnit.SECONDS);
//    }
}

