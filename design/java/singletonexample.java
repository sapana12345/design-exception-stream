package design.java;
class database{
	private static database dbobject;
private void databse() {
	
}
public static database getInstance() {
if(dbobject==null) {
	dbobject =new database();
	
}
	return dbobject;
	
}
public void getConnection() {
	System.out.println("you are connected the databse");
}
}
public class singletonexample {

	public static void main(String[] args) {
database db;
db=database.getInstance();
db.getConnection();
	}

}
