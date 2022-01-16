package com.ssm.resolver;

/**
 * 自定义异常处理器
 */
/*public class DesignExceptionResolver implements HandlerExceptionResolver {
    *//**
     * 参数 Exception:异常对象
     * 返回值 ModelAndView:跳转到的错误视图信息
     *//*
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        if(e instanceof DesignException){
            modelAndView.addObject("info","Design Exception!");
        }else if(e instanceof NullPointerException){
            modelAndView.addObject("info","NullPointerException!");
        }
        modelAndView.setViewName("/WEB-INF/views/error");
        return modelAndView;
    }
}*/
