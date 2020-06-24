package br.com.matertech.kafka;

import java.util.Random;

public class Client {

    private Boolean access;
    private String name;
    private int port;

    public Client(String name, int port) {
        this.name = name;
        this.port = port;
        this.checkAcces();
    }

    public Client(){

    }

    public Boolean checkAcces(){
        Random random = new Random();
        this.access = random.nextBoolean();
        return this.access;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public Boolean getAcess() {
        return access;
    }

    public void setAcess(Boolean acess) {
        this.access = acess;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
