public class Photo {
    private int width;
    private int length;
    private int dpi;
    private String desc;
    private int peopleInPicture;
    
    public Photo(int width, int length, int dpi, String desc, int peopleInPicture){
        this.width = width;
        this.length = length;
        this.dpi = dpi;
        this.desc = desc;
        this.peopleInPicture = peopleInPicture;
    }
    
    public void setWidth(int width){
        this.width = width;
    }
    
    public int getWidth(){
        return width;
    }

    public void setLength(int length){
        this.length = length;
    }

    public int getLength(){
        return length;
    }

    public void setDpi(int dpi){
        this.dpi = dpi;
    }

    public int getDpi(){
        return dpi;
    }

    public void setDesc(String desc){
        this.desc = desc;
    }

    public String getDesc(){
        return desc;
    }

    public void setPeopleInPicture(int peopleInPicture){
        this.peopleInPicture = peopleInPicture;
    }

    public int getPeopleInPicture() {
        return peopleInPicture;
    }

    public boolean isPrintable(){
        int h = 585;
        int w = 878;
        int d = 150;
        
        if(length >= h && width >= w && dpi > d) {
           return true;
        }
        else {
            return false;
        }
        
    }

}
