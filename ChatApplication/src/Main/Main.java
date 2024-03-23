package Main;

import ChatApp.User;

public class Main {
    public static void main(String[] args) {

        // Creating instances of users
        User userLily = new User("Lily");
        User userJack = new User("Jack");
        User userSam = new User("Sam");

        // Sending messages between users
        userLily.sendMessage(userJack, "Hey Jack, how are you?");
        userJack.sendMessage(userSam, "Hi Sam, want to grab lunch?");
        userSam.sendMessage(userLily, "Hey Lily, did you finish the project?");
    }
}
