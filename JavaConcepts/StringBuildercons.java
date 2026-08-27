package JavaConcepts;

public class StringBuildercons {
    
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Original StringBuilder: " + sb);
        
        // Append
        sb.append(", World!");
        System.out.println("After append: " + sb);
        
        // Insert
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);
        
        // Replace
        sb.replace(5, 10, " C++");
        System.out.println("After replace: " + sb);
        
        // Delete
        sb.delete(5, 10);
        System.out.println("After delete: " + sb);
        
        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}
