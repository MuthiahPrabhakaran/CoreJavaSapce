# Creational Design Pattern
(My exercises on creational design pattern)

<ol>
<li>Singleton Pattern</li>
<li>Builder Pattern</li>
<li>Prototype Pattern</li>
</ol>


### [Singleton Pattern](https://github.com/MuthiahPrabhakaran/CoreJava/tree/master/creational-design-patterns/src/main/java/com/dp/cdp/singlton)
<ul>
<li> Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the java virtual machine.</li>
</ul>

### [Builder Pattern](https://github.com/MuthiahPrabhakaran/CoreJava/tree/master/creational-design-patterns/src/main/java/com/dp/cdp/builder)
<ul>
<li>Builder pattern aims to �Separate the construction of a complex object from its representation so that the same construction process can create different representations.� It is used to construct a complex object step by step and the final step will return the object. The process of constructing an object should be generic so that it can be used to create different representations of the same object.</li>
</ul>

### [Prototype Pattern](https://github.com/MuthiahPrabhakaran/CoreJava/tree/master/creational-design-patterns/src/main/java/com/dp/cdp/prototype)
<ul>
<li>Prototype allows us to hide the complexity of making new instances from the client. The concept is to copy an existing object rather than creating a new instance from scratch, something that may include costly operations. The existing object acts as a prototype and contains the state of the object. The newly copied object may change same properties only if required. This approach saves costly resources and time, especially when the object creation is a heavy process.</li>
</ul>

### [Factory Pattern](https://github.com/MuthiahPrabhakaran/CoreJava/tree/master/creational-design-patterns/src/main/java/com/dp/cdp/factory)
<ul>
<li>In Factory pattern, we create object without exposing the creation logic to client and the client use the same common interface to create new type of object.</li>
</ul>
