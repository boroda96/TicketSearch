package ru.netology.domain;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Ticket implements Comparable<Ticket> {
    private int id;
    private int price;
    private String from;
    private String to;
    private int timeMinutes;

    public Ticket(int id, int price, String from, String to, int timeMinutes) {
        this.id = id;
        this.price = price;
        this.from = from;
        this.to = to;
        this.timeMinutes = timeMinutes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getTimeMinutes() {
        return timeMinutes;
    }

    public void setTimeMinutes(int timeMinutes) {
        this.timeMinutes = timeMinutes;
    }

    @Override
    public int compareTo(Ticket o) {
        return price - o.price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return id == ticket.id && price == ticket.price && timeMinutes == ticket.timeMinutes && Objects.equals(from, ticket.from) && Objects.equals(to, ticket.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, from, to, timeMinutes);
    }
//    @Override
//    public int compareTo(Ticket o) {
//    return price = o.getPrice();
//    }
}
