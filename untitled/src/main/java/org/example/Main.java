package org.example;

import org.example.models.Table;
import org.example.models.TableModel;
import org.example.presenters.BookingPresenter;
import org.example.presenters.Model;
import org.example.presenters.View;
import org.example.views.BookingView;

import java.util.ArrayList;
import java.util.Date;

public class Main {


    public static void main(String[] args) {

        View view = new BookingView();
        Model model = new TableModel();

        BookingPresenter bookingPresenter = new BookingPresenter(view, model);
        bookingPresenter.showTables();

        view.reservationTable(new Date(), 3, "Вячеслав");
        System.out.println(("==================="));
        view.reservationTable(new Date(), 1, "Евгений");
        System.out.println(("==================="));
        view.reservationTable(new Date(), 2, "Михаил");
        System.out.println(("==================="));



        view.changeReservationTable(1001, new Date(), 4, "Вячеслав");

    }

}