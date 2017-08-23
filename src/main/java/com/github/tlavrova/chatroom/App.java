package com.github.tlavrova.chatroom;

import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static spark.Spark.*;

/**
 *
 *
 */
public class App {
	public static void main(String[] args) {
		port(getHerokuAssignedPort());

	}

	static int getHerokuAssignedPort() {
		ProcessBuilder processBuilder = new ProcessBuilder();
		if (processBuilder.environment().get("PORT") != null) {
			return Integer.parseInt(processBuilder.environment().get("PORT"));
		}
		return 8080; // return default port if heroku-port isn't set (i.e. on localhost)
	}
}
