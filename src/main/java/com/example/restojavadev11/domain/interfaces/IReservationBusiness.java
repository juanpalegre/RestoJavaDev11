package com.example.restojavadev11.domain.interfaces;

import com.example.restojavadev11.models.*;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

public interface IReservationBusiness {
    List<ReservationEntity> getAllReserves();
    ReservationEntity getReserve();
    ReservationEntity saveReserve(Date date, Time startTime, Time endTime, int numberOfPeople, int numberOfTables, int bill, int idEmployee, TableEntity table, CustomerEntity customerId, BillEntity billId, EmployeeEntity employeeId);
    void deleteReserve();
    void updateReserve();
}
