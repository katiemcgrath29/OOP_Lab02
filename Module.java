
public class Module {


    //---------------------------------------
    //	Fields
    //---------------------------------------

    private String title;
    private int CRN;
    private boolean IsCA; //IsCA = evaluated by continuous assessment (t/f)


    //---------------------------------------
    //	Constructor
    //---------------------------------------

    public Module(String title, int CRN, boolean IsCA) {
        this.title = title;
        this.CRN = CRN;
        this.IsCA = IsCA;
    }

    //---------------------------------------
    //	Get Methods
    //---------------------------------------

    public String getTitle() { return title; }
    public int getCRN() { return CRN; }
    public boolean getIsCA() { return IsCA; }



    //---------------------------------------
    //	Set Method
    //---------------------------------------

    public void setTitle(String title){this.title = title;}

    public void setCRN(int CRN){ this.CRN = CRN;}
    public void setIsCA(boolean IsCA){this.IsCA = IsCA;}

    //---------------------------------------
    //	Extra Functionality
    //---------------------------------------

    public int numVowelsOnTitle(){
        String vowels = "aeiouAEIOU";
        String title = getTitle();
        int vowelCounter = 0;

        for (int i = 0; i < title.length(); i++) {
            char c = title.charAt(i);
            if (vowels.indexOf(c) != -1) {
                vowelCounter++;
            }
        }
        return vowelCounter;
    }


}
