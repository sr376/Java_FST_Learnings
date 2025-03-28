
@Controller
public class HomeController
{
@RequestMapping("/")
public String home()
{
return "index";
}
@RequestMapping("add")
public String add (@RequestParam("num1") int i,@RequestParam("num2") int j, Model m)
{
int num3i+ j;
m.addAttribute("num3", num3);
return "result";
}
I.
@RequestMapping ("addAlien")
public String addAlien (Alien al, Model m)
{
}
}
m.addAttribute("alien", a);
return "result";
