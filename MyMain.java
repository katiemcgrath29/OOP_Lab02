
/**
 * The class tests the functionality of Lab02_GroupA.
 * @author Ignacio.Castineiras
 * @student Katie.McGrath
 */

public class MyMain {

    //--------------------------------------------------
    //	testClassModule
    //--------------------------------------------------

    /**
     * This function tests the functionality of the class Module.<br>
     */


    public static void testClassModule(){
        System.out.println("\n------------------------------\n\n   TESTING CLASS MODULE\n\n------------------------------\n");

        //1. We create some Module objects.
        System.out.println("\n----------- 1. Module instances creation -----------");

        //1.1. A first Module, with title "Object Oriented Programming", CRN 15701 and assignment-based evaluation.
        Module o1 = new Module("Object Oriented Programming", 15701, true);

        //1.2. A first Module, with title "Linear Data Structures and Algorithms", CRN 26517 and exam-based evaluation.
        Module o2 = new Module("Linear Data Structures and Algorithms", 8123, false);

        //2. We use our objects to call to the getMethods.
        System.out.println("\n----------- 2. Module test for getMethods -----------");

        //2.1. Check the fields of o1.
        System.out.println("\n--- The value of the field 'title' in o1 is = ");
        String myTitle = o1.getTitle();
        System.out.println(myTitle);

        System.out.println("\n--- The value of the field 'CRN' in o1 is = ");
        int myCRN = o1.getCRN();
        System.out.println(myCRN);

        System.out.println("\n--- The value of the field 'isCA' in o1 is = ");
        boolean myIsCA = o1.getIsCA();
        System.out.println(myIsCA);

        //2.2. Check the fields of o2.
        System.out.println("\n--- The value of the field 'title' in o2 is = ");
        myTitle = o2.getTitle();
        System.out.println(myTitle);

        System.out.println("\n--- The value of the field 'CRN' in o2 is = ");
        myCRN = o2.getCRN();
        System.out.println(myCRN);

        System.out.println("\n--- The value of the field 'isCA' in o2 is = ");
        myIsCA = o2.getIsCA();
        System.out.println(myIsCA);

        //3. We use our objects to call to the setMethods.
        System.out.println("\n----------- 3. Module test for setMethods -----------");

        // 3.1. We modify the values of o2
        o1.setTitle("OO Analysis and Design");
        o1.setCRN(150000);
        o1.setIsCA(false);

        System.out.println("\n--- The value of the field 'title' in o1 is = ");
        myTitle = o1.getTitle();
        System.out.println(myTitle);

        System.out.println("\n--- The value of the field 'CRN' in o1 is = ");
        myCRN = o1.getCRN();
        System.out.println(myCRN);

        System.out.println("\n--- The value of the field 'isCA' in o1 is = ");
        myIsCA = o1.getIsCA();
        System.out.println(myIsCA);

        //4. We use our objects to call to the extra functionality.
        System.out.println("\n----------- 4. Module test extra methods -----------");

        // 4.1. We test the method increaseBoldnessLevel
        System.out.println("\n--- Testing numVowelsOnTitle");
        int value = o1.numVowelsOnTitle();
        System.out.println(value);
        value = o2.numVowelsOnTitle();
        System.out.println(value);
    }


    //--------------------------------------------------
    //	MAIN
    //--------------------------------------------------
    /**
     * Main Method:<br>
     * 1) It calls to drinkFunctionality.<br>
     * The function shows the main class and object-related concepts we must know for the module.<br>
     * 2) It calls to refVarsFunctionality.<br>
     * The function shows the main primitive vs. reference variables concepts we must know for the module.<br>
     * @param args: We will run the program parameter free, so do not worry about it.
     */
    public static void main(String[] args) {
        // 1. We parse any parameter in
        int option = 2;

        // 2. We call to the method we are interested into
        testClassModule();
    }

}