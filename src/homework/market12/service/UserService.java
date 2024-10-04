package homework.market12.service;

import homework.market12.model.user.User;

public interface UserService {

    User addUser(User user);

    User loginUser(String login, String password);

    boolean getUserByLogin(String login);

    void printUsers();




}
