package com.woosik.springpratice.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/jpa")
public class JpaController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    public JpaController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * CREATE
     * @return
     */
    @PostMapping("/create")
    public User create(@RequestParam String name) {
        return userRepository.save(new User(name));
    }

    /**
     * READ
     * @return
     */
    @GetMapping("/list")
    public Iterable<User> list() {
        return userRepository.findAll();
    }

    /**
     * READ
     * @return
     */
    @GetMapping("/find/{id}")
    public User find(@PathVariable Long id) {
        Optional<User> user =  userRepository.findById(id);
        return user.orElse(User.empty());
    }

    /**
     * UPDATE
     * @return
     */
    @PutMapping("/update/{id}")
    public User update(@PathVariable Long id, @RequestParam String name) {
        Optional<User> oUser = userRepository.findById(id);
        User user = oUser.get();
        user.setName(name);
        return userRepository.save(user);
    }

    /**
     * DELETE
     * @return
     */
    @DeleteMapping("/delete")
    public void delete(@RequestParam Long id) {
        Optional<User> oUser = userRepository.findById(id);
        userRepository.delete(oUser.get());
    }

    @RequestMapping (value="/test0", method=RequestMethod.GET)
    public String test0() {
        return "JPA test !!";
    }
}
