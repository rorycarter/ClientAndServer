package com.roryCarter;

import com.google.gson.Gson;
import com.roryCarter.Domain.*;
import com.roryCarter.Factory.*;
import com.roryCarter.Services.BudgetService;
import com.roryCarter.Services.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;


@Controller
@RequestMapping(path="/Life")
public class CarterApp {


    @Autowired
    private EmployeeServiceImpl employeeService;

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private AdminServiceImpl adminService;

    @Autowired
    private BudgetServiceImpl budgetService;

    @Autowired
    private ContactServiceImpl contactService;




    //@Autowired
   // private FoodsServiceImpl foodsService;

//---admin
@GetMapping(path = "/addAdmin/{adminId}/{adminName}/{adminPassword}")
public @ResponseBody
String addAdmin(@PathVariable String adminId, @PathVariable String adminName, @PathVariable String adminPassword) {
    Admin admin = AdminFactory.buildAdmin(adminId, adminName, adminPassword);
    adminService.save(admin);
    return new Gson().toJson(admin);
}

    @GetMapping(path = "/readAdmin/{adminId}")
    public @ResponseBody
    String readAdmin(@PathVariable String adminId) {
        Admin admin = adminService.findById(adminId);
        return new Gson().toJson(admin);
    }


    @GetMapping(path = "/updateAdmin/{adminId}/{adminName}/{adminPassword}")
    public @ResponseBody String updateAdmin(@PathVariable String adminId, @PathVariable String adminName, @PathVariable String adminPassword)
    {
        Admin admin = adminService.findById(adminId);

        if(admin == null)
        {
            return new Gson().toJson("Record does not exist");
        }

        Admin adminInsert = AdminFactory.buildAdmin(adminId, adminName, adminPassword);
        adminService.update(adminInsert);
        return new Gson().toJson(adminInsert);
    }

    @GetMapping(path = "deleteAdmin/{adminId}")
    public @ResponseBody void deleteAdmin(@PathVariable String adminId) {
        Admin admin = adminService.findById(adminId);
        if (admin == null) {
            System.out.println("Record does not exist");
        } else {
            adminService.delete(admin);
            System.out.println("Record deleted");
        }
    }



//-------------------Budget

    @GetMapping(path = "/addBudget/{screenId}/{name}/{budget}/{foodPrices}")
    public @ResponseBody
    String addBudget(@PathVariable String screenId, @PathVariable String name,@PathVariable double budget, @PathVariable double foodPrices ) {
       Budget budget1 = BudgetFactory.buildBudget(screenId, name, budget, foodPrices);
        budgetService.save(budget1);
        return new Gson().toJson(budget1);



    }

    @GetMapping(path = "/readBudget/{screenId}")
    public @ResponseBody
    String readBudget(@PathVariable String screenId) {
        Budget budget = budgetService.findById(screenId);
        return new Gson().toJson(budget);

    }


    @GetMapping(path = "/updateBudget/{screenId}/{name}/{budget}/{foodPrices}")
    public @ResponseBody
    String updateBudget( @PathVariable String screenId, @PathVariable String name, @PathVariable Double budget,@PathVariable double foodPrices) {
        Budget budget1 = budgetService.findById(screenId);

        if (budget1 == null) {

            return new Gson().toJson("Non existent record");


        }
        Budget budgetInsert = BudgetFactory.buildBudget(screenId, name,budget, foodPrices);
        budgetService.update(budgetInsert);
        return new Gson().toJson(budgetInsert);

    }

    @GetMapping(path = "/deleteBudget/{screenId}")
    public @ResponseBody
    void deleteBudget(@PathVariable String screenId) {

        Budget budget = budgetService.findById(screenId);
        if (budget == null) {
            System.out.println("Record doesn't exist");

        } else {
            budgetService.delete(budget);
            System.out.println("Record deleted");
        }
    }

//----------Contact

    @GetMapping(path = "/addContact/{screenId}/{cellNo}/{email}/{query}")
    public @ResponseBody String addContact(@PathVariable String screenId, @PathVariable String cellNo, @PathVariable String email, @PathVariable String query) {
        Contact contact = ContactFactory.buildContact(screenId, cellNo, email, query);
        contactService.save(contact);
        return new Gson().toJson(contact);
    }

    @GetMapping(path="/readContact/{screenId}")
    public @ResponseBody String readContact(@PathVariable String screenId)
    {
        Contact contact=contactService.findById(screenId);
        return new Gson().toJson(contact);

    }


    @GetMapping (path="/updateContact/{screenId}/{cellNo}/{email}/{query}")
    public @ResponseBody String updateContact(@PathVariable String screenId, @PathVariable String cellNo, @PathVariable String email, @PathVariable String query)
    {
        Contact contact =contactService.findById(screenId);

        if(contact==null)
        {

            return new Gson().toJson("Non existent record");


        }
        Contact contactInsert= ContactFactory.buildContact(screenId,cellNo,email,query);
        contactService.update(contactInsert);
        return new Gson().toJson(contactInsert);

    }

    @GetMapping(path="/deleteContact/{screenId}")
    public @ResponseBody void deleteContact(@PathVariable String screenId) {

        Contact contact = contactService.findById(screenId);
        if (contact == null) {
            System.out.println("Record doesn't exist");

        }else{
            contactService.delete(contact);
            System.out.println("Record deleted");
        }


    }





