package br.com.mastertech.contact.dto.mapper;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContactResponse {

    @JsonProperty("nome")
    private String name;

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
