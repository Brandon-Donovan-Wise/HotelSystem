

/*
ReservationDateServiceImpl.java
ReservationDateServiceImpl  class
Author : Kyra Petersen (219474559)
Date : 5 June 2023
*/
package za.ac.cput.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.ReservationDate;
import za.ac.cput.repository.IReservationDateRepository;
import za.ac.cput.service.ReservationDateService;


import java.util.List;
import java.util.Set;
@Service
public class ReservationDateServiceImpl implements ReservationDateService {
    private IReservationDateRepository repository;

   @Autowired
  private ReservationDateServiceImpl(IReservationDateRepository repository){
       this.repository= repository;
   }
    @Override
    public ReservationDate create(ReservationDate reservationDate) {
         return repository.save(reservationDate);

    }

    @Override

        public ReservationDate read(String reservationDateID){
            return this.repository.findById(reservationDateID).orElse(null);
        }
    @Override
    public ReservationDate update(ReservationDate reservationDate) {
     if (this.repository.existsById(reservationDate.getReservationDateID()))
         return this.repository.save(reservationDate);
     return null;
    }

    @Override
    public boolean delete(String reservationDateID) {
        if(this.repository.existsById(reservationDateID)){
            this.repository.deleteById(reservationDateID);
            return true;
        }
        return false;
    }

    public List<ReservationDate> getAll() {
        return repository.findAll();

    }
}