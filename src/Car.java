public class Car {
    private String code;
    private Routes routes;
    private int maximum_capacity;

    public Car(String code, Routes fixed_route, int maximum_capacity) throws Exception {
        this.code = code;
        this.routes = fixed_route;
        if (maximum_capacity >0){
            this.maximum_capacity=maximum_capacity;
        }
        else{
            throw new Exception("the car is full");
        }
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Routes getRoutes() {
        return routes;
    }

    public void setRoutes(Routes routes) {
        this.routes = routes;
    }

    public int getMaximum_capacity() {
        return maximum_capacity;
    }

    public void setMaximum_capacity(int maximum_capacity) throws Exception{
        if (maximum_capacity >0){
            this.maximum_capacity=maximum_capacity;
        }
        else{
            throw new Exception("the car is full");
        }
    }

}
