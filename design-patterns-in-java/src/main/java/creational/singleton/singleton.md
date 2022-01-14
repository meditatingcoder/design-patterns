# Singleton pattern

Singleton pattern helps to create one and only instance of a class within a program.

there are many ways to create a singleton class within java, these can be broken by serialization, multithreading, reflection etc

## UsefulNess
It is helpful in a scenarios where object creation is an expensive operation. Example database connection object.

Example depicted here is using double-checked locking

### Ways to create singleton
 - Eager initialization
 - Static block initialization
 - Lazy initialization
 - Thread safe
 - Bill Pugh
 - Enum Singleton: - This helps in avoiding reflection related errors
 - Serialization can break singleton pattern, If singleton class is serializable then, while reading the object back return an existing instance.

