public class HomeController
{
  @RequestMapping("/")
  public String home(){
    return "index.jsp";
  }
  @RequestMapping("add")
  public String add(HttpServletRequest req){
    int i = Integer.parseInt(req.getParameter("num1"));
    int j = Integer.parseInt(req.getParameter("num2"));
    int num3 = i+j;
    HttpSession session = req.getSession();
    session.setAttribute("num3", num3);
    return "result.jsp";
  }
}

SpringMVC req param : 

public class HomeController
{
  @RequestMapping("/")
  public String home(){
    return "index.jsp";
  }
  @RequestMapping("add")
  public String add(@RequestParam("num1") int i,@RequestParam("num2") int j, HttpSession session){
    int num3 = i+j;
   
    session.setAttribute("num3", num3);
    return "result.jsp";
  }
}

Spring MVC Model and View

public class HomeController
{
  @RequestMapping("/")
  public String home(){
    return "index.jsp";
  }
  @RequestMapping("add")
  public String add(@RequestParam("num1") int i,@RequestParam("num2") int j){
    ModelAndView mv = new ModelAndView();
    mv.setViewName("result.jsp");
    int num3 = i+j;
   
    mv.addObject("num3", num3);
    return mv;
  }
}

..



  
