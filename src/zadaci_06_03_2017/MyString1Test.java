package zadaci_06_03_2017;

public class MyString1Test {

	public static void main(String[] args) {
		
				char[] prvi = {'T', 'u', 'Z', 'L','a'};
				char[] drugi = {'z', 'a', 'G', 'r', 'E','B'};

				// Create two MyString1 objects
				MyString1 str = new MyString1(prvi);
				MyString1 str2 = new MyString1(drugi);

				// Display character at index 1 of MyString1 object 1
				System.out.println("\nCharacter at index 1 of MyString1 object 1: " + str.charAt(1));

				// Display the length of MyString1 object 1
				System.out.println("\nLength of MyString1 object 1: " + str.length());


				// Display a Substring from index 2 to 4 of MyString1 object 1
				System.out.println("\nSubstring from index 2 to 4 of MyString1 object 1: ");
				MyString1 substr = str.substring(2,4);
				for (int i = 0; i < substr.length(); i++) {
					System.out.print(substr.charAt(i));		
				}
				System.out.println();

				// Display MyString1 object 1 as lowercase:"
				System.out.println("\nMyString1 object 1 to lowercase:");
				MyString1 lower = str.toLowerCase();
				for (int i = 0; i < lower.length(); i++) {
					System.out.print(lower.charAt(i));		
				}
				System.out.println();

				// Test if MyString1 object 1 is equal to MyString1 object 2
				System.out.println("\nMyString1 object 1 is equal to MyString1 object 2? " 
					+ str.equals(str2));

				// Display the integer 145 as a MyString1 object
				System.out.println("\nDisplay the integer 145 as a MyString1 object: ");
				MyString1 value = str.valueOf(145);
				for (int i = 0; i < value.length(); i++) {
					System.out.print(value.charAt(i));		
				}
				System.out.println();

			}
		}