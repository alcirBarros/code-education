package br.com.context.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class NotificationRequest {

    @NotBlank
    @Schema(description = "Exemplo de propriedade NotBlank")
    private String notBlank;
    @NotNull
    @Schema(description = "Exemplo de propriedade NotNull")
    private String notNull;

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
}
