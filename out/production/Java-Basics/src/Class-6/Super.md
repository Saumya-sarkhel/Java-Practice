
## Note:-
1. Whenever you call an object, it will create a constructor of a class.
2. When we create an object of a class that it calls the constructor of a sub-class as well as a constructor of a superclass.
3. If you do not pass any value in an object, then it will call the default constructor of a class.
4. But if you pass the value in an object, then it will call the parameterised constructor of that class.

## Super() method:-
1. Every constructor in Java has a method, even if you do not mention it.
2. By default, the first statement in every constructor is a method called a super() method.
3. Super() method means calls the constructor of a superclass.
4. If you do not pass any parameter in a super method, then it will call the default constructor of a superclass.
5. If you pass any parameter in a super method, then it will call the parameterised constructor of a superclass.
6. To call the parameterised constructor of a parent class, we need to explicitly call the super method.

## Object class:-
1. Every class in Java extends the Object class, even if you do not mention it.
2. Object is a class in Java that contains a lot of methods.
3. So, the super method of a superclass calls the constructor of an object class.
4. There is multi-level inheritance in this concept.

## This() method:-
1. this() method calls the constructor of the same class.
2. If you do not pass any parameter in this method, then it will call the default constructor of the same class.
3. If you pass any parameter in this method, then it will call the parameterised constructor of the same class.

## Similarities in between this() and super() method:-
1. We can use both this and super method anywhere except the static area.
2. Both this and super method can be used any number of times in a code.
3. But both can be used only one time inside a constructor.
4. Both are non-static keywords.
