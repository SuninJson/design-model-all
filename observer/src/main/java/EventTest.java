import com.google.common.eventbus.EventBus;

public class EventTest {
    public static void main(String[] args) {
        AnswerPeople tom = new AnswerPeople("Tom");
        AnswerPeople jim = new AnswerPeople("Jim");

        EventBus eventBus = new EventBus();
        eventBus.register(tom);
        eventBus.register(jim);

        Question question = new Question();
        question.questionName = "关于观察者模式的问题";
        question.description = "观察者模式适用什么场景";

        eventBus.post(question);
    }
}
