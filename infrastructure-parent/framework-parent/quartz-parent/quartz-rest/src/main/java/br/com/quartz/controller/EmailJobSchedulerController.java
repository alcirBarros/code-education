package br.com.quartz.controller;

import br.com.context.model.quartz.SchedulerJobInfo;
import br.com.quartz.payload.ScheduleEmailResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.service.quartz.SchedulerService;

import java.time.ZonedDateTime;

@RestController
public class EmailJobSchedulerController {

    private static final Logger logger = LoggerFactory.getLogger(EmailJobSchedulerController.class);


    @Autowired
    private SchedulerService schedulerService;

    @PostMapping("/scheduleEmail")
    public ResponseEntity<ScheduleEmailResponse> scheduleEmail(@RequestBody SchedulerJobInfo scheduleEmailRequest) {
        try {
            ZonedDateTime dateTime = ZonedDateTime.of(scheduleEmailRequest.getDateTime(), scheduleEmailRequest.getTimeZone());

            if (dateTime.isBefore(ZonedDateTime.now())) {
                ScheduleEmailResponse scheduleEmailResponse = new ScheduleEmailResponse(false, "dateTime must be after current time");
                return ResponseEntity.badRequest().body(scheduleEmailResponse);
            }

            scheduleEmailRequest.setJobGroup("email-jobs");
            
            SchedulerJobInfo scheduleNewJob = schedulerService.scheduleNewJob(scheduleEmailRequest);
            
            ScheduleEmailResponse scheduleEmailResponse = new ScheduleEmailResponse(true, scheduleNewJob.getKeyName(), scheduleNewJob.getKeyGroup(), "Email Scheduled Successfully!");
            
            return ResponseEntity.ok(scheduleEmailResponse);

        } catch (Exception ex) {
            logger.error("Error scheduling email", ex);
            ScheduleEmailResponse scheduleEmailResponse = new ScheduleEmailResponse(false, "Error scheduling email. Please try later!");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(scheduleEmailResponse);
        }
    }


}
