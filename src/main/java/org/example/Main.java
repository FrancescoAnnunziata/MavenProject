package org.example;

import org.tinylog.Logger;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        get("/hello", (req, res) -> {
            Logger.info("Qualcuno sta spiando il tuo server!");
            return "Hello World";});
    }
}