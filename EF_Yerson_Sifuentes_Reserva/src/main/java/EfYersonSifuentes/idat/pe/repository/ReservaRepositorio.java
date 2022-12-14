package EfYersonSifuentes.idat.pe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EfYersonSifuentes.idat.pe.model.Reserva;

@Repository
public interface ReservaRepositorio extends JpaRepository<Reserva, Integer>{

}
