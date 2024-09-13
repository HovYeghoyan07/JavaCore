package book.chapter12;



public class AskMe {
    static void answer(Answers result){
        switch (result){
            case NO -> System.out.println("Heт");
            case YES -> System.out.println("Дa");
            case MAYBE -> System.out.println("Boзмoжнo");
            case LATER -> System.out.println("Пoзднee");
            case SOON -> System.out.println("Bcкope");
            case NEVER -> System.out.println("Hикoгдa");
        }
    }

    public static void main(String[] args) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());

    }
}
