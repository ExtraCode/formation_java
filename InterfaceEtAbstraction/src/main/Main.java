package main;

import java.util.ArrayList;

import entity.Admin;
import entity.Client;
import entity.User;

public class Main {

	public static void main(String[] args) {
		
		
		ArrayList<Client> clients = new ArrayList<Client>();
		clients.add(new Client(1, "Durand","Paul",30,"homme","255 rue des lilas, 75000 Paris"));
		clients.add(new Client(2, "Ribeire","Asma",54,"femme","25 cours de la rose, 30000 Nimes"));
		
		ArrayList<Admin> admins = new ArrayList<Admin>();
		admins.add(new Admin(3, "Pinoit","Michele",58,"admin",50000));
		
		clients.forEach(client -> {
			System.out.println(client.presentation());
		});
		
		admins.forEach(admin -> {
			System.out.println(admin.presentation());
		});
		

	}

}
