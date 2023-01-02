RULES:
1. interface cannot be instantiated directly
2. interface is not required to have any method
3. interface may not be marked as final/private/protected
4. all top-level(not inner) interfaces are assumed to have public/default access and must include ABSTRACT modifier
5. all non default methods in interface are assumed to have abstract and public modifiers
6. marking method final/protected/private will trigger compiler error
7. if one interface extends another interface, as well as the abstract class implements interface, inherits all abstract methods
8. first concrete class implements interface or extends abstract class which implements interface must implement all,
   of the inherited abstract methods
9. interface may extend many interfaces
10. when abstract class implements interface it is not required to provide implements for abstract methods
11. class implements interface, likewise interface extends interface, interface cannot extend a class
12. if one class implements two interfaces with the completely similar method it will take the second one
13. if there are two methods with the same name but different method signature it will consider like method overloading
14. if there are methods with the same name and parameter list BUT DIFFERENT RETURN TYPES in two interfaces it will return
    COMPILER ERROR
15. if you define an interface or abstract class that inherits from two conflicting interfaces it will throw an exception
16. interface variables are assumed to be public, static, final and abstract, while making them private/protected will
    trigger error
17. value of the interface variable must be set when it is declared since it's marked as final
18. it is common to donate constant values with UPPERCASE LETTERS

DEFAULT INTERFACE METHODS
19. default method may be declared only within the interface not class or abstract class
20. method should mark with keyword 'default' and must be provided method body
