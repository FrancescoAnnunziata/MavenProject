package org.example;

import org.tinylog.Logger;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        get("/italy", (req, res) -> {
            Logger.info("Qualcuno sta spiando il tuo server!");
            Logger.info(req.host(), req.protocol());
            return "Pizza, pasta, mandolino!";});
    }
}