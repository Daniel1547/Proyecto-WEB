package mx.edu.uacm.trailers.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.edu.uacm.trailers.modelo.Pelicula;

public interface PeliculaRepositorio extends JpaRepository<Pelicula, Integer>{

}
