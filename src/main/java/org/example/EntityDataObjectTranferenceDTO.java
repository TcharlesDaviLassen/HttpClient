package org.example;

import java.util.Date;
import java.util.List;

public class EntityDataObjectTranferenceDTO {

    private String date;
    private String name;
    private String type;

    private List<EntityDataObjectTranferenceDTO> itens;
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<EntityDataObjectTranferenceDTO> getItens() {
        return itens;
    }

    public void setItens(List<EntityDataObjectTranferenceDTO> itens) {
        this.itens = itens;
    }

    public String toString() {
        return String.format("date:%s,name:%s,type:%s", date, name, type);
    }
}
