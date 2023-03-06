package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Ticket;
import ru.netology.manager.TicketManager;
import ru.netology.repository.TicketRepository;

public class TicketManagerTest {
    TicketRepository repo = new TicketRepository();
    TicketManager manager = new TicketManager(repo);
    Ticket t1 = new Ticket(1, 30000, "SVX", "BKK", 600);
    Ticket t2 = new Ticket(2, 35000, "SVX", "CMB", 700);
    Ticket t3 = new Ticket(3, 80000, "SVX", "EZE", 2100);
    Ticket t4 = new Ticket(4, 16000, "SVX", "IST", 1300);
    Ticket t5 = new Ticket(5, 3100, "SVX", "HRG", 1500);
    Ticket t6 = new Ticket(6, 37000, "SVX", "CMB", 550);
    Ticket t7 = new Ticket(7, 27000, "SVX", "CMB", 640);

    @BeforeEach
    public void setup() {
        manager.add(t1);
        manager.add(t2);
        manager.add(t3);
        manager.add(t4);
        manager.add(t5);
        manager.add(t6);
        manager.add(t7);
    }

    @Test
    public void shouldAddALlTickets() {
        Ticket[] expected = {t1, t2, t3, t4, t5, t6, t7};
        Ticket[] actual = manager.repo.getTickets();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldTicketsFromSVXToEZE() {
        Ticket[] expected = {t3};
        Ticket[] actual = manager.findAll("SVX", "EZE");
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldTicketsFromSVXToCMB() {
        Ticket[] expected = {t7, t2, t6};
        Ticket[] actual = manager.findAll("SVX", "CMB");
        Assertions.assertArrayEquals(expected, actual);
    }

}
