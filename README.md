# DesignPatters
DESIGN PATTERNS are typical solutions to commonly occuring problems/blueprint.




#Sections that are usually present in a pattern desciption:

-INTENT-of the pattern briefly descibes both the problem and the solution.

-MOTIVATION- further explains the problem and the solution the pattern makes possible.

-STRUCTURE-of classes shows each part of the pattern and how they are related.

-CODE EXAMPLE- in one of the popular programming language makes it easier to group the idea behind the pattern.




#Most basic patterns are often called idioms
#Most high-level patterns are architectural patterns



#3 Main Groups of Patterns

1-Creational Pattern-increase flexibility and reuse of existing code

2-Structural Pattern-explains how to assesmble objects and classes into larger structures while keeping these structures flexible and efficiant 

3-Behavioral Pattern-take care of effective communication and the assignment of responsibilities between objects.





#ADAPTER

Adapter is also known as: Wrapper 

Adapter is a STRUCTUAL design patters that allows objects with incompatible interfaces to collaborat.Makes sure incompatible classes work together. 

This is a special object that converts the interface of one object to another object so it can understand it. 

A class adapter uses inheritance and would only wrap a class

While an object adapter uses composition and can wrap classes or interfaces 



#PROTOTYPES

They are a CREATIONAL Pattern used to copy an instantized object

Usually implemented with a Registry to store original object and clones

Used by implementing Cloneable or Prototype interfaces in object class

Used to creat mult instances of an object quick and acoid costly creation. 


#SINGLETON

Singleton is a CREATIONAL design pattern that lets you ensure that a class has only one instance while providing a global access point to this instance. 

#FACTORY METHOD

Factory Method Pattern suggests that you replace creating new objects with calls to spcial factory methods. The objects are still created via the new operator, but it's being called from within the factory method. 

Factory method is known to be the opposite of the Singleton pattern

It doesn't expose instantiation logic(the client doesn't know anything about the type of objects being created)

Defers instantiation to the subclasses (parameters are used to determine the concrete type)




