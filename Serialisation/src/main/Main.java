package main;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import entity.User;

public class Main {

	public static void main(String[] args) {
		
		// Sérialisation
		try {
			
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("data.ser"));
			
			User user = new User(1,"Durand","Nicolas",46);
			User user2 = new User(2,"Dupont","Paul",46);
			
			outputStream.writeObject(user);
			outputStream.writeObject(user2);
			
			outputStream.close();
			
			System.out.println("Objet sérialisé avec succès !");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Désérialisation
		try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("data.ser")))
		{
			
			while(true) {
				
				try {
					Object obj = inputStream.readObject();
					
					if(obj instanceof User) {
						User user = (User) obj;
						System.out.println(user.getPrenom() + " a bien été récupéré");
					}

				}catch(EOFException e) {
					// Fin du fichier
					break;
				}
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
