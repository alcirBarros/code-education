package br.com.service.quartz;

import br.com.context.model.quartz.SchedulerJobInfo;

public interface SchedulerService {
    
    SchedulerJobInfo scheduleNewJob(SchedulerJobInfo scheduleEmailRequest);

}
