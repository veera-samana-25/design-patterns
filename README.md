# design-patterns

Categories of the design patterns

1. Creational patterns
2. Behavioural patterns
3. structural patterns
4. J2EE patterns

1. Creational pattern
   it is related to way of creating objects. it is used to define and describe how objects are created at class
   instantiation time
   Ex: Employee emp = new Employee();

here we are creating the instance using the new keyword

1.factory method
2.abstract factory
3.builder
4.prototype
5.singleton

Q) what is factory design pattern ?
In the Factory pattern, we don't expose the creation logic to the client and refer the created object using a standard
interface.
The factory pattern is also known as virtual constructor

steps:
1. create main class which call factory class.
2. factory class return required class instance.

Q) what is AbstractFactory pattern ?
This factory is also called as factory of factories
Abstract factory lets a class return a factory of classes
so, this is the reason that Abstract Factory is one level higher than the Factory pattern
An Abstract factory Pattern is also known as kit

Steps:
1.create main class which call factory of factory class
2.factory of factory/ factory producer creates instance of factory class
3.factory class returns required class instance

Q) what is Singleton Design Pattern ?
singleton pattern is one of the simplest design patterns in java
this pattern involves as single class which is responsible to create an object while making sure that only one single
object is created.
this class provide a way to access its only object which can be accessed directly without need to instantiate the object
of the class

steps:

1. create private static variable with a new keyword once. So, it's instance will be created while class loading only
   once.
2. create a private constructor
3. create a getter. no setter

Q) what is Prototype Design pattern ?

1. prototype pattern refer to creating duplicate object while keeping performance in mind
2. it involves implementing a prototype interface which tells to create a clone of the current object.
3. this pattern is used when creation of object directly is costly. For example, it requires database calls or required
   too much of processing that will take a lot of memory.

what can be done ?
we can cache the object, return its clone on next request

steps:

1. create main class which call CacheImpl Class
2. CacheImpl class has 2 methods: 1st to load the key value in map and create the cache. end to return the required
   cloned object
3. the main class, parent of all required concrete class contain cloning technique. Rest concrete class are normal
   POJOs, nothing special

Q) what is Builder design pattern ? (Imp)
Builder pattern refers to approach that focuses on constructing a complex object from simple objects using step-by-step
approach
Major roles used in this design patterns are:

1. complex Object/ Final product: ex: house - complex object which will generate with builder design pattern.
2. Builder: abstract class/ interface that defines all the ways to create the product. It also has getFinalProduct
   method that will finally return complex object
3. ConcreteBuilder: multiple Builder Impls that will give different final objects which are complex to design
4. Director: Control complex object creation. It has 2 main goals: 1st to call appropriate concrete builder class to
   create correct complex object. 2nd to return that complex object.

Steps:

1. create complex class POJO
2. create Builder Interface/Abstract class which has definition
3. create concrete Builder class that has implementation
4. create Director that will have responsibility to call correct concrete Builder and then return final object
5. create main class that will initialize Director and call methods of director finally which will in turn return
   complex object instance required


2. Structural Patterns ?
   structural design pattens shows you how to assemble different pieces of a system together in a flexible and
   extensible fashion
   they help you guarantee that when one of the parts changes, the entire structure doesn't need to change

    1. proxy DP
    2. flyWeight DP
    3. facade
    4. composite DP
    5. adapter DP
    6. decorator DP

Q) what is proxy design pattern ?
it's a structural design pattern
it lets you provide a substitute or placeholder for another object
a proxy controls access to the original object, allowing you to perform something either before or after the request
gets through to the original object

steps
Subject - is an interface which expose the functionality available to be used by the clients
Real Subject - is a class implementing Subject and it is concrete implementation which needs to be hidden behind a proxy
Proxy - hides the real object by extending it and clients communicate to real object via this proxy object. Usually
frameworks create this proxy object when client request for real object

Q) Advantages of proxy design pattern ? (IMP)
Access control/ protection given by proxy object: this is when you want only specific clients to be able to use the
service object
Caching request results(caching proxy). this is when you need to cache results of client requests and manage the
lifecycle of this cache, especially if results are quite large
Logging requests(logging proxy). This is when you want to keep history of requests to the service object.

Q) Flyweight design pattern ?
when your application needs large number of objects that share most of the common attributes called Intrinsic attributes
or properties and only few unique attributes called as Extrinsic attributes/properties
we need to control the memory consumption by large number of objects - by creating fewer objects and sharing them across

Q) when to use Flyweight DP ?
The number of objects to be created by the application should be huge
the object creation is heavy on memory, it can be time-consuming too.
the object properties can be divided into intrinsic and extrinsic properties of an object should be defined by the
client program
