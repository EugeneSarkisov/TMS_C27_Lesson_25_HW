package com.library.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalTime;

@WebListener
public class AppListener implements ServletContextListener {
    public static final Logger logger = LogManager.getLogger(AppListener.class);
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        logger.info(sce.getSource() + "App started at " + LocalTime.now());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
      logger.info("App close: " + LocalTime.now());
    }
}
