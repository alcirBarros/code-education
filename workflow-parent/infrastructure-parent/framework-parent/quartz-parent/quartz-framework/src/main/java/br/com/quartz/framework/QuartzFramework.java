package br.com.quartz.framework;

import br.com.quartz.job.EmailJob;

import java.util.Date;
import java.util.UUID;
import org.quartz.JobBuilder;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Component;

@Component
public class QuartzFramework {

    @Autowired
    private SchedulerFactoryBean schedulerFactoryBean;

    public Date scheduleNewJob(JobDetail jobDetail, Trigger trigger) throws Exception {
        try {
            Scheduler scheduler = schedulerFactoryBean.getScheduler();
            return scheduler.scheduleJob(jobDetail, trigger);
        } catch (Exception ex) {
            System.err.println(ex);
            throw ex;
        }
    }

    public JobDetail buildJobDetail(String group) {

        JobDataMap jobDataMap = new JobDataMap();
//        jobDataMap.put("email", scheduleEmailRequest.getEmail());
//        jobDataMap.put("subject", scheduleEmailRequest.getSubject());
//        jobDataMap.put("body", scheduleEmailRequest.getBody());

        return JobBuilder.newJob(EmailJob.class)
                .withIdentity(UUID.randomUUID().toString(), group)
                //  .withDescription("Send Email Job")
                .usingJobData(jobDataMap)
                .storeDurably()
                .build();

    }

    public Trigger buildJobTrigger(JobDetail jobDetail, Date date) {



        return TriggerBuilder.newTrigger()
                .forJob(jobDetail)
                .withIdentity(jobDetail.getKey().getName(), "email-triggers")
                //         .withDescription("Send Email Trigger")
                .startAt(date)
                .withSchedule(SimpleScheduleBuilder.simpleSchedule().withMisfireHandlingInstructionFireNow())
                .build();
    }

}
