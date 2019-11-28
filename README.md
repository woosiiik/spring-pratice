## Spring Pratice
#### jpa pratice
/jpa



#### CRUD

@PathVariable 사용법
    @GetMapping("/find/{id}")
        public User find(@PathVariable Long id) {
            Optional<User> user =  userRepository.findById(id);
            return user.orElse(User.empty());
        }
* http://localhost:8080/find/1 과 같은 형태로 요청 할 때 사용 (key, value) 가 아님.
     