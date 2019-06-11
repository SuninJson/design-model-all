import com.google.common.eventbus.Subscribe;

public class AnswerPeople {
    private String name;

    public AnswerPeople(String name) {
        this.name = name;
    }

    @Subscribe
    public void answer(Question question){
        System.out.println(String.format("我是%s",name));
        System.out.println(String.format("思考问题：%s",question.description));
        System.out.println(String.format("开始对问题<%s>进行回答",question.questionName));
    }
}
