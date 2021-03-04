package com.company.models;

import com.company.enums.TicketTypes;

public class Ticket implements Comparable<Ticket>{

    private int id;
    private TicketTypes ticketTypes;
    private double cost;

    public Ticket(int id, TicketTypes ticketTypes, double cost) {
        this.id = id;
        this.ticketTypes = ticketTypes;
        this.cost = cost;
    }

    public Ticket() { }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TicketTypes getTicketTypes() {
        return ticketTypes;
    }

    public void setTicketTypes(TicketTypes ticketTypes) {
        this.ticketTypes = ticketTypes;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", ticketTypes=" + ticketTypes +
                ", cost=" + cost +
                '}';
    }


    @Override
    public int compareTo(Ticket o) {

        if (this.ticketTypes.equals(o.ticketTypes)){
            if(this.cost < o.getCost()){
                return 1;
            }else {
                return -1;
            }
        }else {
            if (this.ticketTypes.equals(TicketTypes.CLASSIC)){
                return 1;
            }else {
                return -1;
            }
        }
    }
}
