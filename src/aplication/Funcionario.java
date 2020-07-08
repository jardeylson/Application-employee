package aplication;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {

    private String name;
    private Integer number;
    private String cpf;

    public Funcionario() {
    }

    public Funcionario(String name, Integer number, String cpf) {
        this.name = name;
        this.number = number;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String toString(){
        return "name: "
                +name
                +"\n"
                +"Employee number: "
                +number
                + "\n"
                + "Cpf: "
                +cpf;
    }
}
