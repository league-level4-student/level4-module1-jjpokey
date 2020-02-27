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
		//here
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		
	}
	
	public boolean contains(T val) {
		
		return false;
	}
}