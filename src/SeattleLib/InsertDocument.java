package SeattleLib;

import com.mongodb.client.MongoCollection; 
import com.mongodb.client.MongoDatabase; 

import org.bson.Document;  
import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential;

public class InsertDocument 
{
	public static void main( String args[] ) {  
	      
	      // Creating a Mongo client 
	      MongoClient mongo = new MongoClient( "localhost" , 2201 ); 

//	      // Creating Credentials 
//	      MongoCredential credential; 
//	      credential = MongoCredential.createCredential("sampleUser", "myDb", 
//	         "password".toCharArray()); 
	      System.out.println("Connected to the database successfully");  
	      
	      // Accessing the database 
	      MongoDatabase database = mongo.getDatabase("Lib"); 

	      // Retrieving a collection
	      MongoCollection<Document> collection = database.getCollection("Seattle"); 
	      System.out.println("Collection sampleCollection selected successfully");

	      Document document = new Document("BibNum", 11111) 
	      .append("Title", "CS157c NoSQL Book")
	      .append("Author", "PARSTARINA") 
	      .append("ISBN", 987654321) 
	      .append("PublicationYear", "3030") 
	      .append("Publisher", "The Amazing Squad")
	      .append("Subjects", "Computer Science, Database")
	      .append("ItemType", "acbk")
	      .append("ItemCollection", "cafic")
	      .append("FloatingItem", "NA")
	      .append("ItemLocation", "cen")
	      .append("ReportDate", "2019-04-17T00:00:00.000")
	      .append("ItemCount", 2);
	      collection.insertOne(document); 
	      System.out.println("Document inserted successfully");     
	   } 
}
