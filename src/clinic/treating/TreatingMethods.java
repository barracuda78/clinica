package clinic.treating;

public enum TreatingMethods {
    PILL("Пилюля", 3){
        @Override
        public void heal(){
            System.out.println("Принимаем таблетки");
        }
    },
    INJECTION("Инъекция", 5){
        @Override
        public void heal(){
            System.out.println("Делаем уколы");
        }
    },
    CREMATION("Кремация", 1){
        @Override
        public void heal(){
            System.out.println("Извините. Мы Вас сожгли.");
        }
    };
    
    private String message;
    private int repeats;

    private TreatingMethods(String message, int repeats) {
        this.message = message;
        this.repeats = repeats;
    }
    
    public abstract void heal();

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
            if(m.getRepeats() == 2 || m.getRepeats() == 3 || m.getRepeats() == 4){
                System.out.println(m.getMessage() + " : " + m.getRepeats() + " раза в день.");
                m.heal();
            }
            else
                System.out.println(m.getMessage() + " : " + m.getRepeats() + " раз в день.");
        }
    }
}
