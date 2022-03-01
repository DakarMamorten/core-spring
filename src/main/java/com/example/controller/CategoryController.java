package com.example.controller;

import com.example.model.Category;
import com.example.repository.CategoryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

	private final CategoryRepository categoryRepository;

	public CategoryController(final CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	@ResponseBody
	@GetMapping("/list")
	public List<Category> findCategory() {
		return categoryRepository.findAll();
	}
}
