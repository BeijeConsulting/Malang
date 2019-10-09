package it.beije.malang;


interface Mammal extends Mam { public default String getName() { return null; } }

interface Mam { public default String getName() { return null; } }

abstract class Otter implements Mammal{
	
	
	
	
}