    //-------------Employees

    @GetMapping(path="/addEmployee/{employeeId}/{firstName}/{lastName}/{password}/{jobDescription}")
    public @ResponseBody
    String addEmployee(@PathVariable String employeeId,@PathVariable String firstName, @PathVariable String lastName , @PathVariable String password, @PathVariable String jobDescription)
    {

        Employee employee= EmployeeFactory.buildEmployee(employeeId,firstName,lastName, password, jobDescription );
        employeeService.save(employee);
        return new Gson().toJson(employee);

    }
    @GetMapping(path="/readEmployee/{employeeId}")
    public @ResponseBody String readEmployee(@PathVariable String employeeId)
    {
        Employee employee=employeeService.findById(employeeId);
        return new Gson().toJson(employee);

    }
    @GetMapping (path="/updateEmployee/{employeeId}/{firstName}/{lastName}/{password}/{jobDescription}")
    public @ResponseBody String updateEmployee(@PathVariable String employeeId, @PathVariable String firstName, @PathVariable String lastName, @PathVariable String password,@PathVariable String jobDescription)

    {
        Employee employee=employeeService.findById(employeeId);

        if(employee==null)
        {

            return new Gson().toJson("Non existent record");


        }
        Employee employeeInsert= EmployeeFactory.buildEmployee(employeeId,firstName,lastName,password, jobDescription);
        employeeService.update(employeeInsert);
        return new Gson().toJson(employeeInsert);

    }

    @GetMapping(path="deleteEmployee/{screenId}")
    public @ResponseBody void deleteEmployee(@PathVariable String employeeId) {

        Employee employee = employeeService.findById(employeeId);
        if (employee == null) {
            System.out.println("Record doesn't exist");

        } else {
            employeeService.delete(employee);
            System.out.println("Record deleted");
        }


    }



    //----foods



    /*@GetMapping(path="/addFoods/{screenId}/{name}/{dietaryLaw}")
    public @ResponseBody String addFoods(@PathVariable String screenId, @PathVariable String name, @PathVariable String dietaryLaw )
    {
        Foods foods= FoodFactory.buildFoods(screenId,name,dietaryLaw);
        foodsService.save(foods);
        return new Gson().toJson(foods);



    }


    @GetMapping(path="readFoods/{screenId}")
    public @ResponseBody String readFoods(@PathVariable String screenId)
    {
        Foods foods=foodsService.findById(screenId);
        return new Gson().toJson(foods);

    }

    @GetMapping (path="/updateUser/{screenId}/{name}/{dietaryLaw}")
    public @ResponseBody String updateFoods(@PathVariable String screenId, @PathVariable String name ,@PathVariable String dietaryLaw)
    {
        Foods foods =foodsService.findById(screenId);

        if(foods==null)
        {

            return new Gson().toJson("Non existent record");


        }
        Foods foodsInsert= FoodFactory.buildFoods(screenId,name,dietaryLaw);
        foodsService.update(foodsInsert);
        return new Gson().toJson(foodsInsert);

    }
    @GetMapping(path="deleteFoods/{screenId}")
    public @ResponseBody void deleteFoods(@PathVariable String screenId) {

        User user = userService.findById(screenId);
        if (user == null) {
            System.out.println("Record doesn't exist");

        }else{
            userService.delete(user);
            System.out.println("Record deleted");
        }


    }
*/

    //-------------------User

    @GetMapping(path="/addUser/{screenId}/{userPassword}/{userFirstName}/{userLastName}/{userDietLaw}/{userDateJoined}/{userWeight}")
    public @ResponseBody String addUser(@PathVariable String screenId, @PathVariable String password, @PathVariable String firstName, @PathVariable String lastName, @PathVariable String dietLaw , @PathVariable Date dateJoined, @PathVariable double weight)
    {
        User user= UserFactory.buildUser(screenId,password,firstName,lastName,dietLaw,dateJoined,weight);
        userService.save(user);
        return new Gson().toJson(user);



    }
    @GetMapping(path="/readUser/{screenId}")
    public @ResponseBody String readUser(@PathVariable String screenId)
    {
        User user=userService.findById(screenId);
        return new Gson().toJson(user);

    }

    @GetMapping (path="/updateUser/{screenId}/{password}/{userFirstName}/{userLastName}/{dietLaw}/{dateJoined}/{weight}")
    public @ResponseBody String updateUser(@PathVariable String screenId, @PathVariable String password ,@PathVariable String firstName, @PathVariable String lastName,  @PathVariable String dietLaw, @PathVariable Date dateJoined, @PathVariable double weight)
    {
        User user =userService.findById(screenId);

        if(user==null)
        {

            return new Gson().toJson("Non existent record");


        }
        User userInsert= UserFactory.buildUser(screenId,password,firstName,lastName,dietLaw, dateJoined,weight);
        userService.update(userInsert);
        return new Gson().toJson(userInsert);

    }
    @GetMapping(path="/deleteUser/{screenId}")
    public @ResponseBody void deleteUser(@PathVariable String screenId) {

        User user = userService.findById(screenId);
        if (user == null) {
            System.out.println("Record doesn't exist");

        }else{
            userService.delete(user);
            System.out.println("Record deleted");
        }


    }










}
