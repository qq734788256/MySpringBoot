package com.wyl.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by dfsj0317 on 2017/2/24.
 * 全局异常捕捉
 * ControllerAdvice 是spring3.2提供的新注解，从名字上可以看出大体意思是控制器增强
 * Javadoc定义是
 * Indicates the annotated class assists a "Controller".
 *
 * <p>Serves as a specialization of {@link Component @Component}, allowing for
 * implementation classes to be autodetected through classpath scanning.
 * <p>It is typically used to define {@link ExceptionHandler @ExceptionHandler},
 * {@link InitBinder @InitBinder}, and {@link ModelAttribute @ModelAttribute}
 * methods that apply to all {@link RequestMapping @RequestMapping} methods.
 *
 * 即把@ControllerAdvice注解内部使用@ExceptionHandler、@InitBinder、@ModelAttribute注解的方法应用到所有的 @RequestMapping注解的方法
 *
 * 个人理解的就是把 用@ControllerAdvice注解的类内 使用@ExceptionHandler、@InitBinder、@ModelAttribute注解的方法应用到所有的 @RequestMapping注解的方法
 *
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {

    // 更精确的捕捉异常
//    @ResponseStatus(value= HttpStatus.CONFLICT, reason="Data integrity violation")  // 409
//    @ExceptionHandler(DataIntegrityViolationException.class)
//    public void conflict() {
//        // Nothing to do
//    }
//
//    @ExceptionHandler({SQLException.class,DataAccessException.class})
//    public String databaseError() {
//        // Nothing to do.  Returns the logical view name of an error page, passed to
//        // the view-resolver(s) in usual way.
//        // Note that the exception is _not_ available to this view (it is not added to
//        // the model) but see "Extending ExceptionHandlerExceptionResolver" below.
//        return "databaseError";
//    }

    @ExceptionHandler(value = Exception.class)
    public void defaultErrorHandler(HttpServletRequest request, Exception e) {
        //打印异常信息：
        System.out.println("This is exception : ");
        e.printStackTrace();
        /**
        * 返回json数据或者String数据：
        * 那么需要在方法上加上注解：@ResponseBody
        * 添加return即可。
        */

        /**
        * 返回视图：
        * 定义一个ModelAndView即可，
        * 然后return;
        * 定义视图文件(比如：error.html,error.ftl,error.jsp);
        *
        */
    }

}
