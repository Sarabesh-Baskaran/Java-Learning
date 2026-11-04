/*
* Collection Framework is a ready-made architecture of Interface and Classes. It is present in Java.util package
* Advantage:-
* 1)Collections can grow and shrink their size automatically.
* 2)Sorting, Searching, Shuffling and reversing via Collection utility class.
* 3)Type Safety with Generics
* 4)Collections stores objects like non-primitive datatype. It never stores primitive datatype
* As of autoboxing, int becomes integer. so we could never use int.
*
* Collection and Collections are not same.
*
* Collection - Interface
*Collection<String> list = new ArrayList<>();
list.add("Java");
list.add("Multithreading");
*
*
* Collections - An utility class
* List<Integer> numbers = new ArrayList<>(List.of(5, 3, 9, 1));

// Using the Collections utility class to sort the list
Collections.sort(numbers);

// Using it to reverse the list
Collections.reverse(numbers);

*List, Set and Queue are child of Collection Interface. but, map is not because it contains key value pair.
* Classes like ArrayList, LinkedList, HashSet and vector implement the collection interface.*/