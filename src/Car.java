public class Car {
    private String color;
    private int doors;
    private boolean autoWindows;

    public Car(String color, int doors){
        this.color = color;
        this.doors = doors;
    }

    public Car(String color, int doors, boolean autoWindows){
        this.color = color;
        this.doors = doors;
        this.autoWindows = autoWindows;
    }

    public Car(){

    }

    public String getColor(){
        return color;
    }

    public int getDoors(){
        return doors;
    }
   
    public boolean windowGoVrr(){
        return autoWindows;
    }

    public void setColor(String color){
        this.color = color;
    }
    public void setDoors(int doors){
        this.doors = doors;
    }
    public void setAutoWindows(boolean autoWindows){
        this.autoWindows = autoWindows;
    }

    public boolean isItHot(){
        if(color == "red" && doors == 2 && autoWindows == true){
            return true;
        } else {
            return false;
        }
    }

    public String tellMe(){
        if (isItHot() == true){
            return "It's Hot";
        } else {
            return "It's Not";
        }
    }
    
    


}
