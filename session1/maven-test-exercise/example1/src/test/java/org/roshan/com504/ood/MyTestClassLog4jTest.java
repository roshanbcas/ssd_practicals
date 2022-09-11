package org.roshan.com504.ood;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyTestClassLog4jTest {
    public static Logger logger = LogManager.getLogger(MyTestClassLog4j.class);

    public static void main(String[] args) {

        // this is a local comment which doesnt go in javadoc
        MyTestClassLog4j myTestClassLog4j = new MyTestClassLog4j();
        myTestClassLog4j.writeAboutMe();

    }

    /**
     * This is a javadoc comment on writeAboutMe
     *
     */
    public void writeAboutMe() {
        System.out.println("This is a system out message from : "+ MyTestClassLog4j.class);
        logger.error("This is a log4j message from : "+ MyTestClassLog4j.class);
    }
}
