package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.ReservationDate;
import za.ac.cput.domain.Room;

import java.util.Set;
@Repository
public interface IReservationDateRepository extends JpaRepository<ReservationDate, String> {

}
