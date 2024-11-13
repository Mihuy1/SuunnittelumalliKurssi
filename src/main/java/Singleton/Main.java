    package Singleton;

    public class Main {

            public static void main(String[] args) {

                Logger logger = Logger.getInstance();
                logger.setFileName("test.txt");
                logger.write("Simulation started");
                logger.write("Processing data...");
                logger.write("Simulation ended");
                logger.close();

                Logger logger2 = Logger.getInstance();
                logger2.setFileName("test2.txt");
                logger2.write("Another simulation started");
                logger2.write("Again, processing data...");
                logger2.write("Simulation ended");
                logger2.close();
            }
    }
