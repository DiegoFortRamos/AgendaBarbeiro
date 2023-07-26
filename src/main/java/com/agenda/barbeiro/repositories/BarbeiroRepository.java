package com.agenda.barbeiro.repositories;

import com.agenda.barbeiro.domain.barbeiro.Barbeiro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarbeiroRepository extends JpaRepository<Barbeiro,Long> {
}
