package br.com.desafio.repository

import br.com.desafio.modelo.Autor
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface AutorRepository : JpaRepository<Autor, Long> {
    abstract fun findByEmail(email: String): Optional<Autor>
}
