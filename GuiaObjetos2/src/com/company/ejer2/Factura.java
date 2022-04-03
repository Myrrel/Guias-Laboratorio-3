package com.company.ejer2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Factura {
    private UUID idFactura;
    private double total;
    private LocalDateTime date;
    private Client client;


    public Factura(double total,  Client client) {
        idFactura = UUID.randomUUID();
        date = LocalDateTime.now();
        this.total = total;
        this.client = client;
    }

    public UUID getIdFactura() {
        return idFactura;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getTotalByClientDiscount() {
        return total - (total * (client.getClientDiscount() / 100))  ;
    }

    @Override
    public String toString() {
        // Factura[id=?, fecha=?, monto=?, montoDesc=?, Cliente[id=?, nombre=?, email=?, descuento=?]]
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        return "Factura[" +
                "id=" + idFactura +
                ", fecha=" + date.format(dateTimeFormatter).toString() +
                ", monto=" + String.format("%.2f",total) +
                ", montoDesc=" + String.format("%.2f",getTotalByClientDiscount()) +
                ", " + client +
                ']';
    }
}
