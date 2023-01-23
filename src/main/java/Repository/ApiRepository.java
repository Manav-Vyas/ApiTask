package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.Items;

public interface ApiRepository extends JpaRepository<Items, Long> {

}
