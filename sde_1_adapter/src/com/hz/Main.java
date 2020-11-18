package com.hz;

import java.awt.geom.NoninvertibleTransformException;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();
        BooleanAdapter adapter = new BooleanAdapter();

        // ask questions
        String q1 = "Do you like eating vegetables?";

        String good = "You healthy person!";
        String bad = "Maybe you should try to eat some carrots";

        // ask question to user
        writer.write(q1);

        // read response
        String response = reader.readLine();

        //Create a list of possible answers, check them using the adapter
        String[] answers = {"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};
        boolean ans1 = adapter.checkEquals(response, answers);


        if (ans1) {
            writer.write(good);
        } else {
            writer.write(bad);
        }

        // allow user to read our response
        reader.readLine();
    }
}
