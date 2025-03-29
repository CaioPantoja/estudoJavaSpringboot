package dev.estudos.Fridge.service;

import dev.estudos.Fridge.model.Food;
import dev.estudos.Fridge.repository.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public List<Food> getAllFood() {
        return foodRepository.findAll();
    }

    public Food save(Food food) {
        return foodRepository.save(food);
    }

    public void delete(Long id) {foodRepository.deleteById(id);}

    
}
