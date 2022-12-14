package EfYersonSifuentes.idat.pe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EfYersonSifuentes.idat.pe.model.Hospedaje;


@Repository
public interface HospedajeRepositorio extends JpaRepository<Hospedaje, Integer>{

}
