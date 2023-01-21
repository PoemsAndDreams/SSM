package com.yutian.spring.service.impl;

import com.yutian.spring.dao.BookDao;
import com.yutian.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

@Service
/**
 * 声明式事务的配置步骤：
 * 1、在Spring的配置文件中配置事务管理器
 * 2、开启事务的注解驱动
 * 在需要被事务管理的方法上，添加@Transactional注解，该方法就会被事务管理
 * @Transactional注解标识的位置：
 * 1、标识在方法上
 * 2、标识在类上，则类中所有的方法都会被事务管理
 */
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;
    //使用@Transactional注解所标识的方法或类中所有的方法使用事务进行管理
//    @Transactional(
//            readOnly = false,//只有一个查询操作来说，才可把它设置成只读，
//            timeout = 3,//超时回滚，释放资源。
//            rollbackFor属性：需要设置一个Class类型的对象
//            rollbackForClassName属性：需要设置一个字符串类型的全类名
//            noRollbackFor属性：需要设置一个Class类型的对象
//            rollbackFor属性：需要设置一个字符串类型的全类名
//            java.lang.ArithmeticException 算术异常

//            noRollbackFor = ArithmeticException.class//注解中为数组中只有一个值，可不加{ }
//            noRollbackForClassName = "java.lang.ArithmeticException"
//    )


//    @Transactional(isolation = Isolation.DEFAULT)//使用数据库默认的隔离级别
//    @Transactional(isolation = Isolation.READ_UNCOMMITTED)//读未提交
//    @Transactional(isolation = Isolation.READ_COMMITTED)//读已提交
//    @Transactional(isolation = Isolation.REPEATABLE_READ)//可重复读
//    @Transactional(isolation = Isolation.SERIALIZABLE)//串行化

    @Override
    public void buyBook(Integer userId, Integer bookId) {

//        try {
//            //睡眠5秒
//            //TimeUnit.MICROSECONDS.sleep(5);//分
//            TimeUnit.SECONDS.sleep(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


        //查询图书的价格
        Integer price = bookDao.getPriceByBookId(bookId);
        //更新图书的库存
        bookDao.updateStock(bookId);
        //更新用户的余额
        bookDao.updateBalance(userId, price);


//        System.out.println(1/0);
    }
}
