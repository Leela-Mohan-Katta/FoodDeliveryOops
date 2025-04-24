Let’s use Customer entity to explain the 4 pillars of OOPs:

Encapsulation

Abstraction

Inheritance

Polymorphism

👤 Your Customer Entity
java
Copy
Edit
public class Customer {
private Long id;
private String name;
private String email;
private String address;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
}

1. ✅ Encapsulation
   Definition: Wrapping data (fields) and methods (getters/setters) into a single unit (class) and restricting direct access to the fields.

In Customer:

Fields id, name, email, address are private.

Access is only through getters and setters.

📌 Advantage: Prevents unwanted modifications and adds a layer of validation if needed.

2. ✅ Abstraction
   Definition: Hiding unnecessary internal details and showing only relevant information.

In Customer:

The internal logic of how id is stored isn't exposed.

The user just calls customer.getId().

📌 Real-life analogy: When you use a mobile, you don’t need to know how internally the call is connected — just click the contact and call.

3. ✅ Inheritance
   Definition: When a class (child) inherits properties and behavior from another class (parent).

Let’s say we have a User base class:

java
Copy
Edit
public class User {
private String name;
private String email;
}
Now Customer can inherit from User:

java
Copy
Edit
public class Customer extends User {
private Long id;
private String address;
}
📌 Customer now has: name, email, id, address.

4. ✅ Polymorphism
   Definition: Many forms — the ability to define methods with the same name but different behavior.

🔸 Compile-time Polymorphism (Method Overloading):
java
Copy
Edit
public class Customer {
public void printDetails() {
System.out.println("No details available");
}

    public void printDetails(String name) {
        System.out.println("Customer Name: " + name);
    }
}
Same method name printDetails, but different parameter lists.

🔸 Runtime Polymorphism (Method Overriding):
java
Copy
Edit
public class User {
public void printRole() {
System.out.println("User role");
}
}

public class Customer extends User {
@Override
public void printRole() {
System.out.println("Customer role");
}
}
📌 If you call printRole() on a User reference holding a Customer, it runs the overridden method.

✅ Summary Table

OOP Concept	Where in Customer	Purpose
Encapsulation	private fields + getters/setters	Protects data, controls access
Abstraction	Hides internal data storage	Simplifies usage
Inheritance	Customer extends User	Reuse and extend common behavior
Polymorphism	printDetails(), printRole() methods	Flexibility in behavior