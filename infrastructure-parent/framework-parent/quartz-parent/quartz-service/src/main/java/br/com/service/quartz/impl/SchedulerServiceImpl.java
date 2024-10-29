package br.com.service.quartz.impl;

import br.com.context.model.quartz.SchedulerJobInfo;
import br.com.quartz.framework.QuartzFramework;

import br.com.repository.quartz.SchedulerRepository;
import br.com.service.quartz.SchedulerService;
import java.time.ZonedDateTime;
import java.util.Date;
import org.quartz.JobDetail;
import org.quartz.Trigger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SchedulerServiceImpl implements SchedulerService {

    @Autowired
    private QuartzFramework quartzFramework;
    
    @Autowired
    private SchedulerRepository schedulerRepository;
    @Override
    public SchedulerJobInfo scheduleNewJob(SchedulerJobInfo scheduleEmailRequest) {
        try {

            ZonedDateTime dateTime = ZonedDateTime.of(scheduleEmailRequest.getDateTime(), scheduleEmailRequest.getTimeZone());
            JobDetail jobDetail = quartzFramework.buildJobDetail("group");
            Trigger trigger = quartzFramework.buildJobTrigger(jobDetail, Date.from(dateTime.toInstant()));
            Date scheduleNewJob = quartzFramework.scheduleNewJob(jobDetail, trigger);
            return schedulerRepository.save(scheduleEmailRequest);
        } catch (Exception ex) {
            System.err.println(ex);
            return null;
        }
    }

}
