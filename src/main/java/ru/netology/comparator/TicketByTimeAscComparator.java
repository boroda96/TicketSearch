package ru.netology.comparator;

import ru.netology.domain.Ticket;

import java.io.Serializable;
import java.util.Comparator;

public class TicketByTimeAscComparator implements Comparator<Ticket>, Serializable {
    @Override
    public int compare(Ticket o1, Ticket o2) {
        return o1.getTimeMinutes() - o2.getTimeMinutes();

//         if (o1.getPrice() < o2.getPrice()) {
////            return -1;
////        }
////        else if (o1.getPrice() > o2.getPrice()){
////            return 1;
////        }else{
////            return  0;
////        }
////
    }
}
