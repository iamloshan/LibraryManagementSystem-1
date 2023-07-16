import java.util.ArrayList; 
import java.util.List; 
public class LibraryManagementSystem { 
     public static void main(String[] args) { 

         Magazine Magazine1 = new Magazine("The Catcher in the Rye", "B001", "J.D. Salinger"," 240"); 
         Magazine Magazine2 = new Magazine("To Kill a Mockingbird", "B002", "Harper Lee"," 281"); 
         Magazine Magazine3 = new Magazine("1984", "B003", "George Orwell", "328"); 
         Magazine Magazine4 = new Magazine("Pride and Prejudice", "B004", "Jane Austen"," 432"); 
         Magazine Magazine5 = new Magazine("The Hobbit", "B005", "J.R.R. Tolkien"," 320"); 
  
   
         Magazine magazine1 = new Magazine("National Geographic", "M001", "August 2023", "National Geographic Society"); 
         Magazine magazine2 = new Magazine("Time", "M002", "September 2023", "Time USA, LLC"); 
         Magazine magazine3 = new Magazine("Forbes", "M003", "June 2023", "Forbes Media"); 
         Magazine magazine4 = new Magazine("Vogue", "M004", "July 2023", "Condé Nast"); 
         Magazine magazine5 = new Magazine("Sports Illustrated", "M005", "July 2023", "Maven Coalition"); 
  
   
         LibraryMember member1 = new LibraryMember("L001", "John Doe"); 
         LibraryMember member2 = new LibraryMember("L002", "Jane Smith"); 
         LibraryMember member3 = new LibraryMember("L003", "David Johnson"); 
         LibraryMember member4 = new LibraryMember("L004", "Sarah Williams"); 
         LibraryMember member5 = new LibraryMember("L005", "Michael Brown"); 
  
     
  
         
         Magazine1.checkOut(); 
         Magazine1.checkIn(); 
  
        
         List<LibraryItem> libraryItems = new ArrayList<>(); 
         libraryItems.add(Magazine1); 
         libraryItems.add(Magazine2); 
         libraryItems.add(Magazine3); 
         libraryItems.add(Magazine4); 
         libraryItems.add(Magazine5); 
         libraryItems.add(magazine1); 
         libraryItems.add(magazine2); 
         libraryItems.add(magazine3); 
         libraryItems.add(magazine4); 
         libraryItems.add(magazine5); 
  
  System.out.println("---------------------------------------------------------------------------------");
  
         System.out.println("Library Items:"); 
         for (LibraryItem item : libraryItems) { 
             item.displayItemDetails(); 
             System.out.println(); 
         } 
  
         List<LibraryMember> libraryMembers = new ArrayList<>(); 
         libraryMembers.add(member1); 
         libraryMembers.add(member2); 
         libraryMembers.add(member3); 
         libraryMembers.add(member4); 
         libraryMembers.add(member5); 
		 
  System.out.println("-----------------------------------------------------------------------------------");
  
         System.out.println("Library Members:"); 
         for (LibraryMember member : libraryMembers) { 
             member.displayMemberDetails(); 
             System.out.println(); 
         } 
     } 
 }