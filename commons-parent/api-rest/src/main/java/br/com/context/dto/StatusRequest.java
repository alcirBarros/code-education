package br.com.context.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;
import org.hibernate.validator.constraints.br.TituloEleitoral;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Schema(description = "Classe StatusRequest")
public class StatusRequest {

    @NotBlank(message = "{validation.constraints.only.numbers}")
    @Schema(description = "Exemplo de propriedade NotBlank")
    private String notBlank;
    @NotNull
    @Schema(description = "Exemplo de propriedade NotNull")
    private String notNull;
    @CPF
    @Schema(description = "Exemplo de propriedade Cpf")
    private String cpf;
    @CNPJ
    @Schema(description = "Exemplo de propriedade Cnpj")
    private String cnpj;
    @Positive
    @Schema(description = "Exemplo de propriedade Número Positivo")
    private String positive;
    @Email(groups = OtpEmailChecks.class)
    @Schema(description = "Exemplo de propriedade E-Mail")
    private String email;
    @TituloEleitoral
    @Schema(description = "Exemplo de propriedade Titulo Eleitoral")
    private String tituloEleitoral;
    @Length.List({
            @Length(min = 5, message = "The field must be at least 5 characters"),
            @Length(max = 50, message = "The field must be less than 50 characters")
    })
    @Schema(description = "Exemplo de propriedade length")
    private String myString;
    @Digits(integer=6, fraction=2, message ="Valor fracionado.")
    @Schema(description = "Exemplo de propriedade Número com Decimal")
    private BigDecimal bigDecimal;
    @Pattern(regexp="^(FREE|BASIC|PREMIUM)$", message="For the account type only the values FREE, BASIC, or PREMIUM are accepted.")
    private String accountType;
    @PastOrPresent
    private LocalDate localDate;

//    @Date
//    private String date;

    @JsonFormat(locale = "hu", shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm", timezone = "Europe/Budapest")
    private Date date;
    @Pattern(regexp = "[A-z]*", message = "Atenção, digite somente letras")
    private String somenteLetra;
    @Pattern(regexp = "[0-9]*", message = "{validation.constraints.only.numbers}")
    private String somenteNumero;
    @JsonProperty("json_property")
    private String jsonProperty;
    @Valid
    private List<NotificationRequest> notificationRequestList;

    public String getNotBlank() {
        return notBlank;
    }

    public void setNotBlank(String notBlank) {
        this.notBlank = notBlank;
    }

    public String getNotNull() {
        return notNull;
    }

    public void setNotNull(String notNull) {
        this.notNull = notNull;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getPositive() {
        return positive;
    }

    public void setPositive(String positive) {
        this.positive = positive;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTituloEleitoral() {
        return tituloEleitoral;
    }

    public void setTituloEleitoral(String tituloEleitoral) {
        this.tituloEleitoral = tituloEleitoral;
    }

    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }

    public BigDecimal getBigDecimal() {
        return bigDecimal;
    }

    public void setBigDecimal(BigDecimal bigDecimal) {
        this.bigDecimal = bigDecimal;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

//    public String getDate() {
//        return date;
//    }
//
//    public void setDate(String date) {
//        this.date = date;
//    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSomenteLetra() {
        return somenteLetra;
    }

    public void setSomenteLetra(String somenteLetra) {
        this.somenteLetra = somenteLetra;
    }

    public String getSomenteNumero() {
        return somenteNumero;
    }

    public void setSomenteNumero(String somenteNumero) {
        this.somenteNumero = somenteNumero;
    }

    public String getJsonProperty() {
        return jsonProperty;
    }

    public void setJsonProperty(String jsonProperty) {
        this.jsonProperty = jsonProperty;
    }

    public List<NotificationRequest> getNotificationRequestList() {
        return notificationRequestList;
    }

    public void setNotificationRequestList(List<NotificationRequest> notificationRequestList) {
        this.notificationRequestList = notificationRequestList;
    }
}
