package EfYersonSifuentes.idat.pe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EfYersonSifuentes.idat.pe.model.Turista;

@Repository
public interface TuristaRepositorio extends JpaRepository<Turista, Integer>{

}
