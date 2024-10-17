package com.example.keycloak_authorization;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.access.prepost.PreAuthorize;


@RestController
@RequestMapping("/restaurant")
@SecurityRequirement(name = "Keycloak")
public class RestrauntController {

    @GetMapping("/public/list")
// Public API
    public String getRestaurants() {
        return "List of restaurant";
    }

    @GetMapping("/public/menu")
// Public API
    public String getMenu() {
        return "this is getmenu";
    }

    @PostMapping
// admin can access
    public String createRestaurant(@RequestBody String body) {
        return "this is create restaurant with body " + body;
    }

    @PostMapping("/menu")
// manager can access
    public String createMenu(@RequestBody String body) {
        return "this is create menu : " + body;
    }

    @PutMapping("/menu/item/{itemId}/{price}")
//    @PreAuthorize("hasRole('ROLE_owner')")
// owner can access
    public String updateMenuItemPrice(@PathVariable Long itemId, @PathVariable Double price) {

        return "this is update menu item with itemId : " + itemId + " and price : " + price;
    }


}
