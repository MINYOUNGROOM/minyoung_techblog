package com.adcapsule.TechInsight.apis.repository;

import com.adcapsule.TechInsight.apis.domain.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository< BoardEntity,Long > {
}
