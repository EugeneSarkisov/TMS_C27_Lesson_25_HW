package com.library.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalTime;

@WebListener
public class EventListener implements ServletRequestListener {
    public static final Logger logger = LogManager.getLogger(EventListener.class);

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        logger.info(sre.getServletContext() + " at " + LocalTime.now());
    }
}
