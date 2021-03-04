package com.company;

import com.company.enums.TicketTypes;
import com.company.models.Ticket;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<Ticket> first = new PriorityQueue<>();

        Ticket ticket1 = new Ticket(1, TicketTypes.CLASSIC, 100);
        Ticket ticket2 = new Ticket(2, TicketTypes.VIP, 200);
        Ticket ticket3 = new Ticket(3, TicketTypes.CLASSIC, 300);
        Ticket ticket4 = new Ticket(4, TicketTypes.VIP, 400);
        Ticket ticket5 = new Ticket(5, TicketTypes.CLASSIC, 500);
        Ticket ticket6 = new Ticket(6, TicketTypes.VIP, 600);
        Ticket ticket7 = new Ticket(7, TicketTypes.CLASSIC, 700);

        System.out.println("---------------------------------------------------------");
        System.out.println("First queue: ");
        first.offer(ticket1);
        first.offer(ticket3);
        first.offer(ticket4);
        first.offer(ticket6);
        first.offer(ticket2);
        first.offer(ticket5);
        first.offer(ticket7);

        System.out.println(first.poll());
        System.out.println(first.poll());
        System.out.println(first.poll());
        System.out.println(first.poll());
        System.out.println(first.poll());
        System.out.println(first.poll());
        System.out.println(first.poll());
        System.out.println("---------------------------------------------------------");

        Queue<Ticket> second = new PriorityQueue<>();
        Ticket ticket8 = new Ticket(8, TicketTypes.CLASSIC, 1000);
        Ticket ticket9 = new Ticket(9, TicketTypes.VIP, 2500);
        Ticket ticket10 = new Ticket(10, TicketTypes.CLASSIC, 3000);
        Ticket ticket11 = new Ticket(11, TicketTypes.VIP, 400);
        Ticket ticket12 = new Ticket(12, TicketTypes.CLASSIC, 5000);
        Ticket ticket13 = new Ticket(13, TicketTypes.VIP, 6005);
        Ticket ticket14 = new Ticket(14, TicketTypes.CLASSIC, 7000);

        System.out.println("Second queue: ");
        first.offer(ticket8);
        first.offer(ticket9);
        first.offer(ticket10);
        first.offer(ticket11);
        first.offer(ticket12);
        first.offer(ticket13);
        first.offer(ticket14);

        System.out.println(first.poll());
        System.out.println(first.poll());
        System.out.println(first.poll());
        System.out.println(first.poll());
        System.out.println(first.poll());
        System.out.println(first.poll());
        System.out.println(first.poll());
        System.out.println("---------------------------------------------------------");



    }
}
