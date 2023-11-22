package com.example.zara;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
import java.util.List;
import java.util.Date;

public interface PricesRepository extends JpaRepository<Prices, Long>{
	
	List<Prices> findByStartDate(Date startDate);
	
	Optional<Prices> findById(Long id);

	@Query(value = "SELECT TOP 1 * FROM prices p WHERE p.start_date <= ?1 AND p.end_date >= ?1 ORDER BY p.priority DESC",
			nativeQuery = true)
	Prices findByDate(@Param("queryDate") Date date); 
}
