
class Brain {
    public Brain() {
        System.out.println("Thinking ...");
    }
}

class Person {
    private String name;
    private Brain brain;
    
    public Person() {
        
    }
    
    public Person(String name) {
        
        // 'this.name' is the instance variable.
        // 'name' is the parameter
        this.name = name;
        
        brain = new Brain();
    }
    
    public void writeName() {
        // Note: no 'this' here. 'name' is 
        // not ambiguous so we don't need 'this'.
        System.out.println("My name is " + name);
    }
    
    public void setName(String name) {
        // Use 'this' again to disambiguate.
        this.name = name;
    }
    
    public String getName() {
        // No need for 'this' - not ambiguous here.
        return name;
    }
}

public class Application {

    public static void main(String[] args) {
        
            System.out.println("Hello World!");
            
            Person person = new Person("Obdulia");
            
            String name = person.getName();
            name = name + " Lopez";
            person.setName(name);
            
            person.writeName();
    }

}