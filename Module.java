/**
 * Lab 02: First Java Application - Module Class
 * This class models a university module with title, CRN, and assessment type.
 * Demonstrates ENCAPSULATION: private fields with public getters/setters.
 */
public class Module {

    // =========================================================================
    // FIELDS (PRIVATE - ENCAPSULATION)
    // =========================================================================

    private String title;      // Stores the module title (e.g., "Object Oriented Programming")
    private int CRN;           // Stores the Course Reference Number (must be 10000-99999)
    private boolean IsCA;      // IsCA = evaluated by continuous assessment (true) or exam (false)

    // =========================================================================
    // CONSTRUCTOR - Creates new Module objects
    // =========================================================================
    /**
     * Constructor creates a new Module object with initial values.
     * If CRN is not between 10000 and 99999, it's set to 10000.
     *
     * @param title The title of the Module
     * @param CRN The CRN of the module (10000-99999, otherwise set to 10000)
     * @param IsCA Whether module is evaluated by continuous assessment (true/false)
     */
    public Module(String title, int CRN, boolean IsCA) {
        // 'this' keyword refers to the current object's fields
        // Without 'this', parameter names would shadow the field names
        this.title = title;  // Assign parameter 'title' to field 'this.title'
        this.IsCA = IsCA;    // Assign parameter 'IsCA' to field 'this.IsCA'

        // CRN VALIDATION: Check if CRN is between 10000 and 99999 inclusive
        if (CRN >= 10000 && CRN <= 99999) {
            this.CRN = CRN;  // Valid CRN - assign it directly
        } else {
            this.CRN = 10000; // Invalid CRN - set to default 10000 as per spec
        }
    }

    // =========================================================================
    // GET METHODS - Provide read-only access to private fields (ENCAPSULATION)
    // =========================================================================

    /**
     * Getter method for the title field.
     * @return The current title of the module
     */
    public String getTitle() {
        return title;  // Returns the value of the private 'title' field
    }

    /**
     * Getter method for the CRN field.
     * @return The current CRN of the module
     */
    public int getCRN() {
        return CRN;  // Returns the value of the private 'CRN' field
    }

    /**
     * Getter method for the IsCA field.
     * @return true if module is continuous assessment, false if exam-based
     */
    public boolean getIsCA() {
        return IsCA;  // Returns the value of the private 'IsCA' field
    }

    // =========================================================================
    // SET METHODS - Provide controlled write access to private fields
    // =========================================================================

    /**
     * Setter method for the title field.
     * @param title The new title for the module
     */
    public void setTitle(String title) {
        this.title = title;  // 'this.title' refers to field, 'title' refers to parameter
    }

    /**
     * Setter method for the CRN field with validation.
     * If CRN is not between 10000 and 99999, it's set to 10000.
     * @param CRN The new CRN for the module
     */
    public void setCRN(int CRN) {
        // Validate the new CRN value
        if (CRN >= 10000 && CRN <= 99999) {
            this.CRN = CRN;  // Valid - assign it
        } else {
            this.CRN = 10000; // Invalid - set to default 10000
        }
    }

    /**
     * Setter method for the IsCA field.
     * @param IsCA The new assessment type (true for CA, false for exam)
     */
    public void setIsCA(boolean IsCA) {
        this.IsCA = IsCA;  // Update the assessment type
    }

    // =========================================================================
    // EXTRA FUNCTIONALITY - Business logic methods
    // =========================================================================

    /**
     * Counts the number of vowels in the module title.
     * Vowels are: a, e, i, o, u (both lowercase and uppercase)
     * Example: "Object Oriented Programming" has 8 vowels
     *
     * @return The number of vowels in the title
     */
    public int numVowelsOnTitle() {
        // Define what characters are considered vowels
        String vowels = "aeiouAEIOU";  // All vowel characters (lowercase and uppercase)

        // Get the current title using the getter method
        String title = getTitle();  // Could also use 'this.title' directly

        // Initialize a counter to track how many vowels we find
        int vowelCounter = 0;  // Start at 0

        // Loop through each character in the title string
        // title.length() returns the number of characters in the string
        for (int i = 0; i < title.length(); i++) {
            // Get the character at position 'i' in the string
            // Strings are 0-indexed: first character is at position 0
            char c = title.charAt(i);  // 'char' is a primitive type for single characters

            // Check if this character is a vowel
            // indexOf() returns the position of 'c' in the vowels string
            // Returns -1 if 'c' is NOT found in the vowels string
            if (vowels.indexOf(c) != -1) {
                vowelCounter++;  // Found a vowel! Increment counter by 1
                // ++ is the increment operator: vowelCounter = vowelCounter + 1
            }
            // If not a vowel, do nothing and continue loop
        }

        // Return the final count of vowels
        return vowelCounter;  // This value goes back to whatever called this method
    }

}  // End of Module class