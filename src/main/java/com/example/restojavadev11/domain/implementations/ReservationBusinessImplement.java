package com.example.restojavadev11.domain.implementations;

import com.example.restojavadev11.domain.interfaces.IReservationBusiness;
import com.example.restojavadev11.models.*;
import com.example.restojavadev11.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Service
public class ReservationBusinessImplement implements IReservationBusiness {

    @Autowired
    private ReservationRepository reservationRepository;
    @Override
    public List<ReservationEntity> getAllReserves() {
        return null;
    }

    @Override
    public ReservationEntity getReserve() {
        return null;
    }
    @Override
    public ReservationEntity saveReserve(Date date,
                            Time startTime,
                            Time endTime,
                            int numberOfPeople,
                            int numberOfTables,
                            int bill,
                            int idEmployee,
                            TableEntity table,
                            CustomerEntity customerId,
                            BillEntity billId,
                            EmployeeEntity employeeId) {
        ReservationEntity reserve = new ReservationEntity();
        try {
            reserve.setRReservationDate(date);
            reserve.setRReservationStartTime(startTime);
            reserve.setRReservationEndTime(endTime);
            reserve.setRNPeople(numberOfPeople);
            reserve.setRNTable(numberOfTables);
            reserve.setRIdBill(bill);
            reserve.setRIdEmployee(idEmployee);
            reserve.setTableByRNTable(table);
            reserve.setCustomerByRIdCustomer(customerId);
            reserve.setBillByRIdBill(billId);
            reserve.setEmployeeByRIdEmployee(employeeId);
        }catch (Exception e){
            e.printStackTrace();
        }
        return reservationRepository.save(reserve);
    }

    @Override
    public void deleteReserve() {

    }

    @Override
    public void updateReserve() {

    }
}
