package SeattleLib;
import com.mongodb.client.MongoDatabase; 
import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential; 

public class ConnectToDB 
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
	      //System.out.println("Credentials ::"+ credential);     
	   } 
}
