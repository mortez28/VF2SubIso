package infra;

public class attribute {

    private String attrName;
    private String attrValue;
    private boolean isNull;

    public attribute(String attrName,String attrValue)
    {
        this.attrName=attrName.toLowerCase();
        this.attrValue=attrValue.toLowerCase();
        isNull=false;
    }

    public attribute(String attrName)
    {
        this.attrName=attrName.toLowerCase();
        this.attrValue=null;
        isNull=true;
    }

    @Override
    public String toString() {
        if(!isNull)
            return "(" +
                    "'" + attrName + '\'' +
                    ", '" + attrValue + '\'' +
                    ')';
        else
            return "(" +
                    "'" + attrName + '\'' +
                    ", -" +
                    ')';
    }

    public String getAttrName() {
        return attrName;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public boolean isNull() {
        return isNull;
    }

    public void setAttrName(String attrName) { this.attrName = attrName.toLowerCase();}


    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue.toLowerCase();
    }
}
