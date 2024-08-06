package service.log;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class LogFlow {
    private static final Logger LOGGER = Logger.getLogger(LogFlow.class.getName());


    public LogFlow(){
        prepareConsoleHandler();
        prepareFileHandler();
        configureLogLevel();
    }


    private void prepareConsoleHandler(){
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
    }

    private void prepareFileHandler(){
        try {
            FileHandler fileHandler = new FileHandler("event.log", true);
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new SimpleFormatter());
            LOGGER.addHandler(fileHandler);
            
        } catch (SecurityException | IOException e) {
            LOGGER.log(Level.SEVERE, "An Error has been occured in logging setup");
        }
    }

    private void configureLogLevel(){
        LOGGER.setLevel(Level.ALL);
    }

    // public void 

}
