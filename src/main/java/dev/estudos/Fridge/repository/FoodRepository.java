package dev.estudos.Fridge.repository;

import dev.estudos.Fridge.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
