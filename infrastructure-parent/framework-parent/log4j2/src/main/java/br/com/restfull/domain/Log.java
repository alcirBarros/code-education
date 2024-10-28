//package br.com.h2.domain;
//
//import java.io.Serializable;
//import java.util.Date;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Lob;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//
//@Entity
//@Table(name = "log")
//public class Log implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//
//    @Id
//    @Column(name = "LOG_ID")
//    private String logId;
//
//    @Column(name = "ENTRY_DATE")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date entryDate;
//
//    @Column(name = "LOGGER")
//    private String logger;
//
//    @Column(name = "LOG_LEVEL")
//    private String logLevel;
//
//    @Lob
//    @Column(name = "MESSAGE")
//    private String message;
//
//    @Lob
//    @Column(name = "EXCEPTION")
//    private String exception;
//
//    public String getLogId() {
//        return logId;
//    }
//
//    public void setLogId(String logId) {
//        this.logId = logId;
//    }
//
//    public Date getEntryDate() {
//        return entryDate;
//    }
//
//    public void setEntryDate(Date entryDate) {
//        this.entryDate = entryDate;
//    }
//
//    public String getLogger() {
//        return logger;
//    }
//
//    public void setLogger(String logger) {
//        this.logger = logger;
//    }
//
//    public String getLogLevel() {
//        return logLevel;
//    }
//
//    public void setLogLevel(String logLevel) {
//        this.logLevel = logLevel;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//
//    public String getException() {
//        return exception;
//    }
//
//    public void setException(String exception) {
//        this.exception = exception;
//    }
//
//    public Log() {
//    }
//
//}
