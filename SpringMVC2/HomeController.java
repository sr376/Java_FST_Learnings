public class HomeController
{
  @RequestMapping("/")
  public String home(){
    return "index";
  }
  @RequestMapping("add")
  public String add(@RequestParam("num1") int i,@RequestParam("num2") int j){
    ModelAndView mv = new ModelAndView();
    mv.setViewName("result");
    int num3 = i+j;
    session.setAttribute("num3", num3);
   
  
    return mv;
  }
}
