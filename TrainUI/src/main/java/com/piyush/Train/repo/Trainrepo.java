package com.piyush.Train.repo;

import com.piyush.Train.Enitity.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Trainrepo extends JpaRepository<Train,Long> {
}
