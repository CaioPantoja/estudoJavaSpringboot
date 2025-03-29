package dev.estudos.Fridge.controller;

import dev.estudos.Fridge.model.Food;
import dev.estudos.Fridge.service.FoodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {


    private final FoodService foodService;


    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping
    public List<Food> getAll() {
        return foodService.getAllFood();
    }

    @PostMapping
    public Food create(@RequestBody Food food) {
        return foodService.save(food);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        foodService.delete(id);
    }
}
