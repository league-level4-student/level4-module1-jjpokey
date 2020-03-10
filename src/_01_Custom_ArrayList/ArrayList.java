package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	
	T[] array;
	
	public ArrayList() {
		//original
		array = (T[]) new Object[0]; //important
		
		}
	
	
	public T get(int loc) throws IndexOutOfBoundsException {

		return array[loc];
	}
	
	public void add(T val) {
		//replace code
		T[] arrayreplace;
				arrayreplace = (T[]) new Object[array.length + 1];
				for(int i = 0; i < array.length; i++) {
					arrayreplace[i] = array[i];
				}
				arrayreplace[array.length] = val;
				array = arrayreplace;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] arraycopy;
		arraycopy = (T[]) new Object[array.length + 1];
		for(int i = 0; i < array.length + 1; i++) {
			if(i == loc) {
				arraycopy[i] = val;
			}
			else if(i < loc){
			arraycopy[i] = array[i];
			}
			else {
				arraycopy[i] = array[i - 1];
			}
		}
		array = arraycopy;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		T[] arraycopy;
		arraycopy = (T[]) new Object[array.length];
		for(int i = 0; i < array.length; i++) {
			arraycopy[i] = array[i];
			if(i == loc) {
				arraycopy[i] = val;
			}
		}
		array = arraycopy;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		int skipped = 0;
		T[] arraycopy;
		arraycopy = (T[]) new Object[array.length - 1];
		for(int i = 0; i < array.length - 1; i++) {
			if(i == loc) {
				arraycopy[i] = array[i + 1];
				skipped = 1;
			}
			else if(skipped == 1){
			arraycopy[i] = array[i + 1];
			}
			else {
				arraycopy[i] = array[i];
			}
		}
		array = arraycopy;
	}
	
	public boolean contains(T val) {
		int contains = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == val) {
				contains = 1;
			}
		}
		if(contains > 0) {
			return true;
		}
		else {
		return false;
		}
	}
	public int size() {
		int counter = 0;
		for(int i = 0; i < array.length; i++) {
			counter++;
		}
		return counter;
	}
}