package clinic.treating;

public enum TreatingMethods {
    PILL("Пилюля", 3),
    INJECTION("Инъекция", 5),
    CREMATION("Кремация", 1);
    
    private String message;
    private int repeats;

    private TreatingMethods(String message, int repeats) {
        this.message = message;
        this.repeats = repeats;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getRepeats() {
        return repeats;
    }

    public void setRepeats(int repeats) {
        this.repeats = repeats;
    }
    
    
    
    public static void main(String[] args){
        System.out.println("Привет из ENUM");
        
        for(TreatingMethods m : TreatingMethods.values()){
            System.out.println(m.getMessage());
        }
        

    }
}
