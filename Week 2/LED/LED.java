public class LED {
    
    private int red;
    private int blue;
    private int green;
    private int dimmer;
    
    public LED() {
        red = 0;
        blue = 0;
        green = 0;
        dimmer = 0;
    }
    
    public void setRed(int red){
        this.red = red;
    }
    
    public int getRed(){
        return red;
    }

    public void setBlue(int blue){
        this.blue = blue;
    }

    public int getBlue(){
        return blue;
    }

    public void setGreen(int green){
        this.green = green;
    }

    public int getGreen(){
        return green;
    }

    public void setDimmer(int dimmer){
        this.dimmer = dimmer;
    }

    public int getDimmer(){
        return dimmer;
    }
    
    public boolean setColorFromName(String color){
        switch (color) {
            case "red":
                setRed(255);
                setBlue(0);
                setGreen(0);
                break;
            case "blue":
                setRed(0);
                setBlue(255);
                setGreen(0);
                break;
            case "green":
                setRed(0);
                setBlue(0);
                setGreen(255);
                break;
            case "purple":
                setRed(255);
                setBlue(255);
                setGreen(0);
                break;
            case "orange":
                setRed(255);
                setBlue(0);
                setGreen(165);
                break;
            case "sun":
                setRed(201);
                setBlue(0);
                setGreen(141);
                break;
            default:
                return false;
        }
        return true;
    }
    public boolean dimmerPrecentage (int percentage)
    {
        if (percentage <= 100 && percentage > 1) {
            int dimmedBy = (int) (percentage / 100.0) * 255;
            setDimmer(dimmedBy);
            return true;
        }
        else
        {
            return false;
        }
    }
}

