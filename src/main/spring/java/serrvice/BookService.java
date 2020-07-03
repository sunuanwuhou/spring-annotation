package spring.java.serrvice;

import org.springframework.stereotype.Service;
import spring.java.repository.BookRepositry;

import javax.annotation.Resource;

/**
 * @author qiumeng
 * @version 1.0
 * @description
 * @date 2020/7/1 11:24
 */
@Service
public class BookService {



    // @Autowired(required = false)
    // @Qualifier("bookRepositry")
    // @Autowired
    @Resource
    private BookRepositry bookRepositry;

    @Override
    public String toString() {
        return "BookService{" +
                "bookRepositry=" + bookRepositry +
                '}';
    }
}
