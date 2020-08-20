package br.com.mastertech.contact.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CreateContactRequest {

    @NotNull
    @NotBlank
    @JsonProperty("nome")
    private String name;

    @NotNull
    @NotBlank
    @JsonProperty("telefone")
    private String telephone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
