package com.company.project.task;

import com.company.project.model.Stock;
import com.company.project.service.StockService;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.lang.InterruptedException;
import java.util.Date;

/**
 * Created by ergou on 2017/11/03.
 */

@Component
public class ScheduleTask {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private Integer count0 = 1;
    private Integer count1 = 1;
    private Integer count2 = 1;

    @Resource
    private StockService stockService;

    @Scheduled(cron = "0 */1 * * * ?")
    public void reportCurrentTime() throws InterruptedException {
      System.out.println(String.format("---第%s次执行，当前时间为：%s", count0++, dateFormat.format(new Date())));
        List<Stock> stocks =  stockService.findAll();
        for (Stock stock : stocks)
        {
            String isnull = "";
            if(stock.getAmount() <= 10){
                isnull = "库存为"+stock.getAmount()+",报警!!!";
            }
            System.out.println("================="+stock.getProductId()+"--"+stock.getAmount()+isnull);
        }
    }

   /* @Scheduled(fixedDelay = 5000)
    public void reportCurrentTimeAfterSleep() throws InterruptedException {
      System.out.println(String.format("===第%s次执行，当前时间为：%s", count1++, dateFormat.format(new Date())));
    }

    @Scheduled(cron = "0 0 1 * * *")
    public void reportCurrentTimeCron() throws InterruptedException {
      System.out.println(String.format("+++第%s次执行，当前时间为：%s", count2++, dateFormat.format(new Date())));
    }*/

}
