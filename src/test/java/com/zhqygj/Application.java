package com.zhqygj;


import com.zhqygj.domain.PrgBusiness;
import com.zhqygj.domain.PrgBusinessDetail;
import com.zhqygj.mapper.IPrgBusinessMapper;
import com.zhqygj.service.IPrgBusinessService;
import com.zhqygj.service.ISequenceService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

@SpringBootTest(classes = ZhqygjApplication.class)
@RunWith(SpringRunner.class)
public class Application {

    @Autowired
    private ISequenceService sequenceService;
    @Autowired
    private IPrgBusinessService prgBusinessService;
    private final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");


    @Test
    public void createDocTest() throws InterruptedException {
        //单据类型
        String bType = "PY";
        //单号前缀
        String prefixDoc = bType + dateTimeFormatter.format(LocalDateTime.now());

        Set<String> docNos = new HashSet<>();
        CountDownLatch countDownLatch = new CountDownLatch(100);
        //模拟并发生成单号
        for (int i = 0; i < 100; i++) {
            new Thread(() ->{
                docNos.add(sequenceService.sequence(bType, prefixDoc));
                countDownLatch.countDown();
            }).start();
        }
        //等待线程完成
        countDownLatch.await();
        System.out.println("单号生成个数：" + docNos.size());

    }

    @Test
    public void business() {
        PrgBusiness business = prgBusinessService.business("2021070001");
        List<PrgBusinessDetail> businessDetails = business.getBusinessDetails();

        System.err.println(business.toString());

        for (PrgBusinessDetail businessDetail : businessDetails) {
            System.err.println(businessDetail.toString());
        }
    }

}