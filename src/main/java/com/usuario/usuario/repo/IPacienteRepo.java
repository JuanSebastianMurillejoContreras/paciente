package com.usuario.usuario.repo;

import com.usuario.usuario.entity.PacienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPacienteRepo extends JpaRepository<PacienteEntity, Long> {

}
