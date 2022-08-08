package corejavaproject;

public class employeeru {
int id;
String name;
long salory;

public employeeru(int id, String name, long salory) {
	super();
	this.id = id;
	this.name = name;
	this.salory = salory;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getSalory() {
	return salory;
}
public void setSalory(long salory) {
	this.salory = salory;
}

}
