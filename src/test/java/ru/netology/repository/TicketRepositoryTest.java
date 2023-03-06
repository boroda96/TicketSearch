package ru.netology.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import ru.netology.domain.Ticket;

public class TicketRepositoryTest {
    TicketRepository repo = new TicketRepository();
    Ticket t1 = new Ticket(1, 30000, "SVX", "BKK", 600);
    Ticket t2 = new Ticket(2, 35000, "SVX", "CMB", 700);
    Ticket t3 = new Ticket(3, 80000, "SVX", "EZE", 2100);
    Ticket t4 = new Ticket(4, 16000, "SVX", "IST", 1300);
    Ticket t5 = new Ticket(5, 3100, "SVX", "HRG", 1500);
    Ticket t6 = new Ticket(6, 37000, "SVX", "CMB", 550);

    @BeforeEach
    public void setup() {
        repo.add(t1);
        repo.add(t2);
        repo.add(t3);
        repo.add(t4);
        repo.add(t5);
        repo.add(t6);
    }

    @Test
    public void shouldRemoveAll() {
        repo.removeById(1);
        repo.removeById(2);
        repo.removeById(3);
        repo.removeById(4);
        repo.removeById(5);
        repo.removeById(6);

        Ticket[] expected = {};
        Ticket[] actual = repo.getTickets();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveOneTicket() {

        repo.removeById(3);

        Ticket[] expected = {t1, t2, t4, t5, t6};
        Ticket[] actual = repo.getTickets();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindById() {
        Ticket expected = t6;
        Ticket actual = repo.findById(6);
        Assertions.assertEquals(expected, actual);

    }
}
