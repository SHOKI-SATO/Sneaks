package com.example.demo;

import javax.inject.Inject;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.terasoluna.gfw.common.message.ResultMessages;

import com.example.session.domain.model.Cart;
import com.example.session.domain.model.CartItem;

@Controller
@RequestMapping("products")
public class ProductsController {

    @Inject
    productsService productsService;

    // (1)
    @Inject
    Cart cart;

    @ModelAttribute(value = "goodViewForm")
    public ProductViewForm setUpCategoryId() {
        return new ProductViewForm();
    }

    @GetMapping
    String showProduct(ProductViewForm form, Pageable pageable, Model model) {

        Page<Products> page = goodsService.findByCategoryId(form.getCategoryId(),
                pageable);
        model.addAttribute("page", page);
        return "products/showGoods";
    }

    @GetMapping("/{productsId}")
    public String showProductsDetail(@PathVariable String productsId, Model model) {

    	Products products = productsService.findOne(productsId);
        model.addAttribute(products);

        return "/products/showProductsDetail";
    }

    @PostMapping("/addToCart")
    public String addToCart(@Validated ProductsAddForm form, BindingResult result,
            RedirectAttributes attributes) {

        if (result.hasErrors()) {
            ResultMessages messages = ResultMessages.error()
                    .add("e.st.go.5001");
            attributes.addFlashAttribute(messages);
            return "redirect:/products";
        }

        Products products = productsService.findOne(form.getProductsId());
        CartItem cartItem = new CartItem();
        cartItem.setPoods(products);
        cartItem.setQuantity(form.getQuantity());
        cart.add(cartItem); // (2)

        return "redirect:/products";
    }
}