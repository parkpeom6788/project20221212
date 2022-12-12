package org.kosta.myproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		System.out.println("HomeController 실행");
		return "index";
	}
	
	@RequestMapping("layout")
	public String layout() {
		System.out.println("layout 실행");
		return "layouts/layout";
	}
	
	@RequestMapping("productDetail")
	public String productDetail() {
		System.out.println("productDetail 실행");
		return "product-detail";
	}
	
	@RequestMapping("cart")
	public String cart() {
		System.out.println("cart 실행");
		return "cart";
	}
	
	@RequestMapping("checkout")
	public String checkout() {
		System.out.println("checkout 실행");
		return "checkout";
	}
	
	@RequestMapping("shop")
	public String shop() {
		System.out.println("shop 실행");
		return "shop";
	}
	
	@RequestMapping("wishlist")
	public String wishlist() {
		System.out.println("wishlist 실행");
		return "wishlist";
	}

}


















