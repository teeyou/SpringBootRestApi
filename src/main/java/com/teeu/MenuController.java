package com.teeu;

import model.Menu;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
public class MenuController {
    private MenuMapper mapper;

    public MenuController(MenuMapper mapper) {
        this.mapper = mapper;
    }

    @RequestMapping(value = "/menu/{id}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Menu getMenu(@PathVariable("id") String id) {
        return mapper.getMenu(id);
    }

    @GetMapping("/menu")
    public List<Menu> getMenuList() {
        return mapper.getMenuList();
    }

    @PutMapping("/menu/{id}")
    public void putMenu(@PathVariable("id") String id,
                        @RequestParam("image") String image,
                        @RequestParam("name_ko") String name_ko,
                        @RequestParam("name") String name,
                        @RequestParam("price") int price) {
        mapper.insertMenu(id,image,name_ko,name,price);
    }

    @PostMapping("/menu/{id}")
    public void postMenu(@PathVariable("id") String id,
                         @RequestParam("image") String image,
                         @RequestParam("name_ko") String name_ko,
                         @RequestParam("name") String name,
                         @RequestParam("price") int price) {
        mapper.updateMenu(id,image,name_ko,name,price);
    }

    @DeleteMapping("/menu/{id}")
    public void deleteMenu(@PathVariable("id") String id) {
        mapper.deleteMenu(id);
    }
}
