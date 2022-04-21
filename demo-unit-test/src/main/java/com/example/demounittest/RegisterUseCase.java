package com.example.demounittest;

public class RegisterUseCase {
    private final UserRepository userRepository

    // contructor injection
    // testing 시 @Autowired 어노테이션은 느린 속도의 문제가 있다.
    public RegisterUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(User user) {
        return userRepository.save(user);
    }
}
