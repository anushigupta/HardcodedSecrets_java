package controllers;

public class Security extends Secure.Security {

static boolean authenticate(String username, String password) {
    return "abc@abc.com".equals(username) && "abc123".equals(password);
}
