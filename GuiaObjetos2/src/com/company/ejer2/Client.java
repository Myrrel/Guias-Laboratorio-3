package com.company.ejer2;

import java.util.UUID;

public class Client {
    private UUID idClient;
    private String name;
    private String email;
    private double clientDiscount;

    public Client(String name, String email, double clientDiscount) {
        idClient = UUID.randomUUID();
        this.name = name;
        this.email = email;
        this.clientDiscount = clientDiscount;
    }

    public UUID getIdClient() {
        return idClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getClientDiscount() {
        return clientDiscount;
    }

    public void setClientDiscount(double clientDiscount) {
        this.clientDiscount = clientDiscount;
    }

    @Override
    public String toString() {
        // Cliente[id=?, nombre=?, email=?, descuento=?]]
        return "Client[" +
                "id=" + idClient +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", descuento=" + String.format("%.2f", clientDiscount) + " %" +
                ']';
    }
}
