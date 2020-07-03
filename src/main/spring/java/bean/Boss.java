package spring.java.bean;

/**
 * @author qiumeng
 * @version 1.0
 * @description
 * @date 2020/7/3 19:37
 */

//默认在ioc容器中的组件，启动会默认调用无参构造创建对象，在进行初始化赋值
// @Component
public class Boss {

    public Boss() {
    }

    public Boss(BookNot bookNot) {
        this.bookNot = bookNot;
    }

    private  BookNot bookNot;

    public BookNot getBookNot() {
        return bookNot;
    }

    // @Autowired
    public void setBookNot(BookNot bookNot) {
        this.bookNot = bookNot;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "bookNot=" + bookNot +
                '}';
    }
}
