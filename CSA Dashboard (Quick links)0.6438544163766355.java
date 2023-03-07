
Assuming the quick links to be displayed in the dashboard are:
1. Products 
2. Special Offers 
3. Orders 
4. New Order 
5. Import Stock 
6. Add Buyer 
7. Viewers

Spring Boot application with controller, service and repository classes:

Controller Class:

@Controller
public class CSADashboardController {
 
    @Autowired
    private CSADashboardService csaDashboardService;
 
    @GetMapping("/dashboard")
    public String getDashboard(){
        return "dashboard";
    }
 
    @GetMapping("/products")
    public String getProducts(){
        return "products";
    }
 
    @GetMapping("/specialOffers")
    public String getSpecialOffers(){
        return "specialOffers";
    }
 
    @GetMapping("/orders")
    public String getOrders(){
        return "orders";
    }
 
    @GetMapping("/newOrder")
    public String getNewOrder(){
        return "newOrder";
    }
 
    @GetMapping("/importStock")
    public String getImportStock(){
        return "importStock";
    }
 
    @GetMapping("/addBuyer")
    public String getAddBuyer(){
        return "addBuyer";
    }
 
    @GetMapping("/viewers")
    public String getViewers(){
        return "viewers";
    }
}

Service Class:

@Service
public class CSADashboardService {
 
    @Autowired
    private CSADashboardRepository csaDashboardRepository;
 
    public CSADashboard getDashboard(){
        return csaDashboardRepository.findByName("dashboard");
    }
 
    public CSADashboard getProducts(){
        return csaDashboardRepository.findByName("products");
    }
 
    public CSADashboard getSpecialOffers(){
        return csaDashboardRepository.findByName("specialOffers");
    }
 
    public CSADashboard getOrders(){
        return csaDashboardRepository.findByName("orders");
    }
 
    public CSADashboard getNewOrder(){
        return csaDashboardRepository.findByName("newOrder");
    }
 
    public CSADashboard getImportStock(){
        return csaDashboardRepository.findByName("importStock");
    }
 
    public CSADashboard getAddBuyer(){
        return csaDashboardRepository.findByName("addBuyer");
    }
 
    public CSADashboard getViewers(){
        return csaDashboardRepository.findByName("viewers");
    }
}

Repository Class:

@Repository
public interface CSADashboardRepository extends JpaRepository<CSADashboard, Long> {
 
    CSADashboard findByName(String name);
}